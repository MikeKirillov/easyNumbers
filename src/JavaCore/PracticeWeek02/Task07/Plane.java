package JavaCore.PracticeWeek02.Task07;

public class Plane extends Transport {
    public Plane(int fuel, int speed) {
        super(fuel, speed);
    }

    @Override
    public int getFuelLevel() {
        return fuel;
    }

    @Override
    public boolean canMove(int n) {
        if (fuel >= n) {
            fuel = fuel - n;
            return true;
        } else
            return false;
    }

    public void fillFuel(int n) {
        fuel = fuel + n;
    }
}
