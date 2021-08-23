package JavaCore.Module15;

public class MultiDefault implements Walk, Run {
    public static void main(String[] args) {
//        MultiDefault md = new MultiDefault();
//        System.out.println(md.getSpeed());

        System.out.println(new MultiDefault().getSpeed());
    }

    @Override
    public int getSpeed() {
        return 8;
    }
    // here's how it works with conflict between 2 same named default methods of 2 implemented interfaces
}

interface Walk {
    default int getSpeed() {
        return 5;
    }
}

interface Run {
    default int getSpeed() {
        return 5;
    }
}