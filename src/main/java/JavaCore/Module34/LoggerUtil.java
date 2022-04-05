package JavaCore.Module34;

/*
класс с методами, помогающими логировать информацию
Например, следующий класс и его методы достаточно просты, чтобы не проверять их.
Методы принимают в качестве аргумента текстовую строку и печатают её в консоль,
добавив пометку уровня важности

Для таких методов не требуется никаких проверок, так как «сломаться» в них практически нечему
*/
public class LoggerUtil {
    /*
        закрытый конструктор, т.к. экземпляр класса не нужен
    */
    private LoggerUtil() {
    }

    /*
        логирование уровня информации
    */
    public static void info(String log) {
        System.out.println("[INFO] : " + log);
    }

    /*
        логирование уровня предупреждений
    */
    public static void warn(String log) {
        System.out.println("[WARN] : " + log);
    }

    /*
        логирование уровня ошибок
    */
    public static void error(String log) {
        System.out.println("[ERROR] : " + log);
    }
}
