package SandBox.SB01;

import java.util.Arrays;

/*
testing some for and for each loops
*/
public class LoopClass {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int[] intArray = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
/*
        int[] intArray = new int[10];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        intArray[3] = 4;
        intArray[4] = 5;
        intArray[5] = 6;
        intArray[6] = 7;
        intArray[7] = 8;
        intArray[8] = 9;
        intArray[9] = 10;
*/
        System.out.println(Arrays.toString(intArray));// print array as string

        printArray(intArray);
        System.out.println("average = " + printAverage(intArray));
        int max = printMax(intArray);
        System.out.println("max = " + max);
    }

    public static void printArray(int[] intArray) {
        System.out.print("|");
/*        for (int i = 0; i < intArray.length; i++) {
//            System.out.print(i);// print array index
            System.out.print(intArray[i] + "|");// print array values
        }*/
        for (int i : intArray) {
            System.out.print(i + "|");// print array values
//            System.out.print(array[i]);// ArrayIndexOutOfBoundsException
        }
        System.out.println();
    }

    public static double printAverage(int[] intArray) {
        int average = 0;
/*        for (int i = 0; i < intArray.length; i++) {
            average += intArray[i];
        }*/
        for (int i : intArray) {
            average += i;
        }
        return (double) average / intArray.length;
    }

    public static int printMax(int[] intArray) {
        int maxValue = 0;
/*        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > maxValue) {
                maxValue = intArray[i];
            }
        }*/
        for (int i : intArray) {
            if (i > maxValue) {
                maxValue = i;
            }
        }
        return maxValue;
    }
}
