package JavaCore.Module06.MonsterOne;

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
    public Zombie(String name) {
        super (name + " the Zombie", 5);
    }

    @Override
    public void attack() {
        super.attack();
        growl();
    }

    @Override
    public void growl() {
        System.out.print("Raaaauuughhhh");
        super.growl();
    }

    public static void main(String[] args) {
        Zombie zombie = new Zombie("Bob");
        zombie.attack();
        zombie.growl();
    }
}