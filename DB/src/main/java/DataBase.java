import java.sql.*;

/**
 * Created by Lizhen on 21.02.2017.
 */
public class DataBase {

    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "Insert into wonderland (name, age, email) values (?,?,?)";
        String sql2 = "Update wonderland set name = ? where id = ?";
        String sql3 = "Delete from wonderland where id = ?";
        String sql4 = "Update wonderland set age = ? where id = ?";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learn_db_again",
                        "root", "SlyFox73");
//            pst = connection.prepareStatement(sql3);
//            pst.setString(1, "Katyshka");
//            pst.setInt(2, 27);
//            pst.setString(3, "katyshka@gmail.com");
//            pst.executeUpdate();
//            pst = connection.prepareStatement(sql2);
//            pst.setString(1, "Finch");
//            pst.setInt(2,6);
//            pst.executeUpdate();

            pst = connection.prepareStatement(sql2);
            pst.setString(1, "Mr.Finch");
            pst.setInt(2,6);
            pst.addBatch();
            pst.setString(1, "Alisa");
            pst.setInt(2,4);
            pst.addBatch();
            pst.executeBatch();


            pst = connection.prepareStatement("select * from wonderland");
            rs = pst.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " "
                + rs.getInt(3)+ " "+ rs.getString(4));
            }
        } catch (SQLException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
            e.printStackTrace();
           } finally {
            try {
                rs.close();
                pst.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            }
        }
    }

