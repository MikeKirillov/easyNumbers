package JavaCore.Module15.MyInterfaceApp;

public class MyInterfaceImpl implements MyInterface {
    @Override
    public void task(String message) {
        System.out.println("doing my task " + message);
    }

    @Override
    public void doDefaultTask() {// optional for implementing
        System.out.println("doing default. no rushing");
    }
}