package JavaCore.Module07.EpicBattle;

public class Human extends Entity implements Fighter{

    public Human(String name) {
        super(name + " the Man");
    }

    @Override
    public void attack(Entity entity){
        entity.takeDamage(1);
    }
}