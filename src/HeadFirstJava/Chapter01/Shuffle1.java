package HeadFirstJava.Chapter01;

public class Shuffle1 {
    public static void main(String[] args) {
        // sout = "a-b c-d"
        int x = 3;

        while (x > 0) {
            if (x > 2) {
                System.out.print("a");
            } else if (x == 2) {
                System.out.print("b c");
            }
            x--;
            System.out.print("-");

            if (x == 1) {
                System.out.print("d");
                x--;
            }
        }
    }
}
