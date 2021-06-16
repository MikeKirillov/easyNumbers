package JavaCore.Module07.ZombieBattle;

abstract public class Monster {
    private String name;
    private int force;
    private int hp = 15;
    private boolean destroyed = false;

    public Monster(String name, int force) {
        this.name = name;
        this.force = force;
        System.out.println("Monster " + name + " was created");
    }

    abstract public void attack(Monster monster);

    protected int getForce() {
        return force;
    }

    public boolean isDestroyed(){
        return destroyed;
    }

    protected boolean damage(int dhp) {
        hp = hp - dhp;
        destroyed = hp <= 0 ? true : false;
        return destroyed;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", force=" + force +
                ", hp=" + hp +
                ", destroyed=" + destroyed +
                '}';
    }
}