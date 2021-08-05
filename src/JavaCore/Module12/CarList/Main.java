package JavaCore.Module12.CarList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    private static String KIA = "KIA";
    private static String BMW = "BMW";
    private static String TOYOTA = "TOYOTA";

    public static void main(String[] args) {
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

//        System.out.println(carList);

        // we need to remove all KIA 1st
//        for (Car car : carList) {
//            if (car.getBrand().equals(KIA)) {
//                carList.remove(car); // carList.removeIf(car -> car.getBrand().equals(KIA));
//            } else if (car.getBrand().equals(TOYOTA)) {
//                car.setForSale(true);
//            }
//        }

        // same as previous but it works
        Iterator<Car> iterator = carList.iterator();

        while (iterator.hasNext()) {
            Car car = iterator.next();

            if (car.getBrand().equals(KIA)) {
                iterator.remove(); // carList.removeIf(car -> car.getBrand().equals(KIA));
            } else if (car.getBrand().equals(TOYOTA)) {
                car.setForSale(true);
            }
        }

        for (Car car : carList) {
            System.out.println(car);
        }

    }
}
