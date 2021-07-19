package JavaCore.Module10;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {
    public static void main(String[] args) throws IOException {
//        String fileName = "things.rtf";
//        FileInputStream fis = new FileInputStream(fileName);

        File file = new File("/Users/michaelkirillov/Desktop/Java Learning/java ex files/", "things.rtf");
//        File file = new File("/Users/michaelkirillov/Desktop/Java Learning/java ex files/things.rtf");
        FileInputStream fis = new FileInputStream(file);

        if (file.exists() && file.isFile()) {
            int i, count = 0;

            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println();

//            while ((i = fis.read()) != -1) {
//                if (i >= '0' && i <= '9')
//                    count++;
//            }
//            System.out.println(count);
            fis.close();
        }
    }
}
