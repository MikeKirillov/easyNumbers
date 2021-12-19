package JavaCore.Module16;

public class TreeExample {
    static class Wallet {
        double money;
    }

    static class Phone {
        double chargeLevel;
    }

    static class BackPack {
        Wallet wallet;
        Phone phone;
    }

    static class Person {
        String name;
        BackPack backPack;
    }

    private static Person cretePerson() {
        Phone phone = new Phone();
        phone.chargeLevel = 75;

        Wallet wallet = new Wallet();
        wallet.money = 142;

        BackPack backPack = new BackPack();
        backPack.phone = phone;
        backPack.wallet = wallet;

        Person person = new Person();
        person.name = "Eugene";
        person.backPack = backPack;

        return person;
    }

    public static void main(String[] args) {
        Person person = cretePerson();
    }
}
