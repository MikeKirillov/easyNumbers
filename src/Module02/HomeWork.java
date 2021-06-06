package Module02;

public class HomeWork {
//    public static void main(String[] args) {
//        int value = add(3, 4);
//        int result = add(value, 10);
//        System.out.println(result);
//    }
//
//    public static int add(int x, int y) {
//        int result = x + y;
//        return result;
//    }
}

/*
class Loader {
    public static void main(String[] args) {
        int value = add(3, 4);
        int result = add(value, 10);
        System.out.println(result);
    }

    public static int add(int x, int y) {
        int result = x + y;
        return result;
    }
}
*/
/*
class Privedenie {//пример приведения значения при переполнении типов.
//отрицательное значение в связи с тем, что значения идут будто по спирали или по кругу,
//потому если превышает 127, то идет на 2й круг от -128
    public static void main(String[] args) {
        byte a = 100;
        byte b = 29;
        byte c = (byte)(a+b);
        System.out.println(c);
    }
}
*/

/*
class Loader {//2.6.1 decode

    public static void main(String[] args) {
        char ch1 = 'h';
        char ch2 = 'i';
        char ch3 = 'b';

        System.out.println(decode(ch1) + " " + decode(ch2) + " " + decode(ch3));
    }

    public static String decode(char ch) {
        String str = switch (ch) {
            case 'h' -> "Hello!";
            case 'i', 'm', 'k' -> "I can decode!";
            case 'b' -> "Bye!";
            default -> "I don’t know these symbols :(";
        };
        return str;
    }
}
 */
/*
class Loader { //2.6.2
    public static void main(String[] args) {
        int i = 45;
        while (i < 350) {
            i++;
        }
        System.out.println("Value i = " + i);
    }
}
 */
/*
class Loader { //2.6.3
    public static void main(String[] args) {
        int i = 10;
        do {
            i--;
        }
        while (i > 1) ;
        System.out.println("Value i = " + i);
    }
}
 */
/*
class Loader { //2.6.6
    public static void main(String args[]) {
        int variable = 7;
//        if (variable > 10) {
//            variable = variable - 10;
//        } else {
//            variable = variable + 10;
//        }
        int sVar = (variable >= 10) ? (variable - 10) : (variable + 10);
        System.out.println(sVar);
    }
}
 */
/*
class Loader { //2.6.7
    public static void main(String[] args) {
        int sum = 10;
        for (int i = 10; i < 100; i = i + 10) {
            System.out.println(sum += i);
        }
        System.out.println(sum);
    }
}
 */

