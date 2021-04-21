public class StringsLocal {
    public static void main(String[] args) {
        String str = "string";//создание переменной со ссылкой на класс String
        String str2 = "string";//создание переменной в строковом пуле (StringLocal) со str
        String str3 = new String("string");//альтернативный вариант создания

        System.out.println(str==str2);//сравнение ссылок внутри StringLocal
        System.out.println(str2==str3);//сравнение ссылок из StringLocal и newString
        System.out.println(str.equals(str3));//сравнение значений внутри между StringLocal и newString

        str3 = str3.intern();//отправка значения str3 в пул с отсылкой на него через
        // одноименную переменну, поскольку иначе результат будет также false
        System.out.println(str==str3);//сравнение значений из пула со значением в пуле
        // через упакованную и отправленную переменную
    }
}
