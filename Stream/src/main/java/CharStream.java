import java.io.*;

/**
 * Created by Lizhen on 30.01.2017.
 */
public class CharStream {
    Reader helloWorld = null;
    Writer newHelloWorld = null;
    String outFile = "newHelloWorldChar.java";
    String inFile = "Hello.java";



    public void readChar ()  {

        try {

            newHelloWorld = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(outFile)));
            helloWorld = new BufferedReader(new InputStreamReader(
                    new FileInputStream(inFile)));
            int r;
            int count=0;
            while ((r = helloWorld.read())!=-1) {
                System.out.print((char)r);
                newHelloWorld.write(r);
                count++;
            }

            String info = "\n В файл было записано "+ count+ " символов";
            newHelloWorld.write(info);

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

