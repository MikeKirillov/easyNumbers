public class HW {
    public static void main(String[] args) {
        Sobachka ururu = new Sobachka();//вызов нестатичных методов. метод вызывается через новый объект
        ururu.lildog();

        Sobachka.doggystat();//вызов статичных методов. указывается сразу класс.метод();
        //////////
        lalala();//вызов метода с выводом в консоль текста
        hahaha();//не выведится, но посчитает
        int a = 1 + hahaha();
        System.out.println("hahaha было = "+hahaha()+", а стало = "+a);//выведет в консоль результат расчета
    }
    private static void lalala(){//создание метода, который ничего не возвращает (void), просто текст в конссоль
        System.out.println("lalala - без ретурна");
    }
    private static int hahaha(){//создание метода, который будет выводить заданный return (int)
        return 1+2+3+4+5;//после return происходит выход из метода, потому ниже него больше ничего не пишется
    }
}

class Sobachka{
    public void lildog(){
        System.out.println("lildog is not static");
    }
    public static void doggystat(){
        System.out.println("doggystat is static");
    }
}

