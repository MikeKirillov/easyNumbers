package JavaCore.Module27.Patterns;

public class PrototypePattern {
    /*Прототип — это порождающий паттерн проектирования, который позволяет копировать объекты,
    не вдаваясь в подробности их реализации*/

    /*В JDK имеется встроенное решение паттерна. Это встроенный интерфейс Cloneable.
    Объекты, которые нужно клонировать, должны имплементить интерфейс Cloneable.
    А в самих классах необходимо переопределить метод clone().*/

    //Проверим создание клонов
    public static void main(String[] args) {
        //  Создадим автомобиль
        Car car = new Car(1, "Mercedes", (Tyre) new Tyre("Pirelli", 19));
        System.out.println(car);
        //  Теперь создадим копию автомобиля, вызвав метод getClone().
        //  Т.к. метод getClone() возвращает Object, на нужно произвести приведение к типу Car
        Car car2 = (Car) car.getClone();
        System.out.println(car2);

        System.out.println("\nЗаменим резину у оригинального автомобиля");
        //Убедимся, что мы получили независимую копию нашего автомобиля. Для этого у оригинала заменим колеса на другие.
        car.getTyre().setName("Dunlop");// обращение к сеттеру имени колеса через класс Tyre внутри объекта Car от геттера
        System.out.println(car);
        System.out.println(car2);
    }
}

//  Создаем интерфейс Prototype. На схеме имеет аналогичное название.
/*public*/ interface Prototype {
    Object getClone();
}

//  Создаем класс Tyre и реализуем в нем интерфейс Prototype. Объекты этого класса мы будем клонировать.
//  На схеме обозначен ConcretePrototype. Объект этого класса будет выступать в качестве поля класса Car.
class Tyre implements Prototype {
    private String name;
    private int size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    //  Создаем конструктор
    public Tyre(String name, int size) {
        this.name = name;
        this.size = size;
    }

    //  Переопределяем toString()
    @Override
    public String toString() {
        return "Tyre{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }

    //  Переопределяем метод getClone() интерфейса Prototype.
    @Override
    public Object getClone() {
        //  Создает клон объекта Tyre и возвращает его в виде объекта Object.
        //  Нам останется лишь привести возвращенный Object к типу Tyre.
        return new Tyre(name, size);
    }
}

//  Создаем класс Car и реализуем в нем интерфейс Prototype. Объекты этого класса мы будем клонировать.
//  На схеме обозначен ConcretePrototype. Одно из полей класса содержит объект Tyre.
class Car implements Prototype {
    private int id;
    private String name;
    private Tyre tyre;

    //  Создаем геттеры и сеттеры для приватных полей
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

    //  Создаем конструктор
    public Car(int id, String name, Tyre tyre) {
        this.id = id;
        this.name = name;
        this.tyre = tyre;
    }

    //  Переопределяем toString()
    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tyre=" + tyre +
                '}';
    }

    //  Переопределяем метод getClone()
    @Override
    public Object getClone() {
        //  Создает клон объекта Car и возвращает его в виде объекта Object.
        //  Нам останется лишь привести возвращенный Object к типу Car.
        //  Копирование простых полей как в классе Tyre.
        //  А вот простое копирование поля Tyre приведет к копированию ссылки на объект Tyre.
        //  Для клонирования объекта Tyre мы вызываем у него метод getClone().
        return new Car(id, name, (Tyre) tyre.getClone());
    }
}