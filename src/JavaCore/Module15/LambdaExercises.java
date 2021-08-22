package JavaCore.Module15;

public class LambdaExercises {
    public static double doubleFromString(int value, Worker worker) {
        return worker.rework(value);
    }

    public static void main(String[] args) {
        // trying to use lambda except of doubleFromString
        doubleFromString(5, value -> (double) value);
    }
}

interface Worker {
    double rework(int value);
}