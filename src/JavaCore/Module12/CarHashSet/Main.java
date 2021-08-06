package JavaCore.Module12.CarHashSet;

import java.util.*;

public class Main {
    private static String KIA = "KIA";
    private static String BMW = "BMW";
    private static String TOYOTA = "TOYOTA";

    public static void main(String[] args) {// the task is to create the catalog of unique model cars
        // creating 10 car objects of different cars
        Car car1 = new Car(TOYOTA, "Camry", false);
        Car car2 = new Car(TOYOTA, "Corolla", false);
        Car car3 = new Car(TOYOTA, "Celica", true);
        Car car4 = new Car(KIA, "Rio", false);
        Car car5 = new Car(KIA, "Ceed", false);
        Car car6 = new Car(KIA, "Sportage", false);
        Car car7 = new Car(KIA, "Mohave", false);
        Car car8 = new Car(BMW, "X1", false);
        Car car9 = new Car(BMW, "X2", false);
        Car car10 = new Car(BMW, "X3", false);
        Car car11 = new Car(TOYOTA, "Camry", false);
        Car car12 = new Car(TOYOTA, "Corolla", false);
        Car car13 = new Car(TOYOTA, "Celica", true);
        Car car14 = new Car(KIA, "Rio", false);
        Car car15 = new Car(KIA, "Ceed", false);
        Car car16 = new Car(KIA, "Sportage", false);
        Car car17 = new Car(KIA, "Mohave", false);
        Car car18 = new Car(BMW, "X1", false);
        Car car19 = new Car(BMW, "X2", false);
        Car car20 = new Car(BMW, "X3", false);
        Car car21 = new Car(TOYOTA, "Camry", false);
        Car car22 = new Car(TOYOTA, "Corolla", false);
        Car car23 = new Car(TOYOTA, "Celica", true);
        Car car24 = new Car(KIA, "Rio", false);
        Car car25 = new Car(KIA, "Ceed", false);
        Car car26 = new Car(KIA, "Sportage", false);
        Car car27 = new Car(KIA, "Mohave", false);
        Car car28 = new Car(BMW, "X1", false);
        Car car29 = new Car(BMW, "X2", false);
        Car car30 = new Car(BMW, "X3", false);

        List<Car> carList = new ArrayList<>();// creating an ArrayList to fill it with the objects

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);
        carList.add(car7);
        carList.add(car8);
        carList.add(car9);
        carList.add(car10);
        carList.add(car11);
        carList.add(car12);
        carList.add(car13);
        carList.add(car14);
        carList.add(car15);
        carList.add(car16);
        carList.add(car17);
        carList.add(car18);
        carList.add(car19);
        carList.add(car20);
        carList.add(car21);
        carList.add(car22);
        carList.add(car23);
        carList.add(car24);
        carList.add(car25);
        carList.add(car26);
        carList.add(car27);
        carList.add(car28);
        carList.add(car29);
        carList.add(car30);

        Set<Car> carSet = new HashSet<>(carList);

        for (Car car : carSet) {
            System.out.println(car);
        }
    }
}
