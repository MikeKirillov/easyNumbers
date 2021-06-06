package JavaCore.Module03.HWM3;

public class HomeWork {
//    public static void main(String[] args) {//task 01 - done
//        int[] arr01 = new int[]{5, 24, 3, 66, 38, 16, 27};
//        Arrays.sort(arr01);
//        System.out.println(Arrays.toString(arr01));
//        System.out.println(arr01[2]);
//    }

//    public static void main(String[] args) {//task 02 - done and this example is a better one
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter UserName: ");
//        String userName = scanner.nextLine();
//
//        System.out.print("Enter Password: ");
//        String password = scanner.nextLine();
//
//        while (password.length() < 8 || password.length() > 15) {
//            if (password.length() < 8) {
//                System.out.println("Wrong password. It must be more than 8 sings!");
//                System.out.print("Enter password one more time: ");
//                password = scanner.nextLine();
//            } else if (password.length() > 15) {
//                System.out.println("Wrong password. It must be less than 15 sings!");
//                System.out.print("Enter password one more time: ");
//                password = scanner.nextLine();
//            }
//        }
//        System.out.println("Your name is: " + userName + "\nYour password is: " + password);
//    }

//    public static void main(String[] args) {//task 03
//        String[] namesArr = new String[]{"Mike", "Nick", "Ann", "Mary", "Paul"};
//        int[][] pointsArr = new int[][]{
//                {5, 4, 3, 2, 1},
//                {4, 5, 3, 5, 2},
//                {2, 5, 2, 2, 1},
//                {2, 5, 1, 2, 2},
//                {1, 2, 2, 1, 4}
//        };
//        String[] result = new String[5];
//        int[] pointsSummArr = new int[5];
//
//        for (int i = 0; i < namesArr.length; i++) {
//            for (int j = 0; j < namesArr.length; j++) {
//                pointsSummArr[i] = pointsSummArr[i] + pointsArr[i][j];
//            }
//            System.out.println(result[i] = namesArr[i] + " - " + pointsSummArr[i]);
//        }
//    }

//    public static int[] numbers = new int[100];//task 05
//
//    public static void main(String[] args) {
//        numbers[0] = 1;
//        for (int i = 0; i < numbers.length; i++){
//            numbers[i] = (int) (Math.pow(-1, i) * (numbers[i] + i));
//        }
//        System.out.println(Arrays.toString(numbers));
//    }

//    public static int[] numbers = new int[30];//task 06
//
//    public static void main(String[] args) {
//        numbers[0] = numbers[1] = 1;
//        for (int i = 2; i < numbers.length; i++) {
//            numbers[i] = numbers[i-1] + numbers[i-2];
//        }
//        System.out.println(Arrays.toString(numbers));
//    }

//    public static short size = 30;//task 07
//    public static int[][] ints = new int[size][];
//
//    public static void main(String[] args) {
//        ints[0] = new int[]{1};
//        ints[1] = new int[]{1, 1};
//
//        for (int i = 2; i < size; i++) {
//            int[] line = new int[i + 1];
//            line[0] = line[i] = 1;
//
//            for (int j = 1; j < line.length - 1; j++) {
//                line[j] = ints[i - 1][j - 1] + ints[i - 1][j];
//            }
//            ints[i] = line;
//        }
//
//        for (int i = 0; i < size; i++) {
//            System.out.println(Arrays.toString(ints[i]));
//        }
//    }

//    public static Character[] output;//task 08
//    public static String[] strings = new String[]{
//            "Claudius, King of Denmark.",
//            "Hamlet, Son to the former, and Nephew to the present King.",
//            "Polonius, Lord Chamberlain.",
//            "Horatio, Friend to Hamlet.",
//            "Laertes, Son to Polonius.",
//            "Voltimand, Courtier.",
//            "Cornelius, Courtier.",
//            "Rosencrantz, Courtier.",
//            "Guildenstern, Courtier.",
//            "Osric, Courtier.",
//            "A Gentleman, Courtier.",
//            "A Priest.",
//            "Marcellus, Officer.",
//            "Bernardo, Officer.",
//            "Francisco, a Soldier",
//            "Reynaldo, Servant to Polonius.",
//            "Players.",
//            "Two Clowns, Grave-diggers.",
//            "Fortinbras, Prince of Norway.",
//            "A Captain.",
//            "English Ambassadors.",
//            "Ghost of Hamlet's Father."
//    };
//
//    public static void main(String[] args) {
//        output = new Character[strings.length];
//        int z = 0;
//
//        for (int i = 0; i < strings.length; i++) {
//            output[i] = strings[i].charAt(z);
//        }
//        Arrays.stream(output).forEach(System.out::print);
//    }

    //    public static short size = 9;//task 09
//    public static String[][] strings;
//
//    public static void main(String[] args) {
//        strings = new String[size][size];
//
//        for (int i = 0; i < size; i++) {
//            for (int j = 0; j < size; j++) {
//                strings[i][j] = (char)('A' + j) + String.valueOf((size - i));
//            }
//        }
//
//        for (int i = 0; i < size; i++) {
//            System.out.println(String.join(" ", strings[i]));
//        }
//    }

//    public static String string = "helloworld";//task 10
//
//    public static void main(String[] args) {
//        System.out.println(string);
//
//        while (string.length() > 2) {
//            string = string.substring(1, string.length() - 1);
//            System.out.println(string);
//        }
//    }

    //task 11
    public static String text = "Lorem ipsum is";

    public static String encrypt(String text, int shift) {
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = upper.toLowerCase();
        char[] encrypted = new char[text.length()];

        while (shift < 0) {
            shift += upper.length();
        }

        for (int i = 0; i < text.length(); i++) {
            if ('A' <= text.charAt(i) && text.charAt(i) <= 'Z') {
                encrypted[i] = upper.charAt((upper.indexOf(text.charAt(i)) + shift) % upper.length());
            } else if ('a' <= text.charAt(i) && text.charAt(i) <= 'z') {
                encrypted[i] = lower.charAt((lower.indexOf(text.charAt(i) + shift) % lower.length()));
            } else {
                encrypted[i] = text.charAt(i);
            }
        }
        return new String(encrypted);
    }

    public static String decrypt(String text, int shift) {
        return encrypt(text, -shift);
    }

    public static void main(String[] args) {
        System.out.println(encrypt(text, 5));
    }
}