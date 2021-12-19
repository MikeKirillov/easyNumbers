package JavaCore.Module12.CarCompare;

import java.util.*;

public class Main {
    private static String KIA = "KIA";
    private static String BMW = "BMW";
    private static String TOYOTA = "TOYOTA";

    public static void main(String[] args) {// the task is to understand the number of unique cars with all 3 values

        List<Car> carList = new ArrayList<>();// creating an ArrayList to fill it with the objects

        // creating 30 car objects of different cars
        carList.add(new Car(TOYOTA, "Camry", false));
        carList.add(new Car(TOYOTA, "Corolla", false));
        carList.add(new Car(TOYOTA, "Celica", true));
        carList.add(new Car(KIA, "Rio", false));
        carList.add(new Car(KIA, "Ceed", false));
        carList.add(new Car(KIA, "Sportage", false));
        carList.add(new Car(KIA, "Mohave", false));
        carList.add(new Car(BMW, "X1", false));
        carList.add(new Car(BMW, "X2", false));
        carList.add(new Car(BMW, "X3", false));
        carList.add(new Car(TOYOTA, "Camry", false));
        carList.add(new Car(TOYOTA, "Corolla", false));
        carList.add(new Car(TOYOTA, "Celica", true));
        carList.add(new Car(KIA, "Rio", false));
        carList.add(new Car(KIA, "Ceed", false));
        carList.add(new Car(KIA, "Sportage", false));
        carList.add(new Car(KIA, "Mohave", false));
        carList.add(new Car(BMW, "X1", false));
        carList.add(new Car(BMW, "X2", false));
        carList.add(new Car(BMW, "X3", false));
        carList.add(new Car(TOYOTA, "Camry", false));
        carList.add(new Car(TOYOTA, "Corolla", false));
        carList.add(new Car(TOYOTA, "Celica", true));
        carList.add(new Car(KIA, "Rio", false));
        carList.add(new Car(KIA, "Ceed", false));
        carList.add(new Car(KIA, "Sportage", false));
        carList.add(new Car(KIA, "Mohave", false));
        carList.add(new Car(BMW, "X1", false));
        carList.add(new Car(BMW, "X2", false));
        carList.add(new Car(BMW, "X3", false));

        Set<Car> carSet = new TreeSet<>(new CarComparator().reversed());// sorting from Z to A
        carSet.addAll(carList);// adding all objects from carList to carSet

        for (Car car : carSet) {
            System.out.println(car.getName());
        }
    }
}
