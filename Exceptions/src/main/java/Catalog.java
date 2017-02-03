import java.io.*;
import java.util.Arrays;

/**
 * Created by Lizhen on 01.02.2017.
 */
public class Catalog {

//    public static void main(String[] args) {
//        try {
//            showCatalogAndFiles("m:\\");
//        } catch (PathNotExists pathNotExists) {
//            System.out.println("The path is not correct");
//        }


//        try {
//            recordToFile("d:\\newFile.txt", "New fucking phrase");
//        } catch (FileDoesNotExist fileDoesNotExist) {
//            System.out.println("File does not exist");
//        }
//
//    }

    private static void showCatalogAndFiles(String path) throws PathNotExists {
        File file = new File(path);
        if (!file.exists()) throw new PathNotExists();
        String[] catalog = file.list();
        System.out.println(Arrays.toString(catalog));
    }

     static void createTextFile(String nameOfFile) throws FileIsAlreadyExists {
        File file = new File(nameOfFile);
        if (file.exists()) throw new FileIsAlreadyExists();
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Can't create new file");
        }
    }

     static void deleteTextFile(String nameOfFile) throws FileDoesNotExist {
        File file = new File(nameOfFile);
        if (file.exists())
            file.delete();
        else throw new FileDoesNotExist();

    }

    private static void recordToFile(String nameOfFile, String text) throws FileDoesNotExist {
        File file = new File(nameOfFile);
        StringBuilder sb = new StringBuilder();
        if (!file.exists()) throw new FileDoesNotExist();
        try (BufferedReader rf = new BufferedReader(new FileReader(nameOfFile))) {
            String str;
            while ((str = rf.readLine()) != null) {
                sb.append(str);
                sb.append("\r\n");
            }


        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        try (Writer wr = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(nameOfFile), "utf8"))) {
            sb.append(text);
            wr.write(sb.toString());
            } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



