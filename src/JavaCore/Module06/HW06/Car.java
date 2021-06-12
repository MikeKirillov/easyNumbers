package JavaCore.Module06.HW06;

public class Car extends MotorVehicle {
    public boolean tuned;

    public Car(String brand, String model, int hp, int topSpeed, boolean tuned) {
        super(brand, model, hp, (!tuned ? topSpeed : (topSpeed + 50)));
        this.tuned = tuned;
        if (tuned) {
            System.out.println("It was tuned! Such a cheater!");
        }
    }
}