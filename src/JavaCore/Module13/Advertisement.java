package JavaCore.Module13;

public class Advertisement implements Runnable {
    public static void show() {
        System.out.println("look at advertisement");
    }

    @Override
    public void run() {
        show();
    }
}

class AdThread extends Thread{
    public void run(){
        Advertisement.show();
    }
}

class Main01 {
    public static void main(String[] args) {
//        new AdThread().start();
        new Thread(new Advertisement()).start();
    }
}