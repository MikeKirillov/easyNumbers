package JavaCore.Module15;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.BiPredicate;

public class SpecialLambda {
    private static void task(BiPredicate<String, String> param) {
    }

    public static void main(String[] args) {
        task((value1, value2) -> value1.endsWith(value2));// lambda-using example
        task(String::endsWith);// method reference example

        // thread example
        new Thread(new Runnable() {// non lambda
            @Override
            public void run() {
                System.out.println("Thread through the anonymous class Runnable");
            }
        }).start();

        new Thread(() -> System.out.println("Thread through lambda expression")).start();

        // action example
        Button button = null;
        if (button != null) {
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Button pressed! Old way to declare it");
                }
            });
        }

        button.addActionListener((ActionEvent e) -> System.out.println("Button pressed! New lambda-way to declare it"));
        // or without declaring ActionEvent-type

        // example with double ":"
//        List<Integer> list = (List) Arrays.asList(1, 2, 3, 4, 5, 6, 7);
//        for (Integer n : list) {
//            System.out.println(n);
//        }
//
//        List<Integer> list1 = (List) Arrays.asList(1, 2, 3, 4, 5, 6, 7);
//        list.forEach(n -> System.out.println(n));
//
//        list.forEach(System.out::println);
        // doesn't work for some reason but looks like that
        // https://javarush.ru/groups/posts/845-lambda-vihrazhenija-na-primerakh
    }
}
