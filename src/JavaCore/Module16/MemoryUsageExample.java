package JavaCore.Module16;

public class MemoryUsageExample {
    private static class Person{
        private final String name;
        private int age;

        Person (String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    public static void main(String[] args) {
        String name = "Eugene";
        int age = 26;

        Person person = new Person(name);
        person.setAge(age);
    }
}
