package JavaCore.Module12.CarList;

public class Car {
    private String brand;
    private String name;
    private boolean isForSale;

    public Car (String brand, String name, boolean isForSale){
        this.brand = brand;
        this.name = name;
        this.isForSale = isForSale;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
