package JavaCore.Module07.HM07.Selftask;

public abstract class Vehicle {
    private String brand, model;
    private int hp, topSpeed;
    private double acceleration;
    public boolean engineStatus;

    public Vehicle(String brand, String model, int hp, int topSpeed) {
        this.brand = brand;
        this.model = model;
        this.hp = hp;
        this.topSpeed = topSpeed;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(double acceleration) {
        this.acceleration = acceleration;
    }

    public boolean isEngineStatus() {
        return engineStatus;
    }

    public String getFullName() {
        return getBrand() + " " + getModel();
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getHp() {
        return hp;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setEngineStatus(boolean engineStatus) {
        this.engineStatus = engineStatus;
    }
}
