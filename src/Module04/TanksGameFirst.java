package Module04;

public class TanksGameFirst {
    public static void main(String[] args) {
        Tank tank = new Tank();
        tank.goForward(10);
        tank.printPosition();
        tank.turnRight();
        tank.goForward(50);
        tank.printPosition();
        tank.turnLeft();
        tank.goBackward(100);
        tank.printPosition();
    }
}

class Tank {
    int x, y, dir;

    //dir - 0 (x-right), 1 (y-down), 2 (x-left), 3 (y-up)
    public void goForward(int i) {
        switch (dir) {
            case 0: // default value
                x += i;
                break;
            case 1:
                y += i;
                break;
            case 2:
                x -= i;
                break;
            default:
                y -= i;
                break;
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