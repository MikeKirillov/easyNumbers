package JavaCore.Module07.Selftask;

public class Motorcycle extends MotorVehicle {
    public Motorcycle(String brand, String model, int hp, int topSpeed) {
        super(brand, model, hp, topSpeed);
    }

    @Override
    public String toString() {
        return "Brand: " + this.getBrand()
                + "\nModel: " + this.getModel()
                + "\nHorse power: " + this.getHp()
                + "\nTop speed: " + this.getTopSpeed();
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