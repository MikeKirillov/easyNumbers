package JavaCore.Module06.HW06;

public class MusicalInstrument {
    String name, manufacturer;
    int price;

    public MusicalInstrument(String name, String manufacturer, int price) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String info() {
        return name + " " + manufacturer + " " + price;
    }

    public String play() {
        return "duh";
    }
}

class Stringed extends MusicalInstrument {
    int quantyOfStrings;

    public Stringed(String name, String manufacturer, int price, int quantyOfStrings) {
        super(name, manufacturer, price);
        this.quantyOfStrings = quantyOfStrings;
    }

    public String play() {
        return name + " sounds so good";
    }

}

class Percussion extends MusicalInstrument {
    int year;

    public Percussion(String name, String manufacturer, int price, int year) {
        super(name, manufacturer, price);
        this.year = year;
    }

    public String play() {
        return "Bump";
    }
}
