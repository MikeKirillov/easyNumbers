package JavaCore.Module12.GenericCrate;

public class Crate<T> {// generic-class
    private T contents;

    public Crate(T contents) {
        this.contents = contents;
    }

    public Crate() {

    }

    public T getContents() {
        return contents;
    }

    public void setContents(T contents) {
        this.contents = contents;
    }

    public static <T> Crate<T> ship(T stuff) {// generic-method
        System.out.println("Preparing " + stuff);
        return new Crate<T>();
    }

    public static <T extends Number> void ship(T number) {// upper bound
        double value = number.doubleValue();
        System.out.println("Preparing " + value);
    }
}