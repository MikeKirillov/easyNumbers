package JavaCore.Module09;

import static java.lang.Math.pow;
import static java.lang.Math.round;

public class Maths {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
//        System.out.println(a + b);// 7
//        System.out.println(a - b);// 3
//        System.out.println(a * b);// 10
//        System.out.println(a / b);// 2 (Потому что приводится к int и округляется)
//        System.out.println(a % b);// 1 (Остаток от деления)


        double c = 5;
        double d = 2;
//        System.out.println(c / d);// = 2.5


        System.out.println(Math.pow(a, b));// 1st way
        System.out.println(pow(a, b));// 2nd way with import Math.pow on the top

        System.out.println(Math.E);// 1st Math constant
        System.out.println(Math.PI);// 2nd Math constant

        System.out.println(Math.abs(a));// absolute value
        System.out.println(Math.sqrt(a));// square root
        System.out.println(Math.max(a, b));// max value
        System.out.println(Math.min(a, b));// min value

        System.out.println(Math.random());// random value from 0.0 till 1.0

        System.out.println(Math.rint(2.51));// округляет число в зависимости от целой части,
        // если менее 0,5 (включительно), то в меньшую сторону, если больше, то в большую
        System.out.println(Math.round(2.51));// то же, что и rint(), но этот метод округляет
        // в большую сторону от 0,5 (включительно)
    }
}
