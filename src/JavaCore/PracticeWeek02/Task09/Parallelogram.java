package JavaCore.PracticeWeek02.Task09;

public class Parallelogram extends Quadrangle implements Figure {
    double alpha, beta;

    public Parallelogram(int a, int b, double alpha, double beta, String color) {
        super(a, b, color);
        this.alpha = alpha;
        this.beta = beta;
    }

    @Override
    public double getLargeDiagonal() {
        double arrr = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) + 2 * a * b * Math.cos(Math.toRadians(alpha)));
        double brrr = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) + 2 * a * b * Math.cos(Math.toRadians(beta)));
        return Math.max(arrr, brrr);
    }

    @Override
    public double getHeight() {
        double arrr = a * Math.sin(Math.toRadians(alpha));
        double brrr = b * Math.sin(Math.toRadians(beta));
        return Math.min(arrr, brrr);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double area() {
        return Math.max(a, b) * getHeight();
    }

    @Override
    public double perimeter() {
        return 2 * (a + b);
    }
}
