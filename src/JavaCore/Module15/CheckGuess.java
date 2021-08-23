package JavaCore.Module15;

import java.util.Optional;
import java.util.Random;

public class CheckGuess {
    private static Optional<String> checkGuess(int guess) {
        if (guess < 1 || guess > 5) {
            throw new IllegalStateException();
        } else {
            int rand = new Random().nextInt(5) + 1;
            if (rand == guess) {
                return Optional.of("Congrats!");
            } else {
                return Optional.empty();
            }
        }
    }

    public static void main(String[] args) {
        Optional<String> optional = checkGuess(1);

        System.out.println(optional);
    }
}
