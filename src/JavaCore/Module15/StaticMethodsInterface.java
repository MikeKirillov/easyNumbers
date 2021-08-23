package JavaCore.Module15;

public class StaticMethodsInterface implements Hop{
    private void printDetails() {
        System.out.println(Hop.getJumpHeight());// example of how to call static interface methods
    }
}

interface Hop {
    static int getJumpHeight() {
        return 10;
    }
}
