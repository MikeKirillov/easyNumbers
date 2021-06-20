package JavaCore.Module07.EpicBattle;

abstract public class Entity {
    public String name;
    public int hp = 100;
    public boolean destroyed;


    public Entity(String name) {
        this.name = name;
    }

    protected boolean damage(int dhp) {
        hp -= dhp;
        if (hp < 0) {
            destroyed = true;
            System.out.println("Monster " + name + " was destroyed");
            return true;
        }
        return false;
    }

    public boolean isDestroyed() {
        return destroyed;
    }
}
