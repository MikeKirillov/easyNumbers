package JavaCore.Module15;

import java.time.LocalDate;
import java.util.function.Function;
import java.util.function.Supplier;

public class DoubleValue {
    public static void main(String[] args) {
        // 1. С помощью анонимного класса
        test(new Function<Integer, Double>() {
            @Override
            public Double apply(Integer integer) {
                return integer.doubleValue();
            }
        },new Supplier<LocalDate>() {
            @Override
            public LocalDate get() {
                return LocalDate.now();
            }
        });

        // 2. С помощью лямбда-выражения
        test(integer -> integer.doubleValue(), () -> LocalDate.now());

        // 3. С помощью method reference (логика в определяемом методе может быть любой)
        test(Integer::doubleValue, LocalDate::now);
    }

    private static void test(Function<Integer, Double> integerDoubleFunction, Supplier<LocalDate> localDateSupplier) {
    }
}