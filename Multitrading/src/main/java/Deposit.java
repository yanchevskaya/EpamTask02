/**
 * Created by Lizhen on 16.02.2017.
 */
public class Deposit {

        public static void main(String[] args) {

        SynchronizedAccount sa = new SynchronizedAccount( "1673");
        SynchronizedAccount cj = new SynchronizedAccount("1901");
        sa.createAccount();
        cj.createAccount();
        Transaction operation = new Transaction(sa, cj, 2000);
        Transaction operationT = new Transaction(cj, sa, 1000);

            SynchronizedAccount ru = new SynchronizedAccount( "1102");
            SynchronizedAccount ui = new SynchronizedAccount("1609");
            ru.createAccount();
            ui.createAccount();
            CopyFile one = new CopyFile(ru,ui,200);
            CopyFile two = new CopyFile(ui,ru,300);
            Thread t1 = new Thread(one);
            Thread t2 = new Thread(two);
            t1.start();
            t2.start();


        Thread thread = new Thread(operation);
        thread.start();
            try {
                thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Thread thread1 = new Thread(operationT);
        thread1.start();


        }


}
