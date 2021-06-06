package JavaCore.PracticeWeek01;

public class Bell {// task02
    private static boolean ding = true;

    void sound(){
        if (ding = true){
            System.out.println("ding");
        } else {
            System.out.println("dong");
        }
    }

    public static void main(String[] args) {
        Bell bell = new Bell();
        bell.sound();
        ding = !ding;
    }
}
