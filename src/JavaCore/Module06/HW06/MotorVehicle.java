package JavaCore.Module06.HW06;

public class MotorVehicle {
    //private String brand, model;
    private int hp, topSpeed;
    public String fullName;

    public MotorVehicle(String brand, String model, int hp, int topSpeed) {
        //this.brand = brand;
        //this.model = model;
        this.hp = hp;
        this.topSpeed = topSpeed;
        this.fullName = brand + " " + model;
        System.out.println(fullName + " was built!");
    }

    public void getTopSpeed() {
        System.out.println(topSpeed);
    }

    public void drive() {
        System.out.println();
    }
}
