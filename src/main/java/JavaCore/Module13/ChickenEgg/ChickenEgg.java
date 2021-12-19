package JavaCore.Module13.ChickenEgg;

import java.util.Random;

public class ChickenEgg extends Thread {
    public ChickenEgg(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                // stopping thread
                sleep(getTimeSleep());
                System.out.println(getName());
            } catch (InterruptedException e) {
                // ... nothing is here ...
            }
        }
    }

    final Random random = new Random();

    int getTimeSleep() {
        return random.nextInt(300);
    }
}