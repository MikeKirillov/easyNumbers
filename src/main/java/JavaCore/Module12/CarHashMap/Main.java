package JavaCore.Module12.CarHashMap;

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

        Map<Car, Integer> carIntegerMap = new HashMap<>();

        // iteration for ArrayList
        for (Car car : carList) {// putting cars into HashMap from key 1 to +1 value to previous (starts from 1)
            if (carIntegerMap.containsKey(car)) {
                int value = carIntegerMap.get(car);
                carIntegerMap.put(car, ++value);
            } else {
                carIntegerMap.put(car, 1);
            }
        }

        // iteration for HashMap
        for (Map.Entry<Car, Integer> carIntegerEntry : carIntegerMap.entrySet()) {
            System.out.println(carIntegerEntry.getKey() + " = " + carIntegerEntry.getValue());
        }
    }
}
