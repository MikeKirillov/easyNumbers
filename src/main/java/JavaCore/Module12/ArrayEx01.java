package JavaCore.Module12;

import java.util.Arrays;

public class ArrayEx01 {
    public static void main(String[] args) {

        char[] charArr = new char[5];

        charArr[0] = 'z';
        charArr[1] = 'h';
        charArr[2] = 'd';
        charArr[3] = 'a';
        charArr[4] = 'y';

        System.out.println(charArr);// print default array

        Arrays.sort(charArr);// sort array
        System.out.println(charArr);

        Arrays.fill(charArr,'z');// filling with same value
        System.out.println(charArr);
    }
}
