package JavaCore.Module14.BankingProbs;

public class NewNewBank {
    private Object object = new Object();// переменная, по которой и будем синхронизироваться
    private static int money = 10000;

    public NewNewBank(int money) {
        new NewNewBank.Client().start();
        new NewNewBank.Client().start();
        new NewNewBank.Client().start();
    }

    public int getMoney() {
        return money;
    }

    void takeMoney(int money) {
        synchronized (object) {
            NewNewBank.money -= money;
        }
    }

    void repay(int money) {
        synchronized (object) {
            NewNewBank.money += money;
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

    public NewNewBank () {
        new Client().start();
        new Client().start();
        new Client().start();
    }

    public static void main(String[] args) throws InterruptedException {
        NewNewBank bank = new NewNewBank();
        while (true) {
            System.out.println(bank.money);
            Thread.sleep(1000);
        }
    }
}
