package JavaCore.PracticeWeek02.Task03;

public class Cat implements Movable, Eat, Edible {
    @Override
    public void move() {
        System.out.println("walking around with my bud");
    }

    @Override
    public void eat() {
        System.out.println("eat ya");
    }

    @Override
    public void beEaten() {
        System.out.println("pls dont....");
    }
}
