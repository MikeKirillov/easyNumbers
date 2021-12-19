package JavaCore.Module14.BankingProbs;

public class NewNewNewBank {
    private Integer money = 10000;// changing int to Integer-object

    public NewNewNewBank(int money) {
        new NewNewNewBank.Client().start();
        new NewNewNewBank.Client().start();
        new NewNewNewBank.Client().start();
    }

    public int getMoney() {
        return money;
    }

    void takeMoney(int money) {
        synchronized (this.money) {
            this.money -= money;
        }
    }

    void repay(int money) {
        synchronized (this.money) {
            this.money += money;
        }
    }

    class Client extends Thread {
        @Override
        public void run() {
            while (true) {
                takeMoney(1000);
                repay(1000);
            }
        }
    }

    public NewNewNewBank () {
        new NewNewNewBank.Client().start();
        new NewNewNewBank.Client().start();
        new NewNewNewBank.Client().start();
    }

    public static void main(String[] args) throws InterruptedException {
        NewNewNewBank bank = new NewNewNewBank();
        while (true) {
            System.out.println(bank.money);
            Thread.sleep(1000);
        }
    }
}
