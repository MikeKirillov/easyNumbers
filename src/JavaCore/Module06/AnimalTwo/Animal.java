package JavaCore.Module06.AnimalTwo;

public class Animal {
    public void print() {
        System.out.println("salam aleikum");
    }
}

class Mammal extends Animal {
    public void print() {
        System.out.println("I am an Mammal");
    }
}

class Reptile extends Animal {
    public void print() {
        System.out.println("I am a Reptile");
    }
}

class Dog extends Mammal {
    public void print() {
        System.out.println("I am a Dog");
    }
}

class Cat extends Mammal {
    public void print() {
        System.out.println("I am a Cat");
    }
}

class Test {
    public static void main(String[] args) {
        Animal c = new Cat();
        Animal r = new Reptile();
        Animal d = new Dog();

        System.out.println(c instanceof Animal);
        System.out.println(r instanceof Mammal);
        System.out.println(d instanceof Dog);
        System.out.println(r instanceof Animal);
        System.out.println(r instanceof Reptile);
        d.print();
    }
}