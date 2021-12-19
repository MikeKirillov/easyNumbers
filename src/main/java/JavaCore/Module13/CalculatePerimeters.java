package JavaCore.Module13;

public class CalculatePerimeters {

    public static void main(String[] args) {
        int sideLengthTriangle = 3;
        int sideLengthSquare = 4;
        int radius = 5;

        System.out.println("Perimeter triangle = " + PerimeterTriangle(sideLengthTriangle));
        System.out.println("Perimeter square = " + PerimeterSquare(sideLengthSquare));
        System.out.println("Perimeter circle = " + PerimeterCircle(radius));
    }

    private static int PerimeterCircle(int radius) {
        return (int) (2 * Math.PI * radius);
    }

    private static int PerimeterSquare(int sideLengthSquare) {
        return 4 * sideLengthSquare;
    }

    private static int PerimeterTriangle(int sideLengthTriangle) {
        return 3 * sideLengthTriangle;
    }
}
