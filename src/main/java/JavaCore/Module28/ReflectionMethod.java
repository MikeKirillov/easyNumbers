package JavaCore.Module28;

import java.lang.reflect.Modifier;

public class ReflectionMethod {
    public static void main(String[] args) throws ClassNotFoundException {
        Class hashMap = Class.forName("java.util.HashMap");
        Class abstractMap = Class.forName("java.util.AbstractMap");
        Class map = Class.forName("java.util.Map");
        Class arrayList = Class.forName("java.util.ArrayList");
        Class abstractList = Class.forName("java.util.AbstractList");
        Class collection = Class.forName("java.util.Collection");

        int hashMapModifiers = hashMap.getModifiers();
        int abstractMapModifiers = abstractMap.getModifiers();
        int mapModifiers = map.getModifiers();
        int arrayListModifiers = arrayList.getModifiers();
        int abstractListModifiers = abstractList.getModifiers();
        int collectionModifiers = collection.getModifiers();

        System.out.println("HashMap is public: " + Modifier.isPublic(hashMapModifiers));
        System.out.println("AbstractMap is abstract: " + Modifier.isAbstract(abstractMapModifiers));
        System.out.println("Map is an interface: " + Modifier.isInterface(mapModifiers));
        System.out.println("HashMap is abstract: " + Modifier.isAbstract(hashMapModifiers));
        System.out.println("ArrayList is public: " + Modifier.isPublic(arrayListModifiers));
        System.out.println("ArrayList is protected: " + Modifier.isProtected(arrayListModifiers));
        System.out.println("AbstractList is static: " + Modifier.isStatic(abstractListModifiers));
        System.out.println("AbstractList is abstract: " + Modifier.isAbstract(abstractListModifiers));
        System.out.println("Collection is an interface: " + Modifier.isInterface(collectionModifiers));
    }
}
