package JavaCore.Module14.BankingProbs;

public class Bank {
    private int money;

    public Bank(int money) {
        this.money = money;
        new Client().start();
        new Client().start();
        new Client().start();
    }

    public int getMoney() {
        return money;
    }

    public void takeMoney(int money) {
        this.money -= money;
    }

    public void repay(int money) {
        this.money += money;
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

    public static void main(String[] args) throws InterruptedException {
        Bank bank = new Bank(1000000);
        while (true) {
            System.out.println(bank.getMoney());
            Thread.sleep(1000);
        }
    }
}
