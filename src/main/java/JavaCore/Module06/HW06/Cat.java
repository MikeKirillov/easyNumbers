package JavaCore.Module06.HW06;

public class Cat {
    public String name, owner;
    public int age;

    public Cat(String name, int age, String owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public String toString() {
        return "Кошке " + name + " уже " + age + ". Ее хозяин " + owner + " заботится о ней";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public void eat() {
    }

    public void run() {
    }
}

class PedigreeCat extends Cat {
    public String breed;

    public PedigreeCat(String name, int age, String owner, String breed) {
        super(name, age, owner);
        this.breed = breed;
    }

    public String toString() {
        return "Кошка " + this.getName() + " очень красива, хотя ей сейчас " + this.getAge() + ", она приинадлежит породе " + breed + ", и ее хозяин " + this.getOwner() + " очень гордится ею.";
    }

    public static void main(String[] args) {
        Cat cat = new PedigreeCat("Asha", 3, "Sasha", "Sphinx");
        System.out.println(cat.toString());
    }
}
