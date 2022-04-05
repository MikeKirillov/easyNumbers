package JavaCore.Module34;

public class CalculateUtil {
    // метод сложения двух чисел, приватный
    private static int addTwo(int a, int b) {
        return a + b;
    }

    // метод сложения двух чисел и умножения, публичный
    public static int addAndMultiply(int a, int b, int n) {
        return addTwo(a, b) * n;
    }

/*
    Простой код, но для объяснения юнит-тестов он более чем достаточен.
    Здесь мы сделали просто утилитный класс с одним публичным и одним приватным методом,
    этот класс лежит в основном пакете, src/main/java (пока что не будем усложнять).
    Теперь попробуем сделать для него тест. Разместим его прямо в корневом пакете тестов — src/test/java
*/
}
