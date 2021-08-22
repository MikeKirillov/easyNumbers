package JavaCore.Module15;

import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MethodReverenceVSLambda {
    public static void main(String[] args) {
        // Статический метод
        // Тип::статический метод
        Consumer<List<Integer>> methodRef1 = Collections::sort;
        Consumer<List<Integer>> lambda1 = l -> Collections.sort(l);

        // Метод объекта с ссылкой на определенный объект
        // конкретный объект::метод объекта
        String str = "abc";
        Predicate<String> methodRef2 = str::startsWith;
        Predicate<String> lambda2 = s -> s.startsWith(s);

        // Метод объекта без ссылки на определенный объект
        // Тип::метод объекта
        Function<Object, String> methodRef3 = String::valueOf;
        Function<Object, String> lambda3 = (obj) -> (obj == null) ? "null" : obj.toString();

        // Вызов конструктора
        // Тип::статический метод
        Supplier<String> methodRef4 = String::new;
        Supplier<String> lambda4 = () -> new String();
    }
}
