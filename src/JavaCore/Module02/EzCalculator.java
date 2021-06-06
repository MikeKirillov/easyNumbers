package JavaCore.Module02;

import java.util.Scanner;

public class EzCalculator {
//    public static void main(String[] args) { //one method calculator
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter 1st operand: ");
//        double operand1 = scanner.nextDouble();
//
//        System.out.print("Enter operation sign: ");
//        char operation = scanner.next().charAt(0);
//
//        System.out.print("Enter 2nd operand: ");
//        double operand2 = scanner.nextDouble();
//
//        double result;
//        switch (operation) {
//            case '+':
//                result = operand1 + operand2;
//                System.out.println(operand1 + " + " + operand2 + " = " + result);
//                break;
//            case '-':
//                result = operand1 - operand2;
//                System.out.println(operand1 + " - " + operand2 + " = " + result);
//                break;
//            case '*':
//                result = operand1 * operand2;
//                System.out.println(operand1 + " * " + operand2 + " = " + result);
//                break;
//            case '/':
//                result = operand1 / operand2;
//                System.out.println(operand1 + " / " + operand2 + " = " + result);
//                break;
//            default:
//                System.out.println("Error! Unexpected sign!");
//        };
//        scanner.close();
//    }

    /*public static void main(String[] args) { //different methods calculator
        Calc calc = new Calc();
        calc.doCalculation();
    }
}

class Calc {

    private double inpFstOperand() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st operand: ");
        return input.nextDouble();
    }

    private double inpSndOperand() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 2nd operand: ");
        return input.nextDouble();
    }

    private char inpOperation() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter operation sign: ");
        return input.next().charAt(0);
    }

    public void doCalculation() {
        double oper1 = inpFstOperand();
        char operation = inpOperation();
        double oper2 = inpSndOperand();
        double result;
        switch (operation) {
            case '+' -> {
                result = oper1 + oper2;
                System.out.println(oper1 + " + " + oper2 + " = " + result);
            }
            case '-' -> {
                result = oper1 - oper2;
                System.out.println(oper1 + " - " + oper2 + " = " + result);
            }
            case '*' -> {
                result = oper1 * oper2;
                System.out.println(oper1 + " * " + oper2 + " = " + result);
            }
            case '/' -> {
                result = oper1 / oper2;
                System.out.println(oper1 + " / " + oper2 + " = " + result);
            }
            default -> throw new IllegalStateException("Unexpected value: " + operation);
        }
    }*/

    public static void main(String[] args) { //one method calculator
        int counter = 1;
        double result;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st operand: ");
        double operand1 = input.nextDouble();

        System.out.print("Enter operation sign: ");
        char operation = input.next().charAt(0);

        System.out.print("Enter 2nd operand: ");
        double operand2 = input.nextDouble();

        counter = getCounter(counter, operand1, operation, operand2);

        while (counter > 1) {
            System.out.print("Enter operation sign: ");
            String userNumb = input.next();
            char operation22 = userNumb.charAt(0);

            if (userNumb.equals("s")) {
                System.out.println("Calculation's over!");
                input.close();
                break;
            } else {
                System.out.print("Enter 2nd operand: ");
                double operand22 = input.nextDouble();

                result = 111111;//понять, как затолкать сюда результаты предыдущего вычисления
                counter = getCounter(counter, result, operation22, operand22);
            }
        }
    }

    private static int getCounter(int counter, double operand1, char operation, double operand2) {
        double result;
        switch (operation) {
            case '+' -> {
                result = operand1 + operand2;
                System.out.println(operand1 + " + " + operand2 + " = " + result);
                return (int) result;
            }
            case '-' -> {
                result = operand1 - operand2;
                System.out.println(operand1 + " - " + operand2 + " = " + result);
                return (int) result;
            }
            case '*' -> {
                result = operand1 * operand2;
                System.out.println(operand1 + " * " + operand2 + " = " + result);
                return (int) result;
            }
            case '/' -> {
                result = operand1 / operand2;
                System.out.println(operand1 + " / " + operand2 + " = " + result);
                return (int) result;
            }
            default -> {
                System.out.println("Error! Unexpected sign!");
            }
        }
        counter++;
        return counter;
        //return result;
    }
}