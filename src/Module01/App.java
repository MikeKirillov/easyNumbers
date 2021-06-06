package Module01;

import Module01.PackageEx.Dog;

public class App {
    public static void main(String[] args) {
//        byte a = 44;
//        char b = (char)(Math.random()*65651);
//        System.out.println(b);

//        int i = 1;
//        System.out.println(i++);
//        System.out.println(++i);

        //ветвление1
//        double i = 5;
//        double j = 10;
//        double e = (double)Math.random()*1;
//        double t = i/e;
//
//        if (t > j){
//            System.out.println("t is MORE than j = "+j);
//        } else if (t < j){
//            System.out.println("t is LESS than j = "+j);
//        } else {
//            System.out.println("salam aleikum its something else");
//        }
//        System.out.println("e = "+e);
//        System.out.println("t = "+t);

//        int z = 0;
//        int u = (z == 0)  ? "равно" : "не равно"; /* тернарный оператор
//        "сначала условие ? значение при true : значение при false" */
//        int u = (z == 0 || z > 0 || z < 0) ? "равно" : "не равно";

        //ветвление2
//        int sure = 144;
//        switch (sure) {
//            case 143:
//                System.out.println(143);
//                break;
//            case 145:
//                System.out.println(145);
//                break;
//            default:
//                System.out.println(146);
//        }
//        switch (sure) {
//            case 143:
//            case 144:
//            case 145:
//                System.out.println("143 or 144 or 145");
//                break;
//            default:
//                System.out.println("diff value");
//        }

        //ветвление3
//        int i = 3;
//        int c = switch (i){
//            case 1,5,10 -> 10;
//            case 2,4,6,8 -> 8;
//            case 3,7,9 -> 9;
//            default -> 0;
//        };
//        System.out.println(c);

        int i = 4;
        int c = switch (i) {
            case 1:
                System.out.println(i);
                yield 1 + 1;
            case 3:
                System.out.println(i);
                yield 333;
            default:
                System.out.println(i);
                yield 0;
        };
        System.out.println(c);

        Dog dog = new Dog();//импорт объекта из другого пакета
        dog.age = 23;
        System.out.println(dog.age);
    }
}
