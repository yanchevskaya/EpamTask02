import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.function.Supplier;

/**
 * Created by Lizhen on 25.02.2017.
 */
public class ConnectionPool implements Supplier<Connection>, AutoCloseable{
    private BlockingQueue<Connection> connectionQueue;

    private static final String DB_DRIVER = "db.driver";
    private static final String DB_URL = "db.url";
    private static final String DB_USER = "db.user";
    private static final String DB_PASSWORD = "db.password";
    private static final String DB_POOL_SIZE = "db.poolsize";

    public ConnectionPool() {

        Properties properties = new Properties();
        try(FileInputStream fileInputStream = new FileInputStream(
                "src/main/resources/db.properties")){
            properties.load(fileInputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String url = properties.getProperty(DB_URL);
        String user = properties.getProperty(DB_USER);
        String password = properties.getProperty(DB_PASSWORD);
        int poolsize = Integer.parseInt(properties.getProperty(DB_POOL_SIZE, "5"));

        Locale.setDefault(Locale.ENGLISH);

        try {
            Class.forName(properties.getProperty(DB_DRIVER));
        } catch (ClassNotFoundException e) {
            try {
                throw new ConnectionPoolException("Can't find database driver class", e);
            } catch (ConnectionPoolException e1) {
                e1.printStackTrace();
            }
        }
            connectionQueue = new ArrayBlockingQueue(poolsize);
        try {
            for (int i = 0; i<poolsize; i++){
                Connection connection = DriverManager.getConnection(url,user,password);
                PooledConnection pooledConnection = new PooledConnection (connection);
                connectionQueue.add(pooledConnection);
            }
        }catch (SQLException e){
            try {
                throw new ConnectionPoolException("SQLException in ConnectionPool", e);
            } catch (ConnectionPoolException e2) {
                e2.printStackTrace();
            }
            }
        }

    private void dispose(){
        close();
    }

    @Override
    public void close(){
        try{
            Connection connection;
            while ((connection=connectionQueue.poll())!=null) {
                if (!connection.getAutoCommit()) {
                    connection.commit();
                }
                ((PooledConnection) connection).reallyClose();
            }
            }catch(SQLException e){
    }
}

    @Override
    public Connection get() {
     try{
         return connectionQueue.take();
    }catch (InterruptedException e){
        throw new RuntimeException("Error connecting to the data source", e);
    }

}
    public void closeConnection (Connection con, Statement st, ResultSet rs){
        try{
            con.close();
        } catch (SQLException e) {
        }
    try{
        rs.close();
    } catch (SQLException e) {
    }
    try{
        st.close();
    } catch (SQLException e) {
    }
        }

        public void closeConnection(Connection con, Statement st){
            try{
                con.close();
            } catch (SQLException e) {
            }try{
                st.close();
            } catch (SQLException e) {
            }
}

          private class PooledConnection implements Connection{
            private Connection connection;

            public PooledConnection(Connection c) throws SQLException {
                this.connection = c;
                this.connection.setAutoCommit(true);
            }

            public void reallyClose()throws SQLException{
                connection.close();
            }

            @Override
            public void close() throws SQLException{
                if (connection.isClosed()){
                    throw new SQLException("Attempting to close close connection");
                }
                if (connection.isReadOnly()){
                    connection.setReadOnly(false);
                }
                if (!connectionQueue.offer(this)){
                    throw new SQLException("Error allocating connection in the pool");
                }
            }

            @Override
            public boolean isClosed() throws SQLException {
                return connection.isClosed();
            }

            @Override
            public DatabaseMetaData getMetaData() throws SQLException {
                return connection.getMetaData();
            }

            @Override
            public void setReadOnly(boolean readOnly) throws SQLException {
                connection.setReadOnly(readOnly);
            }

            @Override
            public boolean isReadOnly() throws SQLException {
                return connection.isReadOnly();
            }

            @Override
            public void setCatalog(String catalog) throws SQLException {
                connection.setCatalog(catalog);
            }

            @Override
            public String getCatalog() throws SQLException {
                return connection.getCatalog();
            }

            @Override
            public void setTransactionIsolation(int level) throws SQLException {
                connection.setTransactionIsolation(level);
            }

            @Override
            public int getTransactionIsolation() throws SQLException {
                return connection.getTransactionIsolation();
            }

            @Override
            public SQLWarning getWarnings() throws SQLException {
                return connection.getWarnings();
            }

            @Override
            public void clearWarnings() throws SQLException {
                connection.clearWarnings();
            }

            @Override
            public Statement createStatement(int resultSetType, int resultSetConcurrency) throws SQLException {
                return connection.createStatement(resultSetType, resultSetConcurrency);
            }

            @Override
            public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency) throws SQLException {
                return connection.prepareStatement(sql, resultSetType, resultSetConcurrency);
            }

            @Override
            public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency) throws SQLException {
                return connection.prepareCall(sql, resultSetType, resultSetConcurrency);
            }

            @Override
            public Map<String, Class<?>> getTypeMap() throws SQLException {
                return connection.getTypeMap();
            }

            @Override
            public void setTypeMap(Map<String, Class<?>> map) throws SQLException {
                connection.setTypeMap(map);
            }

            @Override
            public void setHoldability(int holdability) throws SQLException {
                connection.setHoldability(holdability);
            }

            @Override
            public int getHoldability() throws SQLException {
                return connection.getHoldability();
            }

            @Override
            public Savepoint setSavepoint() throws SQLException {
                return connection.setSavepoint();
            }

            @Override
            public Savepoint setSavepoint(String name) throws SQLException {
                return connection.setSavepoint(name);
            }

            @Override
            public void rollback(Savepoint savepoint) throws SQLException {
                connection.rollback(savepoint);
            }

            @Override
            public void releaseSavepoint(Savepoint savepoint) throws SQLException {
                connection.releaseSavepoint(savepoint);
            }

            @Override
            public Statement createStatement(int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
                return connection.createStatement(resultSetType, resultSetConcurrency, resultSetHoldability);
            }

            @Override
            public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
                return connection.prepareStatement(sql, resultSetType, resultSetConcurrency, resultSetHoldability);
            }

            @Override
            public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
                return connection.prepareCall(sql, resultSetType, resultSetConcurrency, resultSetHoldability);
            }

            @Override
            public PreparedStatement prepareStatement(String sql, int autoGeneratedKeys) throws SQLException {
                return connection.prepareStatement(sql, autoGeneratedKeys);
            }

            @Override
            public PreparedStatement prepareStatement(String sql, int[] columnIndexes) throws SQLException {
                return connection.prepareStatement(sql, columnIndexes);
            }

            @Override
            public PreparedStatement prepareStatement(String sql, String[] columnNames) throws SQLException {
                return connection.prepareStatement(sql, columnNames);
            }

            @Override
            public Clob createClob() throws SQLException {
                return connection.createClob();
            }

            @Override
            public Blob createBlob() throws SQLException {
                return connection.createBlob();
            }

            @Override
            public NClob createNClob() throws SQLException {
                return connection.createNClob();
            }

            @Override
            public SQLXML createSQLXML() throws SQLException {
                return connection.createSQLXML();
            }

            @Override
            public boolean isValid(int timeout) throws SQLException {
                return connection.isValid(timeout);
            }

            @Override
            public void setClientInfo(String name, String value) throws SQLClientInfoException {
                connection.setClientInfo(name, value);
            }

            @Override
            public void setClientInfo(Properties properties) throws SQLClientInfoException {
                connection.setClientInfo(properties);
            }

            @Override
            public String getClientInfo(String name) throws SQLException {
                return connection.getClientInfo(name);
            }

            @Override
            public Properties getClientInfo() throws SQLException {
                return connection.getClientInfo();
            }

            @Override
            public Array createArrayOf(String typeName, Object[] elements) throws SQLException {
                return connection.createArrayOf(typeName, elements);
            }

            @Override
            public Struct createStruct(String typeName, Object[] attributes) throws SQLException {
                return connection.createStruct(typeName, attributes);
            }

            @Override
            public void setSchema(String schema) throws SQLException {
                connection.setSchema(schema);
            }

            @Override
            public String getSchema() throws SQLException {
                return connection.getSchema();
            }

            @Override
            public void abort(Executor executor) throws SQLException {
                connection.abort(executor);
            }

            @Override
            public void setNetworkTimeout(Executor executor, int milliseconds) throws SQLException {
                connection.setNetworkTimeout(executor, milliseconds);
            }

            @Override
            public int getNetworkTimeout() throws SQLException {
                return connection.getNetworkTimeout();
            }

            @Override
            public <T> T unwrap(Class<T> iface) throws SQLException {
                return connection.unwrap(iface);
            }

            @Override
            public boolean isWrapperFor(Class<?> iface) throws SQLException {
                return connection.isWrapperFor(iface);
            }

            @Override
            public Statement createStatement() throws SQLException {
                return connection.createStatement();
            }

            @Override
            public PreparedStatement prepareStatement(String sql) throws SQLException {
                return connection.prepareStatement(sql);
            }

            @Override
            public CallableStatement prepareCall(String sql) throws SQLException {
                return connection.prepareCall(sql);
            }

            @Override
            public String nativeSQL(String sql) throws SQLException {
                return connection.nativeSQL(sql);
            }

            @Override
            public void setAutoCommit(boolean autoCommit) throws SQLException {
                connection.setAutoCommit(autoCommit);
            }

            @Override
            public boolean getAutoCommit() throws SQLException {
                return connection.getAutoCommit();
            }

            @Override
            public void commit() throws SQLException {
                connection.commit();
            }

            @Override
            public void rollback() throws SQLException {
                connection.rollback();
            }
        }
}
