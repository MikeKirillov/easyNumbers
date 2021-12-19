package JavaCore.Module07.Zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zoo =  new Zoo();
        zoo.change(new Dog(), 2);
        System.out.println(zoo);
    }
}
