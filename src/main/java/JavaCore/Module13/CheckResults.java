package JavaCore.Module13;

public class CheckResults {
    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        new Thread() {// new anonymous class
            public void run() {
                for (int i = 0; i < 100; i++) {
                    CheckResults.counter++;
                }
            }
        }.start();

        while (CheckResults.counter < 100) {
            System.out.println("not reached yet");
            Thread.sleep(1000);// thread waiting (paused) for 1 sec
        }
        System.out.println("reached");
    }
}