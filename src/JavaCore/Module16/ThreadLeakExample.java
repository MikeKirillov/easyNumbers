package JavaCore.Module16;

public class ThreadLeakExample {
    public static void main(String[] args) {
        startJob();
    }

    static void startJob() {
        new Thread(() -> {
            while (true) {
                // doing something
            }
        }).start();
    }
}