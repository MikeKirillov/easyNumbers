package JavaCore.Module07.HM07.Selftask;

public class Motorcycle extends MotorVehicle implements Engine {
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

    public void startEngine() {
        if (engineStatus) {
            System.out.println(getFullName() + " engine is already STARTED");
        } else {
            setEngineStatus(true);
            System.out.println(getFullName() + " engine STARTED");
        }
    }

    public void stopEngine() {
        if (!engineStatus) {
            System.out.println(getFullName() + " engine is already STOPPED");
        } else {
            setEngineStatus(false);
            System.out.println(getFullName() + " engine STOPPED");
        }
    }
}