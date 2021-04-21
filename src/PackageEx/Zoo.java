package PackageEx;
//public-protected-private-default - модификаторы
public class Zoo{
    int getDogAge() {
        Dog dog = new Dog();//1-класс, 2-переменная, 3-новый объект
        return dog.age = 22;
    }
    int getDogHeight() {
        Dog sobaka = new Dog();
        return sobaka.height = 145;
    }
}
