package JavaCore.Module34;

import com.sun.net.httpserver.HttpExchange;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/*
Рассмотрим пример более сложных методов. Например, класс и его методы,
отвечающие за открытие/закрытие соединения с базой данных

Хотя сами методы выглядят примитивными, за ними скрываются возможные проблемы с настройками
подключения, с самой СУБД и многие другие. Такие методы будет полезно покрывать юнит-тестами
для контроля подобных нюансов, так мы сможем гораздо быстрее найти, где именно располагается проблема,
и приступить к её устранению.

А если ваш метод содержит ветвления (switch, if, …) или какую-либо сложную логику,
его практически необходимо покрывать всевозможными проверками. Например, метод,
получающий на вход объект HttpExchange

класс работы с БД
*/
public class DatabaseUtil {
    /*
        переменные для установки соединения, параметр AUTO_SERVER=TRUE говорит о необходимости
        запустить СУБД H2 в режиме сервера (то есть дать возможность подключения нескольких пользователей)
    */
    private static final String URL = "jdbc:h2:~/test;AUTO_SERVER=TRUE";
    private static Connection connection;
    private static Statement statement;

    static {
    /*
        ...инициализация подключения...
    */
    }

    /*
        метод закрытия базы
    */
    public static void closeDatabase() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }

    /*
        проверка, закрыто ли соединение
    */
    public static boolean isConnectionClosed() throws SQLException {
        return connection.isClosed();
    }

    /*
        получение объекта для выполнения запросов
    */
    public static Statement getStatement() {
        return statement;
    }

    public void handle(HttpExchange httpExchange) {
/*
        try {
*/
        /*
                ветвление в зависимости от HTTP-метода запроса
        */
            switch (httpExchange.getRequestMethod()) {
                case "GET":
                    handleGetRequest(httpExchange);
                    break;
                case "POST":
                    handlePostRquest(httpExchange);
                    break;
                default:
                    LoggerUtil.warn("No handler found for response");
            }
        /*} catch (SQLException e) {
            LoggerUtil.error("Wrong SQL query or unknown");
            LoggerUtil.error(e.getCause().toString());
        }*/
/*
        Мы не можем быть уверены, что внутри методов handleGetRequest(httpExchange)
        или handlePostRequest(httpExchange) не произойдут какие-то изменения. Например,
        другой член команды параллельно или после вас внесёт изменения в логику их работы.
        Или же это вообще хранится где-нибудь в отдельном модуле, разрабатываемом другой командой.
        Поэтому следует проверить отдельно эти методы, чтобы при вызове handle(httpExchange)
        мы получили то, что ожидали.
*/
    }

    private void handlePostRquest(HttpExchange httpExchange) {
    }

    private void handleGetRequest(HttpExchange httpExchange) {
    }
}