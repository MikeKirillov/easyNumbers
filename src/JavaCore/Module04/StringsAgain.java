package JavaCore.Module04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringsAgain {
    public static void main(String[] args) {
//        // способы объявления строковых переменных (объекта String)
//        String s1 = new String("Salam popolam");
//        String s2 = "Salam popolam";
//        String s3 = "Salam popolam";
//        String s4 = s1;
//        String s5 = new String(s1);
//
//        System.out.println(s2 == s3);// true cuz one object
//        System.out.println(s1 == s5);// false cuz different objects
//        System.out.println(s1.equals(s5));// true. here's how to check the equality

//=======
//        StringBuilder stringBuilder = new StringBuilder("StringBuilder");
//        stringBuilder.append(" - is a class to change lines (strings) too often");
//        System.out.println(stringBuilder);
//
//        System.out.println(mulString("SOAD ", 10));// вывод повторения строки N раз
//    }
//
//    static String mulString(String value, int n) {// повторение строки N раз
//        String result = "";
//        for (int i = 0; i < n; i++) {
//            result = result + value;
//        }
//        return result;
//    }
//=======
//        String text = "<strike>Это удалить!</strike>А это хороший текст, его трогать не надо.<strike> и это не нужно!</strike>";
//        Pattern pattern = Pattern.compile("<strike>.*?</strike>");
//        Matcher matcher = pattern.matcher(text);
//
//        while (matcher.find()) {
//            int start = matcher.start();
//            int end = matcher.end();
//            System.out.println("found match\n" + text.substring(start, end) + " \nfrom " + start + " to " + end);
//        }
//        System.out.println("Cleaning all");
//        System.out.println(matcher.replaceAll(""));
//=======
//        String text = "Ivan Petrov";
//        Pattern pattern = Pattern.compile("(.*) (.*)");
//        Matcher matcher = pattern.matcher(text);
//
//        System.out.println(matcher.replaceAll("$2 $1"));// замена местами 2х слов
// =======
//        StringBuilder sb = new StringBuilder("wfwefwefwefj");
//        long startTime = System.currentTimeMillis();
//
//        for (int i = 0; i < 1000000; i++) {
////            sb.insert(0, "ABC");//50k = 90; 200k = 1457; 1mln = 37605
////            sb.append("salam");//50k = 5; 200k = 11; 1mln = 29
////            sb.delete(0,2);//50k = 3; 200k = 6; 1mln = 6
////            sb.insert(0,2);//50k = 35; 200k = 467; 1mln = 11481
////            sb.insert(length()/2, 4);//50k = 36; 200k = 459; 1mln = 11519
////            sb.setCharAt(4,'c');//50k = 5; 200k = 7; 1mln = 9
//            sb.reverse();//50k = 4; 200k = 8; 1mln = 17
//        }
//        System.out.println(System.currentTimeMillis() - startTime);
//    }

//    private static int length() {
//        return 0;
//    }
// =======

//        String text = "Regular Expressions or Regex is an API for defining String patterns that can be used for searching, manipulating and editing a text. It is widely used to define a constraint on strings such as a password. Regular Expressions are provided under java.util.regex package.";
//        Pattern pattern = Pattern.compile("\bs[a-z]*s\b");// поиск слова "strings"
//        Matcher matcher = pattern.matcher(text);
//
//        System.out.println(matcher.find());

        String text = "https://lms.skillfactory.ru/courses/course-v1:SkillFactory+JAVA-14M+2021/courseware/43ba53e72a324cb287295cc7d13f402e/0bb66cc073d8434599b79c13535cdef8/";
        Pattern p = Pattern.compile("^https?:?[\\/]{0,2}[-A-Za-z0-9+&@#/%?=~_|!:,.;]*/?$");// поиск слова "strings"
        Matcher m = p.matcher(text);
//        System.out.println(m.find());

        while (m.find()) {
            System.out.println(text.substring(m.start(),m.end()));
        }

    }
}
