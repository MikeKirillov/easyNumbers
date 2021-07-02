package JavaCore.PracticeWeek02.Task09;

public class Rhombuses extends Quadrangle implements Figure {
    double alpha, beta;

    public Rhombuses(int a, double alpha, double beta, String color) {
        super(a, a, color);
        this.alpha = alpha;
        this.beta = beta;
    }

    @Override
    public double getLargeDiagonal() {
        double arrr = Math.sqrt(Math.pow(a, 2) + Math.pow(a, 2) + 2 * a * a * Math.cos(Math.toRadians(alpha)));
        double brrr = Math.sqrt(Math.pow(a, 2) + Math.pow(a, 2) + 2 * a * a * Math.cos(Math.toRadians(beta)));
        return Math.max(arrr, brrr);
    }

    @Override
    public double getHeight() {
        return a * Math.sin(Math.toRadians(alpha));
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double area() {
        return getHeight() * a;
    }

    @Override
    public double perimeter() {
        return 4 * a;
    }
}
