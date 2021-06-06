package Module04;

public class MyPet3 {
    public static void main(String[] args) {
        // 2nd try
        Cat3 barsik = new Cat3();
        final Cat3 bigCat = new Cat3(5500, 2, "Murka", "Black");// нельзя изменить ссылку на данный объект
        Cat3 smallCat = new Cat3(1000, 1, "Kuzya", "White");

//        bigCat.weight += 100;
//        System.out.println("BigCat weight is " + bigCat.weight);

        bigCat.setName("Pushok"); // присвоение имени
        //bigCat = smallCat;// не работает, т.к. bigCat - final
        //bigCat = new Cat3(500, 3, "Garfild", "White");// не работает, т.к. bigCat - final

        System.out.println("BigCat's name is " + bigCat.getName()); // вывод последнего присвоенного имени
        System.out.println("BigCat's name is " + smallCat.getName());
    }
}

class Cat3 {
    private double weight;// доступны только внутри класса
    private int age;
    private String name;
    private String color;
    private static int catCount;// статическое поле
    public final double MAX_WEIGHT = 10_000;// константа на максимальное значение веса. значение не может быть изменено

    public Cat3() {
        // контструктор без аргументов - по умолчанию
        this(3000, 1, "Barsik", "Grey");
        // вызов другого конструктора
    }

    public Cat3(double weight, int age, String name, String color) {
        // this - ссылка на поля класса
        this.weight = weight;
        this.age = age;
        this.name = name;
        this.color = color;
        catCount++;// увеличение счетчика кошек
    }

    public double getWeight() {
        return weight;
    }

    public void eat() {
        this.weight = weight + 50;
        if (50 / weight > .01) {
            pee();
        }
    }

    private void pee() {
        this.weight -= 20;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > this.age) {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        meow();
        meow();
        meow();
    }

    public void meow() {
        System.out.println("MEOW! ");
    }
}
