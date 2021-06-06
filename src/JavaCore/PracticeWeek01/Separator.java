package JavaCore.PracticeWeek01;

import java.util.Arrays;

public class Separator {// task08
    int[] array;

    public Separator(int[] array) {
        this.array = array;
    }

    public int[] even() {
        int lengthEven = 0;
        int indexEven = 0;
        for (int i = 0; i < array.length; i++) {// get even's array length
            if (array[i] % 2 == 0) {
                lengthEven++;
            }
        }
        int[] even = new int[lengthEven];
        for (int i = 0; i < array.length; i++) {// write new values to even's array
            if (array[i] % 2 == 0) {
                even[indexEven] = array[i];
                indexEven++;
            }
        }
        return even;
    }

    public int[] odd() {
        int lengthOdd = 0;
        int indexOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                lengthOdd++;
            }
        }

        int[] odd = new int[lengthOdd];

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                odd[indexOdd] = array[i];
                indexOdd++;
            }
        }
        return odd;
    }

    public static void main(String[] args) {
        Separator separator = new Separator(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        System.out.println(Arrays.toString(separator.array));

        System.out.println(Arrays.toString(separator.odd()));
        System.out.println(Arrays.toString(separator.even()));
    }
}
