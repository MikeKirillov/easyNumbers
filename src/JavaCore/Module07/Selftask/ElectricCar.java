package JavaCore.Module07.Selftask;

public class ElectricCar extends ElectricVehicle implements Driveable {
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
    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void stopEngine() {
        super.stopEngine();
    }

    @Override
    public void drive() {
        System.out.println("is it even working? nobody hears any sound from the e-engine");
    }
}
