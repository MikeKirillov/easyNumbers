package JavaCore.Module13;

public class Advertisement {
    public static void show() {
        System.out.println("look at advertisement");
    }
}

class AdThread extends Thread{
    public void run(){
        Advertisement.show();
    }
}

class Main01 {
    public static void main(String[] args) {
        new AdThread().start();

    }
}