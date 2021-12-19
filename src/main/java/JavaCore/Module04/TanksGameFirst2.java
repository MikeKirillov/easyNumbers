package JavaCore.Module04;

public class TanksGameFirst2 {
    public static void main(String[] args) {
        // В (0;0) с fuel = 100
        Tank2 justTank = new Tank2();
        justTank.goForward(200);
        justTank.printPosition();

        // В (10;10) с fuel = 100
        Tank2 anywareTank = new Tank2(10, 10);
        anywareTank.goBackward(-200);
        anywareTank.printPosition();

        // В (20;30) с fuel = 200
        Tank2 customTank = new Tank2(20, 30, 200);
        customTank.goForward(201);
        customTank.printPosition();
    }
}

class Tank2 {
    int x, y, dir, fuel;

    public Tank2() {
        this(0, 0, 100);
    }

    public Tank2(int x, int y) {
        this(x, y, 100);
    }

    public Tank2(int x, int y, int fuel) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;
    }

    //dir - 0 (x-right), 1 (y-down), 2 (x-left), 3 (y-up)
    public void goForward(int i) {
        if (i < 0 && -i > fuel) {
            i -= fuel;
        } else if (i > fuel) {
            i = fuel;
        }
        fuel -= Math.abs(i);

        switch (dir) {
            case 0 -> x += i;
            case 1 -> y += i;
            case 2 -> x -= i;
            default -> y -= i;
        }
    }

    public void goBackward(int i) {
        //x = x - i;
        goForward(-i);
    }

    public void turnRight() {
        dir++;
        if (dir == 4) {
            dir = 0;
        }
    }

    public void turnLeft() {
        dir--;
        if (dir == -1) {
            dir = 3;
        }
    }

    public void printPosition() {
        System.out.println("The Tank is at " + x + ", " + y + " now.");
    }
}
