package JavaCore.Module07.Zoo;

import java.util.Arrays;

public class Zoo {
    Object[] objects;

    public Zoo() {
        objects = new Object[3];

        objects[0] = new Dog();
        objects[1] = new Cat();
        objects[2] = new Reptile();
    }

    public void print() {
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }
    }

    public void change(Object object, int i) {
        if (i >= 0 && i < objects.length) objects[i] = object;
    }

    @Override
    public String toString() {
        return "Zoo: " + Arrays.toString(objects);
    }
}
