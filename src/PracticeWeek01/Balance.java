package PracticeWeek01;

public class Balance {// task01
    public static void main(String[] args) {
        Libra libra = new Libra();

        libra.addLeft(14);
        libra.addRight(14);

        libra.getSituation();
    }
}

class Libra {
    int right, left, n;

    void addRight(int n) {
        right = right + n;
    }

    void addLeft(int n) {
        left = left + n;
    }

    String getSituation() {
        if (right == left) {
            System.out.println("=");
            return "=";
        } else if (right > left) {
            System.out.println("R");
            return "R";
        } else
            System.out.println("L");
            return "L";
    }
}