package JavaCore.Module14;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableAnimal {// example of self-createed immutable class
    private final String species;
    private final int age;
    private final List<String> favoriteBooks;

    public ImmutableAnimal(String species, int age, List<String> favoriteBooks) {
        this.species = species;
        this.age = age;
        this.favoriteBooks = new ArrayList<>(favoriteBooks);
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public List<String> getFavoriteBooks() {
        return new ArrayList<>(favoriteBooks);
    }
}
