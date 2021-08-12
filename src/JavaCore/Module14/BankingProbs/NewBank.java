package JavaCore.Module14.BankingProbs;

public class NewBank {
    private static int money = 10000;

    public NewBank(int money) {
        new Client().start();
        new Client().start();
        new Client().start();
    }

    public int getMoney() {
        return money;
    }

    public static synchronized void takeMoney(int money) {
        NewBank.money -= money;
    }

    public static synchronized void repay(int money) {
        NewBank.money += money;
    }

    static class Client extends Thread {
        @Override
        public void run() {
            while (true) {
                takeMoney(1000);
                repay(1000);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
//        Bank bank = new Bank(1000000);
        new Client().start();
        new Client().start();
        new Client().start();

        while (true) {
            System.out.println(NewBank.money);
            Thread.sleep(1000);
        }
    }
}
