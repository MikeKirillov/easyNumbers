package JavaCore.Module07.ZombieBattle;

public class Zombie extends Monster {
    public Zombie(String name, int force) {
        super(name + " the Zombie", force);
    }

    public void attack(Monster monster){
        monster.damage(getForce());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
