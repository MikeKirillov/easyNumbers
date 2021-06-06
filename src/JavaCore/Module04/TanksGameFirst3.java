package JavaCore.Module04;

import static JavaCore.Module04.Tank3.salamAleikum;// для вызова статического метода без ссылки на класс

public class TanksGameFirst3 {
    public static void main(String[] args) {
        // В (0;0) с fuel = 100
        Tank3 justTank = new Tank3();
        justTank.goForward(200);
        justTank.printPosition();

        // В (10;10) с fuel = 100
        Tank3 anywareTank = new Tank3(10, 10);
        anywareTank.goBackward(-200);
        anywareTank.printPosition();

        // В (20;30) с fuel = 200
        Tank3 customTank = new Tank3(20, 30, 200);
        customTank.goForward(201);
        customTank.printPosition();

        salamAleikum();// пример вызова через импорт см.вверху
        Tank3.salamAleikum();// пример вызова без импорта
//        Tank3 tank = new Tank3();
//        tank.x = 1000;// не отработает, т.к. для этого атрибута в классе Tank3 уровень доступа private
//        tank.y = 2000;// не отработает, т.к. для этого атрибута в классе Tank3 уровень доступа private
//        tank.printPosition();
    }
}

class Tank3 {
    static final String TANK_MODEL = "T-34";// константа
    static int ntanks;// статично для всех объектов класса, потому происходит прибавление единицы между всеми классами
    //универсальный счетчик между объектами класса
    private int x;
    private int y;
    private int dir;
    private int fuel;

    public Tank3() {
        this(0, 0, 100);
    }

    public Tank3(int x, int y) {
        this(x, y, 100);
    }

    public Tank3(int x, int y, int fuel) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;
        ++ntanks;
    }

    //dir - 0 (x-right), 1 (y-down), 2 (x-left), 3 (y-up)
    public void goForward(int i) {
        if (i < 0 && -i > fuel) {
            i -= fuel;
        } else if (i > fuel) {
            i = fuel;
        }
        fuel -= Math.abs(i);

        switch (dir) {
            case 0 -> x += i;
            case 1 -> y += i;
            case 2 -> x -= i;
            default -> y -= i;
        }
    }

    public void goBackward(int i) {
        //x = x - i;
        goForward(-i);
    }

    public void turnRight() {
        dir++;
        if (dir == 4) {
            dir = 0;
        }
    }

    public void turnLeft() {
        dir--;
        if (dir == -1) {
            dir = 3;
        }
    }

    public void printPosition() {
        System.out.println("The Tank " + TANK_MODEL + "-" + ntanks + " is at " + x + ", " + y + " now.");
    }

    public static void salamAleikum() {
    }
}