package JavaCore.Module07.Selftask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter track distance: ");
        int distance = scanner.nextInt();

        Race race = new Race(distance);
        race.add(new Car("Mercedes-Benz", "AMG GT", 650, 380, true));
        race.add(new ElectricCar("Tesla", "Model S", 700, 390));
        race.startRace();

    }
}
