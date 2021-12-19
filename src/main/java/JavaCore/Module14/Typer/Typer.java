package JavaCore.Module14.Typer;

public class Typer extends Thread {
    static Object o = new Object();
    String message;

    Typer(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        synchronized (o) {
            for (int i = 0; i < message.length(); i++) {
                System.out.print(message.charAt(i));

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    break;
                }
            }
        }
    }
}