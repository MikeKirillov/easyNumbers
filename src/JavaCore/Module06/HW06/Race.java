package JavaCore.Module06.HW06;

public class Race {
    public static void main(String[] args) {
        MotorVehicle benz = new Car("Mercedes-Benz", "AMG GT", 650, 380, true);
        MotorVehicle kawa = new Motorcycle("Kawasaki", "Ninja H2R", 310, 380);

        benz.getTopSpeed();
        kawa.getTopSpeed();
    }
}