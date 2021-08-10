package JavaCore.Module13;

public class JoinExample {
    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread() {
            public void run() {
                for (int i = 0; i < 50000000; i++) {
                    JoinExample.counter++;
                }
            }
        }/*.start()*/;
        thread.start();
        thread.join();// main() поток блокируется и ждет, пока не завершится поток thread
        System.out.println("counter value: " + counter);
    }
}
