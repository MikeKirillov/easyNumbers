package JavaCore.Module06.HW06;

public class Motorcycle extends MotorVehicle {
    public Motorcycle(String brand, String model, int hp, int topSpeed) {
        super(brand, model, hp, topSpeed);
    }

    @Override
    public String toString() {
        String str = "Brand: " + this.getBrand();
        str += "\nModel: " + this.getModel();
        str += "\nHorse power: " + this.getHp();
        str += "\nTop speed: " + this.getTopSpeed();
        return str;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Rider shows his exhaust sound");
    }

    public void stopEngine() {
        super.stopEngine();
    }
}