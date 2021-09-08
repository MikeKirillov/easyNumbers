package JavaCore.JavaCorePractice;

public class BattleField {
    private boolean punchInDaFace(Character defender, Character attacker, FightCallback fightCallback) {
        int hit = attacker.hit();
        int defenderHP = defender.getHp() - hit;
        if (hit != 0) {
            System.out.printf("%s made a hit by %d points", attacker.getName(), hit);
            System.out.printf("%s has %d HP left", attacker.getName(), defenderHP);
        } else {
            System.out.printf("%s misses", attacker.getName());
        }
        if (defenderHP <= 0 && defender instanceof MainCharacter) {
            System.out.println("wasted");
            fightCallback.fightLost();
            return true;
        } else if (defenderHP <= 0) {
            System.out.printf("\nenemy lost. you gain %d gold and %d xp", defender.getGold(), defender.getXp());
            attacker.setGold(attacker.getGold() + defender.getGold());
            attacker.setXp(attacker.getXp() + defender.getXp());
            fightCallback.fightWin();
            return true;
        } else {
            defender.setHp(defenderHP);
            return false;
        }
    }

    public void battle(Character mainCharacter, Character enemy, FightCallback fightCallback) {
        Runnable runnable = () -> {
            int turn = 1;
            boolean isBattleEnded = false;
            while (!isBattleEnded) {
                System.out.println("\n-----Turn: " + turn + " -----");
                if (turn++ % 2 != 0) {
                    isBattleEnded = punchInDaFace(enemy, mainCharacter, fightCallback);
                } else {
                    isBattleEnded = punchInDaFace(mainCharacter, enemy, fightCallback);
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
