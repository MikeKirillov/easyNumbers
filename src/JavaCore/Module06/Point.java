package JavaCore.Module06;

public class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        System.out.println("Points with cords " + x + " ," + y);
    }
}

class ColorPoint extends Point {
    private String color;

    public ColorPoint(double x, double y, String color) {
        super(x, y);
        this.color = color;
    }

    public void print() {
        super.print();
        System.out.println(" and color: " + color);
    }
}