import java.io.*;

/**
 * Created by Lizhen on 30.01.2017.
 */
public class BinaryStream {
    FileInputStream helloWorld = null;
    FileOutputStream newHelloWorld = null;
    String outFile = "newHelloWorld.java";
    String inFile = "Hello.java";


    public void readBinary ()  {

        try {
            newHelloWorld = new FileOutputStream(outFile);
            helloWorld = new FileInputStream(inFile);

            byte [] data = new byte[helloWorld.available()];
            helloWorld.read(data);
            String h = new String(data);
            System.out.println(h);
            String info = "\n В файл записано: "+ data.length+ " байт";
            byte[] newInfo = info.getBytes();

            newHelloWorld.write(data);
            newHelloWorld.write(newInfo);
            newHelloWorld.flush();



        } catch (FileNotFoundException f) {
            System.out.println("Невозможно найти файл");
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода");
        } finally {
            try {
                helloWorld.close();
                newHelloWorld.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

}
