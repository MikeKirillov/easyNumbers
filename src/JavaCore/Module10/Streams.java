package JavaCore.Module10;

import java.io.InputStream;
import java.util.Scanner;

public class Streams {
    public static void main(String[] args) {
//        int x = -1;
//        byte y = -1;
//
//        System.out.printf("%08X and %08X%n", x, y);// FFFFFFFF and 000000FF

        Scanner scanner = new Scanner(new OneZeroStream());
        for (int i = 0; i < 10; i++) {
            System.out.print(scanner.nextInt());
        }
    }
}

class OneZeroStream extends InputStream {
    byte[] b = {'1', ' ', '0', ' '};
    int i = 0;

    @Override
    public int read() {
        if (i >= b.length)
            i = 0;
        return b[i++];
    }
}