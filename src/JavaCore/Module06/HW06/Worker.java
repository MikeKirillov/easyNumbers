package JavaCore.Module06.HW06;

public class Worker {
//    public int age, salary;// изначально выглядело так. надо скрыть то, что получаем методами
//    public String profession;
    public int salary;
    private int age;
    private String profession;

    public Worker(int age, int salary, String profession) {
        this.age = age;
        this.salary = salary;
        this.profession = profession;
    }

    public int getAge() {
        return age;
    }

    public String getProfession() {
        return profession;
    }
}
