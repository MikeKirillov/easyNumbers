package JavaCore.JavaCorePractice;

public class Trader extends Character implements Sellable {
    public Trader(String name, int hp, int agility, int strength, int xp, int gold) {
        super(name, hp, agility, strength, xp, gold);
    }

    @Override
    public String sell(Staff staff) {
        String deal = "";
        if (staff == Staff.HEALING_POTION || staff == Staff.MANA_POTION)
            deal = staff.getTitle();
        return deal;
    }

    @Override
    public String buy(Staff staff) {
        String deal = "";
        if (staff == Staff.HEALING_POTION || staff == Staff.MANA_POTION)
            deal = staff.getTitle();
        return deal;
    }

    public enum Staff {
        HEALING_POTION("Healing potion", 100),
        MANA_POTION("Mana potion", 150);

        private String title;
        private int cost;

        Staff(String title, int cost) {
            this.title = title;
            this.cost = cost;
        }

        public String getTitle() {
            return title;
        }

        public int getCost() {
            return cost;
        }
    }
}
