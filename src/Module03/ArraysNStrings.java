package Module03;

import java.util.Scanner;

public class ArraysNStrings {
    public static void main(String[] args) {
//        int[] arr = new int[11];
//        arr[0] = 1;
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);

//        int[] array = {1, 2, 3, 4, 5, 6, 7};//копирование массива и его длины
//        int[] brray = Arrays.copyOf(array, array.length);
//        System.out.println(Arrays.toString(brray));//Позволяет получить все элементы в виде одной строки

//        int[] array = {1, 2, 3, 4, 5, 6, 7};//копирование массива в заданном диапазоне
//        int[] brray = Arrays.copyOfRange(array,4, 6);
//        System.out.println(Arrays.toString(brray));

//        int[] array = {4, 2, 1, 0, 5, 9, 12};//сортировка массива
//        Arrays.sort(array);//сортировка массива
//        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.binarySearch(array,9));//Ищем элемент и печатаем его индекс в консоль
//
//        Arrays.fill(array,15);//заполнение массива одним значением
//        System.out.println(Arrays.toString(array));
//
//        int[] vrray = Arrays.copyOf(array, 4);
//        System.out.println(Arrays.equals(array, vrray));//сравнение 2х массивов
//    }

//    public static void main(String[] args) {
//        int[] array = new int[11];//задали пустой массив длиной 11 ячеек
//        int value = 5;//создали некую переменную
//        for (int i = 0; i < array.length; i++) {//задаем цикл прохода по каждому элементу массива от 0
//            // до конечного значения по всей длине массива
//            array[i] = value;//задаем 1му элементу значение переменной value
//            value++;//прибавляем 1 к переменной value
//        }
//        System.out.println(Arrays.toString(array));//выводим итоговый массив строкой
//    }

//    public static void main(String[] args) {//конкатенация (объединение) строк
//        String a = "SALAM ";
//        String b = "BEACH!";
//        System.out.println(a + b);//1й способ
//
//        System.out.println("salam " + "aleikum");//2й способ - без объявления переменных
//
//        String c = " - babka yagodka opyat'";
//        int d = 45;
//        System.out.println(d + c);//3й сопособ с переводом численного типа в строку
//        System.out.println(c.length());//количество символа в строке
//        System.out.println(c.charAt(5));//получение символа по индексу в строке. можно также из строки, а не переменной
//
//        System.out.println(c.concat("FFFFFFFFF"));//конкатенация 4й сопособ
//
//        System.out.println(a.equals(b));//сравнение строк
//
//        String z = "salam ";
//        System.out.println(a.equalsIgnoreCase(z));//сравнение строк с игнором регистра
//
//        System.out.println(a.indexOf('A'));//вернет индекс символа
//        System.out.println("Hfafaelala".indexOf('a'));//вернет индекс символа
//        System.out.println(c.lastIndexOf("opyat"));//вернет индекс символа STRING STR
//
//        System.out.println("hi! my name is WHAT? my name is WHO? my name is SLIM SHADY".replace('a','u'));//замена символа
//        System.out.println("hi! my name is WHAT? my name is WHO? my name is SLIM SHADY".replaceAll("name","WTF FFS"));//замена всех попаданий в строке
//        System.out.println("hi! my name is WHAT? my name is WHO? my name is SLIM SHADY".replaceFirst("my","AAAAAAA"));//замена только первого попадания
//
//        String str = "my name is WHAT, my name is WHO, my name is SLIM SHADY";//разбиение строки на элементы массива
//        String[] arrToSplit = str.split(", ");
//        for(String word:arrToSplit){
//            System.out.println(word);
//        }
//
//        System.out.println("my name is WHAT, my name is WHO, my name is SLIM SHADY".substring(5));//Возвращает новую строку, которая является подстрокой
//        System.out.println("my name is WHAT, my name is WHO, my name is SLIM SHADY".substring(5,15));
//
//        System.out.println("my name is WHAT, my name is WHO, my name is SLIM SHADY".toLowerCase());//смены регистра
//        System.out.println("my name is WHAT, my name is WHO, my name is SLIM SHADY".toUpperCase());
//
//        System.out.println("  my name is WHAT, my name is WHO, my name is SLIM SHADY    ".trim());//убирает лишние пробелы
//
//        String streng = String.valueOf(5);//Возвращает строковое представление переданного аргумента
//        System.out.println(streng);
//    }
//        String sumtimz = "Sometime";//3.2.1
//        System.out.println(sumtimz.charAt(2));

//        String vanya = "Ivan Ivanov";//3.2.2
//        String vanechka = "ivan ivanov";
//        System.out.println(vanya.equals(vanechka));

//        String vanya = "Ivan Ivanov";//3.2.3
//        String vanechka = "ivan ivanov";
//        System.out.println(vanya.equalsIgnoreCase(vanechka));

//        String vanya = "Ivan Ivanov";//3.2.4
//        String vanechka = "ivan ivanov";
//
//        if (vanechka.equalsIgnoreCase(vanya)){
//            System.out.println("Chose different name please");
//        } else {
//            System.out.println("Nice name!");
//        }

//        String vanya = "Ivan Ivanov";//3.2.5
//        String vanechka = "ivan ivanov";
//        checkUserName(vanechka, vanya);
//    }
//
//    private static void checkUserName(String vanechka, String vanya) {//3.2.5 continue
//        if (vanechka.equalsIgnoreCase(vanya)) {
//            System.out.println("Chose different name please");
//        } else {
//            System.out.println("Nice name!");
//        }
//    }

//        String vanya = "Vladimir Ivanov";//3.2.6
//        String vanechka = "ivan ivanov";
//        checkUserName(vanechka, vanya);
//    }
//
//    private static void checkUserName(String vanechka, String vanya) {//3.2.6 continue
//        if (vanechka.equalsIgnoreCase(vanya)) {
//            System.out.println("Chose different name please");
//        } else {
//            System.out.println("Nice name!");
//            System.out.println("Your name length is " + vanya.length() + " sings");
//        }
//    }

//        String vanya = "Vladimir Ivanov";//3.2.7
//        String vanechka = "ivan ivanov";
//        checkUserName(vanechka, vanya);
//    }
//
//    private static void checkUserName(String vanechka, String vanya) {//3.2.7 continue
//        String vanyaNew = vanya.replace(" ", "");
//        if (vanechka.equalsIgnoreCase(vanya)) {
//            System.out.println("Chose different name please");
//        } else {
//            System.out.println("Nice name!");
//            System.out.println("Your name length is " + vanya.length() + " sings");
//            System.out.println("Your name length without down spaces is " + vanyaNew.length() + " sings");
//        }
//    }

//        String team = "Iowa";//String obj
//        team = team + " State";//modifying this obj
//        System.out.println(team);
//
//        StringBuilder otherTeam = new StringBuilder("University");//same using StringBuilder
//        otherTeam.append(" of Nothern Iowa");
//        System.out.println(otherTeam);

//        StringBuilder someExample = new StringBuilder("Big Sky");//another example of using StringBuilder
//        someExample.append(" Montana");
//        char[] hasSomething = new char[]{' ','h','a','s',' '};
//        someExample.append(hasSomething);
//        someExample.append(12);
//        someExample.append(" lifts.");
//        System.out.println(someExample);

//        StringBuffer javaStrBuff = new StringBuffer("Java is ");//example of using StringBuffer
//        javaStrBuff.append("great!!");
//        System.out.println(javaStrBuff);
//        javaStrBuff.insert(15, " yes..");//insert method
//        System.out.println(javaStrBuff);
//        javaStrBuff.replace(13, 15, "??");//replace method
//        System.out.println(javaStrBuff);
//        javaStrBuff.reverse();//reverse method
//        System.out.println(javaStrBuff);

//        System.out.println(removeWhiteSpaces("А роза упала на лапу Азора"));//3.2.8-1
//    }
//
//    private static String removeWhiteSpaces(String s) {//3.2.8-1 continue
//        return s.replaceAll(" ", "");//same result with replace method
//    }

//        Scanner scanner = new Scanner(System.in);//3.2.8-2
//        boolean isCorrectName = false;
//        while (!isCorrectName) {
//            String name = scanner.nextLine(); //Считывает строку из System.in и присваивает в новую переменную
//            isCorrectName = checkName(name);
//            if (!isCorrectName) System.out.println("Введите корректное имя!");
//        }
//    }
//
//    private static boolean checkName(String name) {//3.2.8-2 continue
//        String[] words = name.trim().split(" ");
//        return words.length == 3;
//    }

//        Scanner scanner = new Scanner(System.in);//3.2.8-3
//        boolean isCorrectName = false;
//        while (!isCorrectName) {
//            String name = scanner.nextLine(); //Считывает строку из System.in
//            isCorrectName = checkName(name);
//            if (!isCorrectName) {
//                System.out.println("Введите корректное имя!");
//            } else {
//                System.out.println(formatName(name));
//            }
//        }
//    }
//
//    private static boolean checkName(String name) {//3.2.8-3 проверка на количество слов - 3
//        String[] words = name.trim().split(" ");
//        return words.length == 3;
//    }
//
//    private static String formatName(String name) {//3.2.8-3 каждое слово должно быть с большой буквы
//        String[] words = name.trim().split(" ");
//        sortByLength(words);//вызов метода сортировки
//        StringBuilder result = new StringBuilder();
//        for (String str : words) {
//            char firstChar = str.charAt(0);
//            if (!Character.isUpperCase(firstChar)) {
//                result.append(Character.toUpperCase(firstChar)).append(str.substring(1)).append(" ");
//            } else {
//                result.append(str).append(" ");
//            }
//        }
//        return result.toString();
//    }
//
//    private static void sortByLength(String[] words) {//3.2.8-3 сортировка по длине от меньшего к большему
//        for (int i = 0; i < words.length - 1; i++) {
//            for (int j = 0; j < words.length - 1; j++) {
//                if (words[j].length() > words[j + 1].length()) {
//                    String tmp = words[j];
//                    words[j] = words[j + 1];
//                    words[j + 1] = tmp;
//                }
//            }
//        }
//    }

        Scanner scanner = new Scanner(System.in);//3.2.8-4
        boolean isCorrectNumber = false;
        while (!isCorrectNumber) {
            String phoneNumber = scanner.nextLine(); //Считывает строку из System.in
            isCorrectNumber = checkName(phoneNumber);
            if (!isCorrectNumber) {
                System.out.println("Введите корректный номер!");
            } else {
                System.out.println(formatName(phoneNumber));
            }
        }
    }

    private static boolean checkName(String phoneNumber) {//3.2.8-4
        String clean = phoneNumber.replaceAll("[^0-9]","");//заменяем все смволны, не равные натуральным
        //числам на "", чтоб получить единую строку с цифрами
        return clean.length() == 11;
    }

    private static String formatName(String phoneNumber) {//3.2.8-4
        String clean = phoneNumber.replaceAll("[^0-9]","");//заменяем все символы, не равные натуральным >
        //> числам на "", чтоб получить единую строку с цифрами
        //89167000810 - пример номера для проверки
        return "+7 " + clean.substring(1, 4) + " " + clean.substring(4, 7) + " " + clean.substring(7, 9) + " " + clean.substring(9);
        //возвращаем номер телефона в нужном формате с добавлением пробелом и тд
    }
}