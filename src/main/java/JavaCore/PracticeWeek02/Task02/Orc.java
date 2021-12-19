package JavaCore.PracticeWeek02.Task02;

public class Orc implements Playable {
    @Override
    public String attack() {
        return "axe blow";
    }

    @Override
    public String move() {
        return "run";
    }

    @Override
    public String defence() {
        return "block";
    }
}
