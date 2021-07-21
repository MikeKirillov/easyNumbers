package JavaCore.Module11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

import static java.nio.charset.StandardCharsets.UTF_8;

public class ArrIOUB {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("src/JavaCore/Module11/borodino.txt"), UTF_8);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number in range 1.." + lines.size());
        int n = in.nextInt();
//        System.out.println("This is a prediction for you:\n" + lines.get(n - 1));
//             //1st version with not exception catching
//
//        if (n < lines.size()) {// take exception with IF expression
//            System.out.println("This is a prediction for you:\n" + lines.get(n - 1));
//        } else {
//            System.out.println("You entered a wrong number!");
//        }

        try {// take exception with TRY-CATCH expression
            System.out.println("This is a prediction for you:\n" + lines.get(n - 1));
        } catch (Exception e) {
            System.out.println("You entered a wrong number!");
        }
    }
}
