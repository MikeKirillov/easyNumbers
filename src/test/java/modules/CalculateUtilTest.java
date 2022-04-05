package modules;

import JavaCore.Module34.CalculateUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;// alternate to Assert
import org.junit.jupiter.api.BeforeAll;

// класс, описывающий тесты на Module34.CalculateUtil
public class CalculateUtilTest {
    // метод, выполняющийся перед началом выполнения всех тестов
    @BeforeAll
    public static void before() {
        System.out.println("Start testing CalculateUtil.java");
    }

    // метод-тест, проверяющий работу метода нашего класса
    @Test
    public void testAddAndMultiply() {
        // вызываем метод нашего класса, получаем результат
        final int result = CalculateUtil.addAndMultiply(2, 3, 10);
        // выполняем проверку: наш метод должен был вернуть ответ = 50,
        // сравниваем реальное с ожидаемым
        Assert.assertEquals(50, result);
    }

    // метод, выполняющийся после окончания выполнения всех тестов
    @AfterAll
    public static void after() {
        System.out.println("Finish testing CalculateUtil.java");
    }
}
