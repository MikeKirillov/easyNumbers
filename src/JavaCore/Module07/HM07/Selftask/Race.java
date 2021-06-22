package JavaCore.Module07.HM07.Selftask;

public class Race {
    final static private int START_SPEED = 0;// meters per sec
    final static private int PARTICIPANTS_COUNT = 2;
    final static private double TIME_CONV_HOUR_INTO_SEC = 3.6;// per sec

    static private int track_distance;// per meters

    public double time;
    private Vehicle[] vehicles;
    private int index = 0;

    public Race(int distance) {
        this.track_distance = distance;
        this.vehicles = new Vehicle[2];
    }

    public void add(Vehicle vehicle) {
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
        for (Vehicle vehicle : vehicles) {
            System.out.println("--------------");
            System.out.println(vehicle);
            ((Engine)vehicle).startEngine();// приведение к типу интерфейса Engine
            System.out.println("...all eyes on the driver...");
            time = track_distance / speedConvert(vehicle.getTopSpeed());
            vehicle.setAcceleration((vehicle.getTopSpeed() - START_SPEED) / time);
            ((Engine)vehicle).stopEngine();
            System.out.println("Driver finished " + track_distance + " meter(-s) track with following results:\ntime - " + time + ";\nacceleration - " + vehicle.getAcceleration());
        }
        System.out.println("--------------");
        System.out.println("RESULTS:");

        int i = 0;

        if (vehicles[i].getAcceleration() < vehicles[i + 1].getAcceleration()) {
            System.out.println(vehicles[i + 1].getFullName() + " finished 1st");
        } else if (vehicles[i].getAcceleration() > vehicles[i + 1].getAcceleration()) {
            System.out.println(vehicles[i].getFullName() + " finished 1st");
        } else if (vehicles[i].getAcceleration() == vehicles[i + 1].getAcceleration()) {
            System.out.println("DRAW");
        }
    }

    private double speedConvert(int speed) {
        return speed / TIME_CONV_HOUR_INTO_SEC;
    }
}