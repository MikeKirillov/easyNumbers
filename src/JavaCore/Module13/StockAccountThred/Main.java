package JavaCore.Module13.StockAccountThred;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // заводим счет на бирже
        StockAccount stockAccount = new StockAccount();
        // счет начинает работать
        stockAccount.run();

        // прибыль
        long profit = 0;

        // блок управления
        Scanner scanner = new Scanner(System.in);
        String command = "";
        while (!command.equals("exit")) {
            command = scanner.next();
            switch (command) {
                case "check":
                    System.out.println(stockAccount.money);
                    break;
                case "fix":
                    // Фиксируем прибыль
                    profit = profit + (long) stockAccount.money - 1000; // Если клиентский счет близок к
                    // минимуму Integer.MIN_VALUE, вычитание в int создаст огромный профит.
                    // Значения зациклены в обе стороны: если к максимальному прибавить —
                    // результат уйдет в минус, и если из минимального вычитать — в плюс.
                    System.out.println("Profit is " + profit);
                    // На счету остается минимальный остаток
                    stockAccount.money = 1000;
            }
        }
    }
}
