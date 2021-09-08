package JavaCore.Module15;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        // how to declare Stream
        Stream<String> empty = Stream.empty();// empty stream
        Stream<Integer> singleElement = Stream.of(1);// length = 1
        Stream<Integer> anyElement = Stream.of(1, 2, 3);// length = 3
        Stream<Integer> fromArray = Arrays.stream(new Integer[]{1, 2, 3});// length = 3

        // another one way to declare Stream
        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> listStream = list.stream();

        // infinity Stream
        Stream<Double> randoms = Stream.generate(Math::random);// генератор рандомных чисел
        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);// последовательность нечетных чисел,
        // 1 - первое число ряда
    }
}
