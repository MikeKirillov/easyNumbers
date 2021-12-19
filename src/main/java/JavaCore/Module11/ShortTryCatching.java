package JavaCore.Module11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ShortTryCatching {
//    static String readFirstLineFromFileWithFinallyBlock(String path) {// normal try-catch-finally structure
//        BufferedReader br = null;
//
//        try {
//            br = new BufferedReader(new FileReader(path));
//            return br.readLine();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (br != null) {
//                try {
//                    br.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        return null;
//    }

    static String readFirstLineFromFileWithFinallyBlock(String path) {// short try-with-resources structure
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}