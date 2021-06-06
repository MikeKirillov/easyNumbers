package Module03;

import java.util.Arrays;
import java.util.Scanner;

public class HWMFour {
    public static void main(String[] args) {
        String[] numArr = new String[3];

        for (int i = 0; i < numArr.length; i++) {
            Scanner scanner = new Scanner(System.in);//3.2.8-4
            boolean isCorrectNumber = false;
            String phoneNumber = scanner.nextLine(); //Считывает строку из System.in
                //numArr[i] = formatName(phoneNumber);//было

            while (!isCorrectNumber) {
                isCorrectNumber = checkName(phoneNumber);

                if (!isCorrectNumber) {
                    System.out.println("Введите корректный номер!");
                    break;
                } else {
                    System.out.println(formatName(phoneNumber));
                    numArr[i] = formatName(phoneNumber);//стало
                }
                System.out.println(Arrays.toString(numArr));
            }
        }
    }

    private static boolean checkName(String phoneNumber) {//3.2.8-4
        String clean = phoneNumber.replaceAll("[^0-9]", "");//заменяем все смволны, не равные натуральным
        //числам на "", чтоб получить единую строку с цифрами
        return clean.length() == 11;
    }

    private static String formatName(String phoneNumber) {//3.2.8-4
        String clean = phoneNumber.replaceAll("[^0-9]", "");//заменяем все смволны, не равные натуральным >
        //> числам на "", чтоб получить единую строку с цифрами
        //89167000810 - пример номера для проверки
        return "+7 " + clean.substring(1, 4) + " " + clean.substring(4, 7) + " " + clean.substring(7, 9) + " " + clean.substring(9);
        //возвращаем номер телефона в нужном формате с добавлением пробелом и тд
    }
}
