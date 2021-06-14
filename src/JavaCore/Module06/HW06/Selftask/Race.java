package JavaCore.Module06.HW06.Selftask;

import java.util.Scanner;

public class Race {
    final static private int START_SPEED = 0;// meters per sec
    final static private int PARTICIPANTS_COUNT = 2;
    final static private double TIME_CONV_HOUR_INTO_SEC = 3.6;// per sec

    static private int track_distance;// per meters

    public double time;
    private MotorVehicle[] vehicles;
    private int index = 0;

    public Race(int distance) {
        this.track_distance = distance;
        this.vehicles = new MotorVehicle[2];
    }

    public void add(MotorVehicle vehicle) {
        if (index < PARTICIPANTS_COUNT) {
            vehicles[index++] = vehicle;
        } else {
            System.out.println("Enough participants!");
        }
    }

    public void startRace() {
        race();
    }

    private void race() {
        for (MotorVehicle vehicle : vehicles) {
            System.out.println("--------------");
            System.out.println(vehicle);
            vehicle.startEngine();
            System.out.println("...all eyes on the driver...");
            time = track_distance / speedConvert(vehicle.topSpeed);
            vehicle.acceleration = (vehicle.topSpeed - START_SPEED) / time;
            vehicle.stopEngine();
            System.out.println("Riders finished " + track_distance + " meter(-s) track with following results:\ntime - " + time + ";\nacceleration - " + vehicle.acceleration);
        }
        System.out.println("--------------");
        System.out.println("RESULTS:");
        int i = 0;

        if (vehicles[i].acceleration < vehicles[i + 1].acceleration) {
            System.out.println(vehicles[i + 1].fullName + " finished 1st");
        } else if (vehicles[i].acceleration > vehicles[i + 1].acceleration) {
            System.out.println(vehicles[i].fullName + " finished 1st");
        } else if (vehicles[i].acceleration == vehicles[i + 1].acceleration) {
            System.out.println("DRAW");
        }
    }

    private double speedConvert(int speed) {
        return speed / TIME_CONV_HOUR_INTO_SEC;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter track distance: ");
        int distance = scanner.nextInt();

        Race race = new Race(distance);
        race.add(new Car("Mercedes-Benz", "AMG GT", 650, 380, true));
        race.add(new Motorcycle("Kawasaki", "Ninja H2R", 310, 380));
        race.startRace();

    }
}