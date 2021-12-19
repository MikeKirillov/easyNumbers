package JavaCore.Module01;

public class HW {
    public static void main(String[] args) {
        Sobachka ururu = new Sobachka();//вызов нестатичных методов. метод вызывается через новый объект
        ururu.lildog();

        Sobachka.doggystat();//вызов статичных методов. указывается сразу класс.метод();
        //////////
        lalala();//вызов метода с выводом в консоль текста
        //hahaha();//не выведится, но посчитает
        int z = 1 + hahaha(1, 2, "qwe");//перечень аргументов (не путать с параметрами)
        System.out.println("hahaha было = " + hahaha(1, 2, "dfd") + ", а стало = " + z);//выведет в консоль
        // результат расчета
    }

    private static void lalala() {//создание метода, который ничего не возвращает (void), просто текст в конссоль
        System.out.println("lalala - без ретурна");
    }

    private static int hahaha(int a, int b, String qqq) {//создание метода,
        // который будет выводить заданный return (int) с перечислением параметров (не путать с аргументами)
        return a + b;//после return происходит выход из метода, потому ниже него больше ничего не пишется
    }
}
/*
блочный комментарий
 */

class Sobachka {
    public void lildog() {
        System.out.println("lildog is not static");
    }

    public static void doggystat() {
        System.out.println("doggystat is static");
    }
}

