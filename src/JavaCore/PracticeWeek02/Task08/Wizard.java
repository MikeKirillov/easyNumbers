package JavaCore.PracticeWeek02.Task08;

public class Wizard extends Player {
    int manaLevel;
    String element;

    public Wizard(int hp, int level, String type, String weapon, int manaLevel, String element) {
        super(hp, level, type, weapon);
        this.manaLevel = manaLevel;
        this.element = element;
    }

    @Override
    public void levelUp() {
        level = level + 1;
    }

    @Override
    public String getFullInfo() {
        return hp + " " + level + " " + type + " " + weapon + " " + manaLevel + " " + element;
    }

    @Override
    public boolean doDamage() {
        int n = 10;
        if (manaLevel >= n) {
            manaLevel = manaLevel - n;
            return true;
        } else
            return false;
    }
}
