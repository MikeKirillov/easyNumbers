package JavaCore.Module01;

import java.util.Arrays;

public class ArraysLocal {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};//альтернативные варианты задания массивов
        int arr2[] = {1, 2, 3, 4};
        int[] arr3 = new int[]{1, 2, 3, 4};
        int arr4[] = new int[]{1, 2, 3, 4};
        int[] arr5 = new int[10];
        System.out.println(Arrays.toString(arr1));

        int[] arr6 = new int[]{};//создание пустого массива
        int[] arr7 = {};//еще создание пустого массива

        //циклы1 while
//        int a = 1;
//        int b = 10;
//        while (a<=b){
//            System.out.println(a++);
//        }

        //циклы2 do...while
//        int a = 15;
//        int b = 10;
//        do {
//            System.out.println(--a);//второй вариант в одну строку
//            System.out.println(b);
//        } while (a < b);

        //циклы3 for (переменная цикла со значением начала цикла;
        // условие окончания цикла;
        // итерация прохождения цикла)
//        int z = 10;
//        for (int i = 0; i <= z; i++) {
//            System.out.println(i);
//        }
//        int i = 0;
//        for (int y = 10; y >= i; y--) {
//            System.out.println(y);
//        }

//        for (int qwer = 0; qwer <= 100; qwer += 10) {
//            System.out.println(qwer);
//            if (qwer == 70) { //останавливаем цикл при достижении этого значения
//                System.out.println("STOOOOOP it please!!!");
//                break;
//            }
//        }

//        for (int qwer = 0; qwer <= 100; qwer += 10) {
//            if (qwer == 70) {//пропускает при достижении этого значения
//                continue;
//            }
//            System.out.println(qwer);
//        }

        //циклы4 foreach
        //останавливает при достижении заданного числа
//        for (int i:arr1) {
//            if (i==3)
//                break;
//            System.out.println(i);
//        }
        //пропускает заданное число массива
//        for (int i:arr1) {
//            if (i==3)
//                continue;
//            System.out.println(i);
//        }

//        for (int u = 2; u <= 10; u = u + 2) {
//            System.out.println(u);
//        }

//        int i, j;
//        for (i = 1; i < 10; i++) {
//            System.out.println("multiplication for " + i);
//            for (j = 1; j < 10; j++) {
//                System.out.println(i + " * " + j + " = " + (i * j));
//            }
//            System.out.println();
//        }

//        String table = "| %-18s | %-6d |%n";
//        System.out.format("+--------------------+--------+%n");
//        System.out.format("|Multiplication      | Result |%n");
//        System.out.format("+--------------------+--------+%n");
//
//        int i, j;
//        for (i = 1; i < 10; i++) {
//            System.out.format("|Multiplication for " + i + "         |%n");
//            for (j = 1; j < 10; j++) {
//                System.out.format(table, (i + " * " + j), i * j);
//            }
//        }
//        System.out.format("+--------------------+--------+%n");
    }
}