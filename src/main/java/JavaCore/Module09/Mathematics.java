package JavaCore.Module09;

public class Mathematics {
    public static void main(String[] args) {
        int a = -6, b = -3;

        System.out.println(abs(a));
        System.out.println(max(a, b));
        System.out.println(min(a, b));
    }

    public static double abs(double num) {
        return Math.abs(num);
    }

    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static int min(int a, int b) {
        return Math.min(a, b);
    }
}