package JavaCore.Module15;

import java.util.Optional;

public class OptionalThings {
    public static void main(String[] args) {
        Optional<Double> optional1 = Optional.of(22.8d);

        Optional<Double> optional2 = Optional.ofNullable(22.8d);
        Optional<Double> optional3 = Optional.ofNullable(null);
        Double nullDouble = null;
        Optional<Double> optional4 = Optional.ofNullable(nullDouble);

        Optional<Double> optional5 = Optional.empty();


        System.out.println(optional1);
        System.out.println(optional2);
        System.out.println(optional3);
        System.out.println(optional4);
        System.out.println(optional5);
    }
}
