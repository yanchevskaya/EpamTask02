/**
 * Created by Lizhen on 16.02.2017.
 */
public class Transaction implements Runnable{
    private SynchronizedAccount account;
    private SynchronizedAccount secondAccount;
    private int sum;

    public Transaction(SynchronizedAccount account, SynchronizedAccount secondAccount, int sum){
        this.account = account;
        this.secondAccount = secondAccount;
        this.sum = sum;
    }


    @Override
    public void run() {
        operation(sum);
    }

    public void operation(double sum) {
        synchronized (account) {
            synchronized (secondAccount) {
                try {
                    account.sendOut(sum);
                    secondAccount.receivedIn(sum);
                    System.out.println("Средства переведены со счета "+ account.getAccountName());
                } catch (NotEnoughAmount notEnoughAmount) {
                    System.out.println(notEnoughAmount.toString());
                }

            }

        }
    }}