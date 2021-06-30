package JavaCore.PracticeWeek02.Task05;

public abstract class People {
    String name, profession;
    int age;

    public People(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public abstract String getProfession();

    public abstract int getAge();

    public abstract String getName();
}
