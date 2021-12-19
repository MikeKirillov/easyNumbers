package JavaCore.Module08;

public class MotherBoard {// outer class

    static class USB {// static nested class
        public static String wikilink = "https://en.wikipedia.org/wiki/USB";
        int usb2;
        int usb3;

        int getTotalPorts() {
            return usb2 + usb3;
        }

        USB(int usb2, int usb3) {
            this.usb2 = usb2;
            this.usb3 = usb3;
        }
    }

    USB usb = new USB(2, 3);// creating USB-class object to ask it outside MotherBoard-class
}

class Main {
    public static void main(String[] args) {
        MotherBoard mb = new MotherBoard();
        System.out.println("Total ports = " + mb.usb.getTotalPorts());
        // ask USB-class through MotherBoard-class

        System.out.println("Wikipedia about USB: " + MotherBoard.USB.wikilink);
        // using static variable if USB-class through MotherBoard-class

        MotherBoard.USB usb = new MotherBoard.USB(100, 500);
        // create USB-class object outside MotherBoard-class
    }
}