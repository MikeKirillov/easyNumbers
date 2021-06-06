package Module04;

public class MyPet2 {
    public static void main(String[] args) {
        // 2nd try
        Cat2 barsik = new Cat2();
        Cat2 bigCat = new Cat2(5500, 2, "Murka", "Black");
        Cat2 smallCat = new Cat2(1000, 1, "Kuzya", "White");
    }
}

class Cat2 {
    double weight;
    int age;
    String name;
    String color;

//    public Cat2() {
//        // контструктор без аргументов - по умолчанию
//        weight = 3000;
//        age = 1;
//        name = "Barsik";
//        color = "Grey";
//    }

//    public Cat2(double weight1, int age1, String name1, String color1) {
//        // конструктор, принимающий на вход аргументы
//        // можно создавать несколько функций с одинаковыми именами, главное, чтоб был разный набор арументов - статический полиморфизм
//        weight = weight1;
//        age = age1;
//        name = name1;
//        color = color1;
//    }

    public Cat2() {
        // контструктор без аргументов - по умолчанию
        this(3000, 1, "Barsik", "Grey");
        // вызов другого конструктора
    }

    public Cat2(double weight, int age, String name, String color) {
        // this - ссылка на поля класса
        this.weight = weight;
        this.age = age;
        this.name = name;
        this.color = color;
    }

    void eat() {
        this.weight = weight + 50;
    }

    void pee() {
        this.weight -= 20;
    }
}