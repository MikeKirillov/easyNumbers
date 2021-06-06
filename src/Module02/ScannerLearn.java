package Module02;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class ScannerLearn {
    //    public static void main(String[] args) { //example with extLine()
//    //https://www.programiz.com/java-programming/scanner
//        Scanner input = new Scanner(System.in); //creates an obj of Scanner class
//        System.out.print("Enter your name: ");
//
//        String name = input.nextLine(); //takes input from the keyboard
//        System.out.println("Hi, My name is " + name); //print the name
//
//        input.close(); //closes the scanner
//    }

//    public static void main(String[] args) { // same using next() to read the 1st word of string
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter your fullname: ");
//
//        String name = input.next();
//        System.out.println("Your name with next() is "+name);
//
//        input.close();
//    }

//    public static void main(String[] args) { //same with nextInt()
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter some numbers: ");
//
//        int number = input.nextInt();
//        System.out.println("Here's a numbers you wrote using nextInt(): " + number);
//
//        input.close();
//    }

//    public static void main(String[] args) { // same with nextDouble()
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter numbers in double: ");
//
//        double number = input.nextDouble();
//        System.out.println("Same with nextDouble(): "+number);
//
//        input.close();
//    }

    public static void main(String[] args) { //same with nextBigInteger() and nextBigDecimal()
        Scanner input = new Scanner(System.in);
        System.out.print("Enter BigInteger value: ");

        BigInteger value1 = input.nextBigInteger();
        System.out.println("Value1 using nextBigInteger() " + value1);

        System.out.print("Enter BigDecimal value: ");

        BigDecimal value2 = input.nextBigDecimal();
        System.out.println("Value1 using nextBigDecimal() " + value2);

        input.close();
    }

}
