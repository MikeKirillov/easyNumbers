package PracticeWeek01;

public class Payer {// task03
    String surname;
    String name;
    String address;
    String cardNumber;

    public Payer(String surname, String name, String address, String cardNumber) {
        this.surname = surname;
        this.name = name;
        this.address = address;
        this.cardNumber = cardNumber;
    }

    public String toString() {
        System.out.println("Player: " + surname + " " + name + ", address: " + address + ", card: " + cardNumber);
        return "Player: " + surname + " " + name + ", address: " + address + ", card: " + cardNumber;
    }

    public static void main(String[] args) {
        Payer player = new Payer("Ivan", "Petrovich", "Moscow City", "12-421-12");

        player.toString();
    }
}
