package JavaCore.JavaCorePractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class World {
    private static Character player = null;
    private static BattleField battleField = null;
    private static BufferedReader br;

    public static void main(String[] args) {// https://github.com/amsdevelops/dragon-slayer-epic-edition/tree/master/src/domain
        br = new BufferedReader(new InputStreamReader(System.in));
        battleField = new BattleField();
        System.out.println("Input character's name: ");
        try {
            command(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void command(String string) throws IOException {
        if (player == null) {
            player = new MainCharacter(string, 100, 20, 20, 0, 0);
            System.out.printf("Here's a hero %s which saves our world!%n", player.getName());
            printNavigation();
        }

        switch (string) {
            case "1" -> {
                System.out.println("Trader is not arrived yet");// gotta change later to selling method
                command(br.readLine());
            }
            case "2" -> {
                commitFight();
            }
            case "3" -> System.exit(1);
            case "yes" -> command("2");
            case "no" -> {
                printNavigation();
                command(br.readLine());
            }
        }
        command(br.readLine());
    }

    private static void commitFight() {
        battleField.battle(player, createEnemy(), new FightCallback() {
            @Override
            public void fightWin() {
                System.out.printf("\n%s won battle. you got %d xp, %d gold and %d hp left",
                        player.getName(), player.getXp(), player.getGold(), player.getHp());
                System.out.println("\nwanna continue? yes/no");
                try {
                    command(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void fightLost() {

            }
        });
    }

    private static Character createEnemy() {
        int rand = (int) (Math.random() * 10);
        if (rand % 2 == 0) {
            return new Goblin("Goblin", 50, 10, 10, 100, 20);
        } else return new Skeleton("Skeleton", 25, 20, 20, 100, 10);
    }

    private static void printNavigation() {
        System.out.println("Where to go?");
        System.out.println("1. To the trader");
        System.out.println("2. Into the dark forest");
        System.out.println("3. Exit");
    }
}
