package JavaCore.JavaCorePractice;

public class Character implements Fightable {
    private String name;
    private int hp, agility, strength, xp, gold;

    public Character(String name, int hp, int agility, int strength, int xp, int gold) {
        this.name = name;
        this.hp = hp;
        this.agility = agility;
        this.strength = strength;
        this.xp = xp;
        this.gold = gold;
    }

    @Override
    public int hit() {
        // если наша ловкость, умноженная на 3, больше,
        // чем случайное значение (от 0 до 100),
        // то мы атакуем в размере нашей силы,
        // если нет, то возвращаем 0, что приравнивается к промаху
        if (agility * 3 > getRandHitPointsValue()) return strength;
        else return 0;
    }

    private int getRandHitPointsValue() {
        return (int) (Math.random() * 100);
    }

    @Override
    public String toString() {
        return String.format("%s health: %d", name, hp);// maybe change something
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
}
