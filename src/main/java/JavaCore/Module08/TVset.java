package JavaCore.Module08;

public class TVset {// outer class
    private int channel = 5;
    private boolean isOn;
    private Remote remote = new Remote();// new object of inner class

    public String toString() {
        if (!isOn) {
            return "The TVset is OFF";
        }
        return "Channel " + channel + " is on TVset now";
    }

//    public Remote getRemote() {
//        return remote;
//    }

    class Remote {// inner class for TV outer class

        public void setChannel(int channel) {// changing channels on TV
            TVset.this.channel = channel; // Outerclass.this.variable = variable
        }

        public void turnOn() {
            TVset.this.isOn = true;
        }

        public void turnOff() {
            TVset.this.isOn = false;
        }
    }
}

class Mainx {// Main

    public static void main(String[] args) {
        TVset tv = new TVset();

//        TVset.Remote remote = tv.getRemote();
        TVset.Remote remote = tv.new Remote(); // outerObject.new InnerClass()
//        TVset.Remote remote = new TVset().Remote();

        System.out.println(tv);

        remote.turnOn();
        System.out.println(tv);

        remote.setChannel(2);
        System.out.println(tv);

        remote.turnOff();
        System.out.println(tv);

        // OR

//        System.out.println(tv);
//
//        tv.getRemote().turnOn();
//        System.out.println(tv);
//
//        tv.getRemote().setChannel(2);
//        System.out.println(tv);
//
//        tv.getRemote().turnOff();
//        System.out.println(tv);
    }
}
