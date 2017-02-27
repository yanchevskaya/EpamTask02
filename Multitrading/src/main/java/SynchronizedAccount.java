import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SynchronizedAccount {
    private String accountName;
    private double in;
    private double out;
    private double amount;
    private BufferedReader reader;
    private BufferedWriter writer;


    SynchronizedAccount(String accountName) {
        this.accountName = accountName + ".txt";
          }


    public synchronized void createAccount() throws FileIsAlreadyExist {
        File file = new File(accountName);
        if (!file.exists()) {
              recordToFile();
        } else  in = getIn();
                out = getOut();
                amount = getAmount();
    }

    private synchronized void recordToFile() {
        try {
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.accountName)));
            writer.write("amount = " + amount + "\n" +
                    "in = " + in + "\n" +
                    "out = " + out);
            writer.flush();
        } catch (FileNotFoundException e) {
            System.out.println("File hasn't been found");
                } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        }

    private String readData() throws NoAnyData{
        String data;
        StringBuffer sb = new StringBuffer();
        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(accountName)));
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        }
        try {
            while ((data=reader.readLine())!=null){
            sb.append(data).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
            if (sb!=null) {
                data = new String(sb);
            }else throw new NoAnyData();
                return data;
    }

       private double getInfo (String reg) throws NoAnyData {
        double data;
        String f = readData();

        Pattern pattern = Pattern.compile(reg, Pattern.CASE_INSENSITIVE);
        Matcher match = pattern.matcher(f);

        if (match.find()) {
            data = Double.parseDouble(match.group(2));
        }else throw new NoAnyData();
        return data;
    }
    public void sendOut (double sum) throws NotEnoughAmount {
        if (amount>=sum) {
            amount = amount - sum;
            out = out + sum;
            recordToFile();
        }else throw new NotEnoughAmount();
    }


    public void receivedIn (double sum) {

        amount = amount+sum;
        in = in+sum;
        recordToFile();
        }

        public String getAccountName(){
        String [] s = accountName.split("\\.");
        return s[0];
        }

    private double getOut() {
        String reg = "(out\\s?=\\s?(\\d+\\.\\d?\\d?))";
        return getInfo(reg);
    }

    private double getAmount() {
        String reg = "(amount\\s?=\\s?(\\d+\\.\\d?\\d?))";
        return getInfo(reg);
    }

        private double getIn() {
        String reg = "(in\\s?=\\s?(\\d+\\.\\d?\\d?))";
        return getInfo(reg);
    }

    }

