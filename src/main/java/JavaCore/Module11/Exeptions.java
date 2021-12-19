package JavaCore.Module11;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.regex.PatternSyntaxException;

public class Exeptions {
    public static void main(String[] args) {
        // 1st example
//        try {
//            NumberFormat nf = NumberFormat.getInstance();// to provoke an exception situation
//            System.out.println(nf.parse("NOT A NUMBER"));
//        } catch (ParseException e) {
//            System.out.println(e.getMessage());
//        }
//        System.out.println("Конец программы!");

        // 2nd example
//        String string = "123";
//        try {
//            char chr = string.charAt(10);
//        } catch (StringIndexOutOfBoundsException ex) {
//            System.out.println(ex.toString());
//        }
//        System.out.println("Конец программы!");

        // 3rd example
//        try {
//            int a = (int) (Math.random() * 2);
//            System.out.println("a = " + a);
//            int[] c = {1 / a}; // опасное место #1
//            c[a] = 71; // опасное место #2
//        } catch (ArithmeticException e) {
//            System.err.println("деление на 0: " + e);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.err.println("out of bound: " + e);
//        } // окончание try-catch блока
//        System.out.println("after try-catch");

        // 4rd example. multiple exceptions
//        try {// not correct construction
//            System.out.println("ololo");
//        } catch (IllegalArgumentException iae) {// is a superclass for IllegalArgumentException
//            System.out.println("da");
//        } catch (PatternSyntaxException pe) {// is a subclass of PatternSyntaxException
//            System.out.println("sout");
//        }

//        try {// correct construction
//            System.out.println("ololo");
//        } catch (PatternSyntaxException pe) {// is a subclass for IllegalArgumentException
//            System.out.println("da");
//        } catch (IllegalArgumentException iae) {// is a superclass of PatternSyntaxException
//            System.out.println("sout");
//        }

        // 5rd example. multiple exceptions
//        try {// is the same constructions but with a log writing
//            System.out.println("ololo");
//        } catch (PatternSyntaxException pe) {
//            System.out.println("da");
//            pe.printStackTrace();
//        } catch (IllegalArgumentException iae) {
//            System.out.println("sout");
//            iae.printStackTrace();
//        }

        try {// is the same as previous but all exceptions at the same CATCH-structure
            int a = (int) (Math.random() * 2);
            System.out.println("a = " + a);
            int[] c = {1 / a}; // опасное место #1
            c[a] = 71; // опасное место #2
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
