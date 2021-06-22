package JavaCore.Module07.HM07.Selftask;

public class ElectricCar extends ElectricVehicle implements Driveable, Engine {
    public ElectricCar(String brand, String model, int hp, int topSpeed) {
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
    public void drive() {
        System.out.println("is it even working? nobody hears any sound from the e-engine");
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
