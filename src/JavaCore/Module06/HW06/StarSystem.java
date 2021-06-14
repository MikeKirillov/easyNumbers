package JavaCore.Module06.HW06;

public class StarSystem {
    private String starName;
    private int quantityOfPlanets;
    private long age;

    public StarSystem(String starName, int quantityOfPlanets, long age) {
        this.starName = starName;
        this.quantityOfPlanets = quantityOfPlanets;
        this.age = age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public void setStarName(String starName) {
        this.starName = starName;
    }

    public void setQuantityOfPlanets() {
        this.quantityOfPlanets = quantityOfPlanets;
    }

    public int getQuantityOfPlanets() {
        return quantityOfPlanets;
    }

    public String getStarName() {
        return starName;
    }

    public long getAge() {
        return age;
    }

    public String getInfo() {
        return starName + quantityOfPlanets + age;
    }
}

class SunSystem extends StarSystem {
    private long population;

    public SunSystem(String starName, int quantityOfPlanets, long age, long population) {
        super("sun", quantityOfPlanets, age);
        this.population = population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public long getPopulation() {
        return population;
    }

    public String getInfo(){
        return "Это самая густонаселенная звездная система во вселенной (наверное)";
    }

    public static void main(String[] args) {
        StarSystem star = new SunSystem("sun",11,2000000000,2000000000);
        StarSystem star2 = new StarSystem("sun",11,2000000000);
        System.out.println(star2.getInfo());
        System.out.println(star.getInfo());
        System.out.println(star instanceof SunSystem);
    }
}