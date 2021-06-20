package JavaCore.Module07.Zoo;

import java.util.Arrays;

public class Zoo {
    Object[] objects;

    public Zoo() {
        objects = new Object[3];

        objects[0] = new Dog();
        objects[1] = new Reptile();
        objects[2] = new PopcornStall();
    }

//    Soundable[] objects;// to look at objects as Soundable things of different type (dogs, cats, stalls, cars etc.)
//
//    public Zoo() {
//        objects = new Soundable[3];
//
//        objects[0] = new Dog();
//        objects[1] = new Reptile();
//        objects[2] = new PopcornStall();
//    }

    public void print() {
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }
    }

    public void change(Object object, int i) {
        if (i >= 0 && i < objects.length) objects[i] = object;
    }

//    public void change(Soundable object, int i) {
//        if (i >= 0 && i < objects.length) objects[i] = object;
//    }


    @Override
    public String toString() {
        return "Zoo: " + Arrays.toString(objects);
    }

//    public void sound() {
//        for (Soundable a : objects) {
//            a.sound();
//        }
//    }

    public void sound() {
        for (Object a : objects) {
            if (a instanceof Soundable)
                ((Soundable)a).sound();// приведение к типу Soundable объектов изначального типа (класса) Object
                //сначала выполняется приведение объекта к типу Soundable, затем вызов метода sound()
        }
    }
}
