package JavaCore.PracticeWeek02.Task03;

public class Dog implements Movable, Eat {
    @Override
    public void move() {
        System.out.println("running");
    }

    @Override
    public void eat() {
        System.out.println("eat a cat or someone else");
    }
}
