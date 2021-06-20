package JavaCore.Module07.EpicBattle;

public abstract class Monster extends Entity implements Fighter{
//    private String name;// moved to Entity
    private int force;
//    private int hp = 15;// moved to Entity
//    private boolean destroyed = false;// moved to Entity

    public Monster(String name, int force) {
        super(name);
        this.force = force;
        System.out.println("Monster " + name + " was created");
    }

    protected int getForce(){
        return force;
    }

//    public boolean isDestroyed(){// moved to Entity
//        return destroyed;
//    }

//    protected boolean damage(int dhp){// moved to Entity
//        hp -= dhp;
//        if (hp < 0){
//            destroyed = true;
//            System.out.println("Monster " + name + " was destroyed");
//            return true;
//        }
//        return false;
//    }

//    abstract public void attack(Monster monster);// moved to Fighter
}