package JavaCore.Module06.HW06.Selftask;

public class MotorVehicle {
    public String brand, model, fullName;
    public int hp, topSpeed;
    public double acceleration;
    private boolean engineStatus;

    public MotorVehicle(String brand, String model, int hp, int topSpeed) {
        this.brand = brand;
        this.model = model;
        this.hp = hp;
        this.topSpeed = topSpeed;
        this.fullName = brand + " " + model;
        System.out.println(fullName + " was built!");
    }

    public void startEngine() {
        if (engineStatus) {
            System.out.println(fullName + " engine is already STARTED");
        } else {
            setEngineStatus(true);
            System.out.println(fullName + " engine is STARTED");
        }
    }

    public void stopEngine() {
        if (!engineStatus) {
            System.out.println(fullName + " engine is already STOPPED");
        } else {
            setEngineStatus(false);
            System.out.println(fullName + " engine is STOPPED");
        }
    }

    private void setEngineStatus(boolean engineStatus) {
        this.engineStatus = engineStatus;
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
}
