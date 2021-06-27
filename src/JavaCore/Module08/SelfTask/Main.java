package JavaCore.Module08.SelfTask;

public class Main {
    public static void main(String[] args) {
        Xbox xbox = new Xbox("Series S", 512);
        System.out.println(xbox);

//        Xbox.Controller controller = xbox.new Controller(true);
//        System.out.println(controller);

        System.out.println("\n" + xbox.new Controller(true));// alternate one

        xbox.turnPower("off");
        System.out.println(xbox.getWorkingState());
    }
}
