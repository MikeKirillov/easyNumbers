package JavaCore.Module07.Zoo;

public class Cat extends Animal implements Soundable{
    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "I am a Cat";
    }

    @Override
    public void sound() {
        System.out.println("Meow!");
    }
}
