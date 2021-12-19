package HeadFirstJava.Chapter01;

public class DooBee {
    public static void main(String[] args) {//DooBeeDooBeeDo
        int x = 1;
        while (x < 3) {
            System.out.print("Doo");
            System.out.print("Bee");
            x++;
        }
        if (x == 3) {
            System.out.print("Do");
        }
    }
}