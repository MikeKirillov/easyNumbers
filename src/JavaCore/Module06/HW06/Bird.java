package JavaCore.Module06.HW06;

public class Bird {
    String type;
    String[] continents;
    int population;

    public Bird(String type, String[] continents, int population) {
        this.type = type;
        this.continents = continents;
        this.population = population;
    }
}

class Pigeon extends Bird {
    int hunger;

    public Pigeon(String[] continents, int population, int hunger) {
        super("pigeon", continents, population);
        this.hunger = hunger;
    }

    public int getHunger() {
        return hunger;
    }

    public void askForSeeds() {
        System.out.println("Gimme some food bitch!");
        hunger = hunger - 7;
        if (hunger < 0) hunger = 0;
        System.out.println("Thx! Cheers!");
    }

    public void sleep() {
        System.out.println("Zzzzz");
        hunger = hunger + 3;
    }

    public static void main(String[] args) {
        Pigeon p = new Pigeon (new String[]{"NA", "SA", "Eurasia", "Australia"}, 1000000, 10);
        System.out.println(p.hunger);
        p.askForSeeds();
        System.out.println(p.hunger);
        p.sleep();
        System.out.println(p.hunger);
    }
}
