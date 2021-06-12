package JavaCore.Module06.MonsterTwo;

public class Monster {
    private String name;
    int damage;

    public Monster(String name, int damage) {
        this.name = name;
        this.damage = damage;
        System.out.println("Monster " + name + " was created");
    }

    public void growl() {
        System.out.println(" " + name + " growled");
    }

    public void attack() {
        System.out.println("Monster " + name + " attacked with damage " + damage);
    }
}

class Zombie extends Monster {
    public static String scream = "Raaaauuughhhh";

    public Zombie(String name) {
        super(name + " the Zombie", 5);
    }

    @Override
    public void attack() {
        super.attack();
        growl();
    }

    @Override
    public void growl() {
        System.out.print(scream);
        super.growl();
    }

    public void growl(boolean loud) {
        if (!loud) {
            growl();
        } else {
            System.out.print(scream.toUpperCase());
            super.growl();
        }
    }

    public static void main(String[] args) {
        Zombie zombie = new Zombie("Alice");
        zombie.growl();
        zombie.growl(true);
        zombie.growl(false);
    }
}