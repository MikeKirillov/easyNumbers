package JavaCore.Module11;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;

public class CharDecoder {
    public static void main(String[] args) {
        if (copyFileUsingStream("src/JavaCore/Module11/utf16.txt",
                "UTF-16",
                "src/JavaCore/Module11/utf8.txt",
                "UTF-8")) {
            System.out.println("Decoding is finally finished");
        }
    }

    private static boolean copyFileUsingStream(String source, String sourceEnc, String dest, String destEnc) {
        Charset sEnc = null;
        try {
            sEnc = Charset.forName(sourceEnc);
        } catch (UnsupportedCharsetException e) {
            System.out.println("Code problems of INput file");
            return false;
        }
        Charset dEnc = null;
        try {
            dEnc = Charset.forName(destEnc);
        } catch (UnsupportedCharsetException e) {
            System.out.println("Code problems of OUTput file");
            return false;
        }

        Reader fis = null;
        try {
            fis = new InputStreamReader(new FileInputStream(source), sEnc);
        } catch (FileNotFoundException e) {
            System.out.println("some problems with current INput file");
            return false;
        }
        Writer fos = null;
        try {
            fos = new OutputStreamWriter(new FileOutputStream(dest), dEnc);
        } catch (FileNotFoundException e) {
            System.out.println("some problems with current OUTput file");
            return false;
        }
        char[] buffer = new char[1024];
        int length;

        try {
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }
        } catch (IOException e) {
            System.out.println("Problems with copying between two files");
            return false;
        } finally {
            try {
                fis.close();
                fos.close();
            } catch (IOException e) {
                System.out.println("Troubles with stream closing");
                return false;
            }
        }
        return true;
    }
}
