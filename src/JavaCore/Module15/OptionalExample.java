package JavaCore.Module15;

import java.util.Optional;

public class OptionalExample {
    // 1st example
    public static Optional<Double> average(int... scores) {
        if (scores.length == 0) {
            return Optional.empty();
        }
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return Optional.of((double) sum / scores.length);
    }

    // 2nd example
    public static void main(String[] args) {
        Optional<Double> average = average(90, 100);
        // 1st way
        if (average.isPresent()) {
            System.out.println(average.get());
        }

        // 2nd simple way without if-expression
        average(90, 100).ifPresent(System.out::println);
    }
}
