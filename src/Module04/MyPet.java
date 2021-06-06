package Module04;

public class MyPet {
    public static void main(String[] args) {
         //1st try
        Cat barsik = new Cat();// создали барсика - новый объект класса Cat, выделив ему память в классе
        barsik.weight = 3000;
        barsik.color = "orange";

        barsik.meow();
    }
}

class Cat {
    //поля класса
    double weight;
    String name;
    int age;
    String color;

    //методы класса
    void meow() {
        System.out.println("MEOW");
    }

    void pee() {
        weight = weight - 20;
    }

    void eat() {
        weight += 50;
    }
}