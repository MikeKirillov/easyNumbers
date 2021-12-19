package JavaCore.Module12;

import JavaCore.Module06.HW06.Person;

import java.util.Objects;

public class PersonHash {
    private final long id;
    private final String name;
    private int age;// cannot be included to hash cuz it can be changed (not final value)

    public PersonHash(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);// AGE cannot be included to hash cuz it can be changed (not final value)
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        PersonHash person = (PersonHash) obj;
        return id == person.id && age == person.age && name.equals(person.name);
    }
}
