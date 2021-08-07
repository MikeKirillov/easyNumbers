package JavaCore.Module12.CarCompare;

import java.util.Objects;

public class Car {
    private final String brand;
    private final String name;
    private boolean isForSale;

    public Car (String brand, String name, boolean isForSale){
        if(brand == null || name == null) {// new object cannot be created without null values of brand or name
            throw new IllegalArgumentException();
        }

        this.brand = brand;
        this.name = name;
        this.isForSale = isForSale;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public boolean isForSale() {
        return isForSale;
    }

    public void setForSale(boolean forSale) {
        isForSale = forSale;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", isForSale=" + isForSale +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return brand.equals(car.brand) && name.equals(car.name) && isForSale == car.isForSale;
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, name);
    }
}
