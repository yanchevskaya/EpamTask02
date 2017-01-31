import java.io.*;

/**
 * Created by Lizhen on 31.01.2017.
 */
public class ReadTheText {
    Reader justText = null;
    Writer writeUTF16 = null;
    String inFile = "Just Text.txt";
    String outFile = "WriteUTF16.text";
    FileInputStream text = null;
    OutputStream newText = null;
    String outText = "BinaryUTF16.txt";

    public void readText() {
        try {
            justText = new BufferedReader(new InputStreamReader(new FileInputStream(inFile)));
            writeUTF16 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outFile), "UTF16"));
            int k;
            while ((k = justText.read()) != -1) {
                System.out.print((char) k);
                writeUTF16.write(k);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File has not found");
        } catch (IOException m) {
            System.out.println("In-Out error");
        } finally {
            try {
                justText.close();
                writeUTF16.close();
            } catch (IOException e) {
                System.out.println("Error during closing");
            }

        }
    }
}

