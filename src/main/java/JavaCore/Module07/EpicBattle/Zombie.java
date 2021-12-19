package JavaCore.Module07.EpicBattle;

public class Zombie extends Monster implements Fighter{

    public static String scream = "Raaaauuughhhh";

    public Zombie(String name) {
        super(name + " the Zombie", 5);
    }

    public void growl(){
        System.out.println(scream);
    }

    @Override
    public void attack(Entity entity) {
        entity.takeDamage(getForce());
        growl();
    }
}