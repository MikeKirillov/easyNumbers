package JavaCore.Module02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderLearn {
    public static void main(String[] args) throws IOException {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(inp);

        System.out.print("Enter weight (kg): ");
        double weight = Double.parseDouble(buff.readLine());
        System.out.print("Enter height (meters): ");
        double height = Double.parseDouble(buff.readLine());

        Body.calcIndex(weight, height);
    }
}

class Body {
    public static double massIndex;

    public static void calcIndex(double weight, double height) {
        massIndex = weight / (height * height);
        System.out.println("Mass index = " + massIndex);

        if (massIndex < 18.5) {
            System.out.println("Too slim");
        } else if (massIndex >= 18.5 && massIndex <= 25) {
            System.out.println("Normal");
        } else if (massIndex > 25 && massIndex < 30) {
            System.out.println("Too fat");
        } else if (massIndex >= 30) {
            System.out.println("How do u even live?");
        }
    }
}