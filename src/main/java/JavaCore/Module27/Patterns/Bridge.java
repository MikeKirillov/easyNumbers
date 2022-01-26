package JavaCore.Module27.Patterns;

public class Bridge {
    /*Мост — это структурный паттерн проектирования, который разделяет один или несколько классов на
    две отдельные иерархии: абстракцию и реализацию, чтобы можно было изменять их независимо друг от друга*/
}

//  Создадим абстрактный класс Fastfood, он и будет нашей абстракцией
/*public*/ abstract class Fastfood {
    private Terminal terminal;//    Класс Fastfood содержит ссылку на интерфейс Terminal (на схеме Implementor).

    //  сеттер для терминала, чтобы мы могли на лету изменить конкретный терминал
    public void setTerminal(Terminal terminal) {
        this.terminal = terminal;
    }

    //  Конструктор, который принимает в качестве параметра интерфейс Terminal, что позволяет нам не привязывать код к конкретному реализатору.
    Fastfood(Terminal terminal) {
        this.terminal = terminal;
    }

    //  Метод saleFood(int cost) продает еду по цене cost
    public void saleFood(int cost) {
        getInfo();
        terminal.bill(cost);
    }

    abstract void getInfo();//  абстрактный метод, который выведет информацию о конкретной Абстракции
}

//  Конкретная абстракция. В конструктор в качестве параметра принимает интерфейс Terminal
/*public*/ class DonaldDuck extends Fastfood {
    DonaldDuck(Terminal terminal) {
        super(terminal);
    }

    @Override
    void getInfo() {
        System.out.println("Donald Duck");
    }
}

//  Конкретная абстракция. В конструктор в качестве параметра принимает интерфейс Terminal
/*public*/ class CKF extends Fastfood {
    CKF(Terminal terminal) {
        super(terminal);
    }

    @Override
    void getInfo() {
        System.out.println("CKF");
    }
}

//интерфейс терминала, на схеме интерфейс Implementor
/*public*/ interface Terminal {
    void bill(int cost);//  Определим для примера метод, принимающий оплату
}

// конкретная имплементация интерфейса Terminal
/*public*/ class NfcTerminal implements Terminal {
    @Override
    public void bill(int cost) {
        System.out.println("NFC Terminal billing " + cost);
    }
}

// конкретная имплементация интерфейса Terminal
/*public*/ class TouchTerminal implements Terminal {
    @Override
    public void bill(int cost) {
        System.out.println("Touch Terminal billing " + cost);
    }
}

// Теперь попробуем, как это работает
/*public*/ class Main {
    public static void main(String[] args) {
        //Создаем фастфуд с терминалом
        Fastfood ckf = new CKF(new NfcTerminal());
        ckf.saleFood(50);
        ckf.setTerminal(new TouchTerminal());// сменим терминал
        ckf.saleFood(570);

        Fastfood donald = new DonaldDuck(new TouchTerminal());
        donald.saleFood(300);
    }
}
