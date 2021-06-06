package Module02;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    /*
    public static void main(String[] args) {//простой вариант без цикличности, т.е. с одной попыткой угадывания
        Random rand = new Random();
        int randNumb;
        randNumb = rand.nextInt(10) + 1;//создаем переменную класса Random, в которой запомним загаданное число
        //от 1 до 10 (а не от 0-9, как по умолчанию)

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int userNumb = input.nextInt();//создали переменную класса Scanner, которой считаем и запомним пользовательское
        //число

        if (userNumb == randNumb) {//сравниваем переменные и выводим результат
            System.out.println("You got this!");
            input.close();
        } else if (userNumb < randNumb) {
            System.out.println("Nah, my number is MORE");
        } else {
            System.out.println("Oops, my number is LESS");
        }
    }*/
    public static void main(String[] args) {//зацикленный вариант
        Scanner input = new Scanner(System.in);
        System.out.print("Enter try quantity: ");
        int quantity = input.nextInt();
        System.out.println("Enter lower bound: ");
        int lowerBound = input.nextInt();
        System.out.println("Enter upper bound: ");
        int upperBound = input.nextInt();

        Random rand = new Random();
        int randNumb = lowerBound + rand.nextInt(upperBound);

        int counter = 1;
        boolean status = false;
        while (counter <= quantity) {
            System.out.print("Enter your number: ");
            int userNumb = input.nextInt();

            if (userNumb == randNumb) {//сравниваем переменные и выводим результат
                System.out.println("You got this!");
                input.close();
                break;
            } else if (userNumb < randNumb) {
                System.out.println("Nah, my number is MORE");
            } else {
                System.out.println("Oops, my number is LESS");
            }
            counter++;
        }
        System.out.println("GAME OVER!\nMy number was " + randNumb + "!");
    }
}