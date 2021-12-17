package SandBox.SB01;

/*
testing some for and for each loops
*/
public class LoopClass {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
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
