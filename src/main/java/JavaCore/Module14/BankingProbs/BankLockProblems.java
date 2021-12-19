package JavaCore.Module14.BankingProbs;

public class BankLockProblems {
    private int money = 10000;
    private Object lock = new Object();

    public BankLockProblems() {
        new Client().start();
        new Client().start();
        new Client().start();
    }

    int getMoney() {
        return money;
    }

    void take(int money) {
        synchronized (lock) {
            this.money -= money;
        }

    }

    void repay(int money) {
        synchronized (lock) {
            this.money += money;
        }
    }

    class Client extends Thread {
        @Override
        public void run() {
            while (true) {
                // выдаем кредит, только если
                // есть свободные средства
                if (getMoney() >= 1000) {// added this line
                    take(1000);
                    repay(1000);
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        BankLockProblems bank = new BankLockProblems();
        while (true) {
            System.out.println(bank.money);
            Thread.sleep(1000);
        }
    }
}
