package JavaCore.Module14.BankingProbs;

import java.util.concurrent.atomic.AtomicInteger;

public class BankAtomic {
    //    private int money = 10000;
    private AtomicInteger money = new AtomicInteger(0);// added to remove int money
    private Object lock = new Object();

    public BankAtomic() {
//        new Client().start();
//        new Client().start();
//        new Client().start();
        // declare starting value of money
        money.set(10000);
        for (int i = 0; i < 5; i++) {
            new Client().start();
        }
    }

    int getMoney() {
        return money.get();
    }

    void take(int money) {
//        synchronized (lock) {
        // decreasing value
//        this.money -= money;
        this.money.addAndGet(-money);
//        }
    }

    void repay(int money) {
//        synchronized (lock) {
        // increasing value
//            this.money += money;
        this.money.addAndGet(money);
//        }
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
        BankAtomic bank = new BankAtomic();
        while (true) {
            System.out.println(bank.money);
            Thread.sleep(1000);
        }
    }
}