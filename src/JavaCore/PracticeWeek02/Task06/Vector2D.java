package JavaCore.PracticeWeek02.Task06;

public class Vector2D extends Vector {
    public Vector2D(int x1, int y1, int x2, int y2) {
        super(x1, y1, 0, x2, y2, 0);
    }

    @Override
    public double getLength() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    @Override
    public String getVectorCords() {
        return (x2 - x1) + " " + (y2 - y1);
    }

    public double scalarProduct(Vector2D vector) {
        return 0;
    }

    public double getAngle(Vector2D vector) {
        return 0;
    }
}
