package JavaCore.Module12;

import java.util.List;

public class GenericMainClassHW {
    public static void main(String[] args) {

    }

    public static void addToList(List<? super Parent> list) {
        list.add(new Child());
        System.out.println("Nice added into the list");
    }
}

class Parent {

}

class Child extends Parent {

}