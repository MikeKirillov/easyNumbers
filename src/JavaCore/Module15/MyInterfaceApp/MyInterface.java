package JavaCore.Module15.MyInterfaceApp;

public interface MyInterface {
    void task(String message);// abstract method

    default void doDefaultTask() {// default method
        System.out.println("Default task!");
    }
}
