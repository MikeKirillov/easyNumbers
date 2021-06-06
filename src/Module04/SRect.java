package Module04;

public class SRect {
    public static void main(String[] args) {
        Rect rect = new Rect(20, 30);
        rect.w = 0;
        rect.h = 0;
        System.out.println(rect.getS());
        System.out.println(rect.getH());
    }
}

class Rect {
    private int s;
    int h, w;

    Rect(int w, int h) {
        this.h = h;
        this.w = w;
        s = w * h;
    }

    public int getS() {
        return s;
    }

    public int getH() {
        return h;
    }

    public int getW() {
        return w;
    }
}