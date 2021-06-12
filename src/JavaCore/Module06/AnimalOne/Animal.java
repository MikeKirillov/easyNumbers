package JavaCore.Module06.AnimalOne;

public class Animal {// superclass, parent class
    private boolean vegetarian;
    private String eats;
    private String type;

    public Animal() {
        System.out.println("Creature was created as an Animal!");
    }

    public Animal(String type, boolean veg, String food) {
        this.type = type;
        this.vegetarian = veg;
        this.eats = food;
    }

    public void sound() {

    }

    public String getEats() {
        return eats;
    }

    public String getType() {
        return type;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }
}

class Cat extends Animal {//child class from Animal

    public Cat() {
        super("cat", false, "milk and meat");// counstructor 'Cat' asks constructor 'Animal(boolean veg, String food)'
    }

    public void sound() {
        System.out.println("meow");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.sound();
        System.out.println(cat.getType() + " eats " + cat.getEats());
    }
}
