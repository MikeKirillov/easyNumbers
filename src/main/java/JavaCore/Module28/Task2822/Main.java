package JavaCore.Module28.Task2822;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Main {
    /*
        Реализуйте функциональность, которая вызывает метод delete() у всех классов в пакете.
        Например, у нас есть два класса: Article, который хранит информацию о конкретной статье, и Picture,
        который хранит картинки статьи. Эти два класса лежат в одном пакете. Классов может быть и больше.
        Задача состоит в том, чтобы используя рефлексию, удалить все сущности, относящиеся к конкретной статье.
    */
    public static void main(String[] args) throws Exception {
        List<Class> classes = getAllClasses();
        for (Class clazz : classes) {
            if (Deletable.class.isAssignableFrom(clazz)
                    && !Modifier.isInterface(clazz.getModifiers())) {
//                Deletable deletable = (Deletable) clazz.getConstructor().newInstance();
//                deletable.delete("s3d4");

                Method deleteMethod = clazz.getDeclaredMethod("delete", String.class);
                deleteMethod.invoke(clazz.getConstructor().newInstance("s3d4"));
            }
        }
    }

    /*
        Для получения всех классов в пакете можно использовать следующий метод, где Main.class — класс с методом main(),
        а getResource("") означает, что классы лежат в том же пакете, что и класс Main.
    */
    public static List<Class> getAllClasses() throws Exception {
        URL upackage = Main.class.getClassLoader().getResource("");

        BufferedReader reader = new BufferedReader(new InputStreamReader((InputStream) upackage.getContent()));
        String line;
        List<Class> classes = new ArrayList<>();
        while ((line = reader.readLine()) != null) {
            classes.add(Class.forName(line.replace(".class", "")));
        }

        return classes;
    }
}