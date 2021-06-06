package PracticeWeek01;

public class Squirrel {// task13
    int[] nuts;

    public Squirrel(int[] nuts) {
        this.nuts = nuts;
    }

    int getNuts(int index) {
        return nuts[index];
    }

    int maxNuts() {
        if (nuts.length > 1) {
            int[] array = nuts.clone();
            array[1] = max(array[1], array[0] + array[1]);

            for (int i = 2; i < array.length; i++) {
                array[i] = max(array[i] + array[i - 1], array[i] + array[i - 2]);
            }

            int value = max(array[array.length - 2], array[array.length - 1]);
            return max(0, value);
        } else return max(0, nuts[0]);
    }

    private int max(int a, int b) {
        if (a >= b) return a;
        else return b;
    }

    public static void main(String[] args) {
        Squirrel s = new Squirrel(new int[]{2, 5, -3, -1});
        System.out.println(s.maxNuts());
        Squirrel s2 = new Squirrel(new int[]{1, -2, 3, 1, -1, -4, 2, 3});
        System.out.println(s2.maxNuts());
    }

}
