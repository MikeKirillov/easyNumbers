package JavaCore.Module06.HW06.Selftask;

public class Car extends MotorVehicle {
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
//        String str = "Brand: " + this.getBrand();
//        str += "\nModel: " + this.getModel();
//        str += "\nHorse power: " + this.getHp();
//        str += "\nTop speed: " + this.getTopSpeed();
//        str += "\nTuned: " + this.getTuned();
//        return str;
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

    public void stopEngine() {
        super.stopEngine();
    }
}