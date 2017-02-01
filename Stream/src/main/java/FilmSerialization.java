import java.io.*;

/**
 * Created by Lizhen on 01.02.2017.
 */
public class FilmSerialization {
    CollectionOfFilms cof;
    FileOutputStream file;
    ObjectOutputStream obj;
    String filik;
    FileInputStream fis;
    ObjectInputStream ois;

    public FilmSerialization (CollectionOfFilms cof, String filik){
        this.cof =cof;
        this.filik = filik;
            }


            public void serialization() {
                try {
                    file = new FileOutputStream(filik);
                    obj = new ObjectOutputStream(file);
                    obj.writeObject(cof);
                    ;

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException m){
                    m.printStackTrace();
                }finally {
                    try {
                        obj.close();
                        file.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }

            }

            public CollectionOfFilms deserialization (String fileName){
        CollectionOfFilms colfil = null;
                try {
                    fis = new FileInputStream (fileName);
                    ois = new ObjectInputStream(fis);
                    while (fis.available() >0){
                        colfil = (CollectionOfFilms) ois.readObject();
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }finally {
                    try {
                        ois.close();
                        fis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
                return colfil;
            }
}
