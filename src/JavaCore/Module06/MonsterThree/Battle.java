package JavaCore.Module06.MonsterThree;

public class Battle {
    final static private int MAX_COUNT = 5;
    private Monster[] monsters;
    private int index = 0;

    public Battle() {
        monsters = new Monster[MAX_COUNT];
    }

    public void add(Monster monster) {
        if (index < MAX_COUNT) {
            monsters[index++] = monster;
        } else {
            System.out.println("No more monsters!");
        }
    }

    public void start() {
        run();
    }

    private void run() {
        for (int i = 0; i < monsters.length; i++) {
            if (monsters[i] != null) monsters[i].attack();
        }
    }

    public static void main(String[] args) {
        Battle battle = new Battle();
        battle.add(new Zombie("Alice"));
        battle.add(new Zombie("Bob"));
        battle.add(new Zombie("Eve"));
        battle.add(new GiantSnake("Kaa"));
        battle.add(new GiantSnake("Son of Kaa"));

        battle.add(new Zombie("Noname"));
        battle.add(new GiantSnake("Noname"));

        battle.start();
    }
}
/*  Monster Alice the Zombie was created
    Monster Bob the Zombie was created
    Monster Eve the Zombie was created
    Monster Kaa the GiantSnake was created
    Monster Son of Kaa the GiantSnake was created
    Monster Noname the Zombie was created
    No more monsters!
    Monster Noname the GiantSnake was created
    No more monsters!
    Monster Alice the Zombie attacked with damage 5
    Raaaauuughhhh Alice the Zombie growled
    Monster Bob the Zombie attacked with damage 5
    Raaaauuughhhh Bob the Zombie growled
    Monster Eve the Zombie attacked with damage 5
    Raaaauuughhhh Eve the Zombie growled
    SSSSSS Kaa the GiantSnake growled
    Monster Kaa the GiantSnake attacked with damage 7
    Ssssss Kaa the GiantSnake growled
    ...and hid in the grass
    SSSSSS Son of Kaa the GiantSnake growled
    Monster Son of Kaa the GiantSnake attacked with damage 7
    Ssssss Son of Kaa the GiantSnake growled
    ...and hid in the grass */