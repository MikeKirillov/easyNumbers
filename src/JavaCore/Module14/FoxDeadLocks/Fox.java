package JavaCore.Module14.FoxDeadLocks;

import JavaCore.Module14.Typer.Typer;

public class Fox {
    private void eatDrink(Food food, Water water) {
        synchronized (food) {
            System.out.println("got food");
            move();
        }

        synchronized (water) {// bad to have 2 locks at different objects
            System.out.println("got water");
        }
    }

    private void drinkEat(Food food, Water water) {
        synchronized (water) {
            System.out.println("got water");
            move();
        }

        synchronized (food) {// bad to have 2 locks at different objects
            System.out.println("got food");
        }
    }

    private void move() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            // ...
        }
    }

    public static void main(String[] args) {
        Fox fox1 = new Fox();
        Fox fox2 = new Fox();
        Food food = new Food();
        Water water = new Water();

        Thread th1 = new Thread() {
            @Override
            public void run() {
                fox1.drinkEat(food, water);
            }
        };

        Thread th2 = new Thread() {
            @Override
            public void run() {
                fox2.eatDrink(food, water);
            }
        };

        th1.start();
        th2.start();
    }
}
