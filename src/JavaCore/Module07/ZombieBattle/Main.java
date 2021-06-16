package JavaCore.Module07.ZombieBattle;

public class Main {
    public static void main(String[] args) {
        Zombie bruh = new Zombie("Bruh", 15);
        Zombie alice = new Zombie("Alice", 5);
        bruh.attack(alice);
        System.out.println(bruh);
        System.out.println(alice);
    }
}
