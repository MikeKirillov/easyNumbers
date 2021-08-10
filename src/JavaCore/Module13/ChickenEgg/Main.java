package JavaCore.Module13.ChickenEgg;

public class Main {
    public static void main(String[] args) {
        // creating threads
        ChickenEgg chicken = new ChickenEgg("a chicken");
        ChickenEgg egg = new ChickenEgg("an egg");

        System.out.println("Start the dispute: who appeared first");

        // starting threads
        chicken.start();
        egg.start();

        while (chicken.isAlive() || egg.isAlive()) {
            try {
                // suspend judge thread
                Thread.sleep(100);
                System.out.println("chicken");
            } catch (InterruptedException e) {
                // ... nothing is here ...
            }
        }

        // check for egg winning
        if (egg.isAlive()) {
            try {
                // stop the egg thread
                egg.interrupt();
                // waiting for silence
                egg.join();
            } catch (InterruptedException e) {
                // ... nothing is here ...
            }
            System.out.println("An egg appeared first!");
        } else {
            try {
                // stop the chicken thread
                chicken.interrupt();
                // waiting for silence
                chicken.join();
            } catch (InterruptedException e) {
                // ... nothing is here ...
            }
            System.out.println("A chicken appeared first!");
        }
        System.out.println("The dispute is over");
    }
}