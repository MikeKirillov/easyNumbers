package PracticeWeek01;

public class Human {// task05
    private String name, address, work;
    private int age, weight;

    public Human(String name, int age, int weight, String address, String work) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.address = address;
        this.work = work;
    }

    public Human(String name, int age) {
        this(name, age, 60);
    }

    public Human(String name, String address) {
        this.name = name;
        this.address = address;
        this.age = 25;
        this.weight = 60;
    }

    public Human(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = 60;
    }

    public Human(String name, int age, String work) {
        this(name, age);
        this.weight = 60;
        this.work = work;
    }

    public Human(int age, int weight, String address, String work) {
        this.name = "Vincenzo";
        this.age = age;
        this.weight = weight;
        this.address = address;
        this.work = work;
    }
}
