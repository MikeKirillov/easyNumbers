package JavaCore.Module28;

public class SomeClass {
    public static void main(String[] args) throws ClassNotFoundException {
        Class claass;

        claass = SomeClass.class;

/* // doesn't work with object. just Class
        SomeClass someClass = new SomeClass();
        claass = someClass.class;
*/

        claass = Class.forName("SomeClass");
        claass = Class.forName("JavaCore.Module28.SomeClass"); // is better kind of writing

        SomeClass someClass = new SomeClass();
        claass = someClass.getClass(); // uses with object, not class



        Integer integer = 12;
        Class cl = Integer.class;
        cl = Class.forName("Integer");
        cl = integer.getClass();
    }
}
