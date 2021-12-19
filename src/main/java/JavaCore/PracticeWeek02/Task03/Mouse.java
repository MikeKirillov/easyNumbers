package JavaCore.PracticeWeek02.Task03;

public class Mouse implements Movable, Edible {
    @Override
    public void move() {
        System.out.println("running af");
    }

    @Override
    public void beEaten() {
        System.out.println("dont eat me ffs");
    }
}
