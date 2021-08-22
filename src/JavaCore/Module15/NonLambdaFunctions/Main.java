package JavaCore.Module15.NonLambdaFunctions;

public class Main {
    public static void main(String[] args) {
        int value = 70;
//        validate(value, new ValidatorImpl()); // call and create an object of the ValidatorImpl class
        validate(value, new Validator() {// implementing Validator interface and creating object (without lambda-functions)
            @Override
            public boolean validate(int value) {
                return value >= 80;
            }
        });
    }

    public static void validate(int value, Validator validator) {
        System.out.println("Checking value by validator...");
        boolean isValid = validator.validate(value);
        if (isValid) {
            System.out.println("Nice! Its valid!");
        } else {
            System.out.println("Oops! Something goes wrong...");
        }
    }
}