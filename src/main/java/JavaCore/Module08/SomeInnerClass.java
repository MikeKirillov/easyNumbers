package JavaCore.Module08;

public class SomeInnerClass {// outer class
    private String methodName, methodMan;

    public SomeInnerClass(String methodName, String methodMan) {
        this.methodName = methodName;
        this.methodMan = methodMan;
    }

    @Override
    public String toString() {
        return "SomeInnerClass: " + "\n" +
                "methodName = '" + methodName + "'\n" +
                "methodMan = ' " + methodMan + '\'';
    }

    public int methodAge() {// ordinary method
        int age;

        class Age {// inner local class
            int someNumber;

            Age(int someNumber) {
                this.someNumber = someNumber;
                SomeInnerClass.this.methodMan = "AAAAAAAA";// ask variable of outer class
                methodName = "123";// alternate
            }
        }

        Age a = new Age(15);
        a.someNumber = 15;// ask for variable of inner local class

        return 0;
    }
}

class Mainz {
    public static void main(String[] args) {
        SomeInnerClass in = new SomeInnerClass("JEEEEEZ MAN", "METHODMAN");
        System.out.println(in.toString());
    }
}