package JavaCore.Module07.Selftask;

public class Car extends MotorVehicle implements Driveable{
    public boolean tuned;

    public Car(String brand, String model, int hp, int topSpeed, boolean tuned) {
        super(brand, model, hp, (!tuned ? topSpeed : (topSpeed + 50)));
        this.tuned = tuned;
        if (tuned) {
            System.out.println("It was tuned! Such a cheater!");
        }
    }

    @Override
    public String toString() {
        return "Brand: " + this.getBrand()
                + "\nModel: " + this.getModel()
                + "\nHorse power: " + this.getHp()
                + "\nTop speed: " + this.getTopSpeed()
                + "\nTuned: " + this.getTuned();
    }

    public boolean getTuned() {
        return tuned;
    }

    @Override
    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void stopEngine() {
        super.stopEngine();
    }

    @Override
    public void drive() {
        System.out.println("engine and exhaust system sounds so loud and good");
    }
}