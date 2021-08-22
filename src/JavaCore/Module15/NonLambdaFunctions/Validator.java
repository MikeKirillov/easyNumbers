package JavaCore.Module15.NonLambdaFunctions;

@FunctionalInterface // just to check if interface has just 1 abstract method
public interface Validator {
    boolean validate (int value);
}
