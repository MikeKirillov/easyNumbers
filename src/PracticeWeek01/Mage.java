package PracticeWeek01;

public class Mage {// task10
    String name;
    String type;//fire, ice, earth
    int level, damage;

    public Mage(String name, int level, int damage, String type) {
        this.name = name;
        this.level = level;
        this.damage = damage;
        this.type = type;
    }

    String getInfo() {
        return "Mage name - " + name + "\nlevel - " + level + "\ndeal damage - " + damage + "\nmagic type - " + type + "\n";
    }

    String fight(Mage mage) {
//    ⚡ Маг огня побеждает мага льда, но проигрывает магу земли.
//    ⚡ Маг льда побеждает мага земли, но проигрывает магу огня.
//    ⚡ Маг земли побеждает мага огня, но проигрывает магу льда.
//    ⚡Если же стихия магов одинаковая, то выигрывает более высокоуровневый маг, если же и уровни одинаковы, то
//    тот, у которого больший урон, если же и урон одинаковый, то вернуть строку draw (ничья).

        if (this.type.equals("fire") && mage.type.equals("ice") || this.type.equals("ice") && mage.type.equals("earth") || this.type.equals("earth") && mage.type.equals("fire")) {
            return this.name;
//        } else if (this.type.equals("fire") && mage.type.equals("earth") || this.type.equals("ice") && mage.type.equals("fire") || this.type.equals("earth") && mage.type.equals("ice")) {
//            return mage.name;
        } else if (!this.type.equals(mage.type)) {// alternative expression
            return mage.name;
        } else {
            if (this.level > mage.level) {
                return this.name;
            } else if (this.level < mage.level) {
                return mage.name;
            } else {
                if (this.damage > mage.damage) {
                    return this.name;
                } else if (this.damage < mage.damage) {
                    return mage.name;
                } else return "draw";
            }
        }

    }

    public static void main(String[] args) {
        Mage fireMage = new Mage("Fire", 14, 500, "fire");
        Mage iceMage = new Mage("Ice", 15, 350, "ice");
        Mage earthMage = new Mage("Earth", 22, 450, "earth");

        Mage newFireMage = new Mage("Fire New", 14, 550, "earth");

        System.out.println(fireMage.getInfo());
        System.out.println(fireMage.fight(earthMage));
    }
}
