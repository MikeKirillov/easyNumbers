package JavaCore.Module15;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LamdaExamplesMore {
    public static void evaluate(List<Integer> list, Predicate<Integer> predicate) {
        for (Integer n : list) {
            if (predicate.test(n)) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // example with Predicate
        // В следующем примере мы используем функциональный интерфейс Predicate
        // для создания теста и печати элементов, прошедших этот тест.
        // Таким способом вы можете помещать логику в lambda-выражения и делать что-либо на ее основе.
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.print("all values output: ");
        evaluate(list, (n) -> true);

        System.out.print("do not output any values: ");
        evaluate(list, n -> false);

        System.out.print("Вывод четных чисел: ");
        evaluate(list, (n) -> n % 2 == 0);

        System.out.print("Вывод нечетных чисел: ");
        evaluate(list, (n) -> n % 2 == 1);

        System.out.print("Вывод чисел больше 5: ");
        evaluate(list, n -> {
            return n > 5;
        });

        // trying to recalculate values
        // old way
        for (Integer n : list) {
            int x = n * n;
            System.out.print(x + " ");
        }
        // new lambda-way
        list.stream().map((x) -> x * x).forEach(System.out::println);

        // another 1 example
        int sum = 0;
        for (Integer n : list) {
            int x = n * n;
            sum = sum + x;
        }
        System.out.println(sum);

        sum = list.stream().map((x) -> x * x).reduce((x, y) -> x + y).get();
//        sum = list.stream().map((x) -> x * x).reduce(Integer::sum).get();// also works good as previous line
        System.out.println(sum);
    }
}
