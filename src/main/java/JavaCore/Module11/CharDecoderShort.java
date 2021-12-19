package JavaCore.Module11;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

public class CharDecoderShort {
    public static void main(String[] args) {
        if (copyFileUsingStream("src/JavaCore/Module11/utf16.txt",
                "UTF-16",
                "src/JavaCore/Module11/utf8.txt",
                "UTF-8")) {
            System.out.println("Decoding is finally finished");
        }
    }

    private static boolean copyFileUsingStream(String source, String sourceEnc, String dest, String destEnc) {
        try (Reader fis = new InputStreamReader(new FileInputStream(source), Charset.forName(sourceEnc));
             Writer fos = new OutputStreamWriter(new FileOutputStream(dest), Charset.forName(destEnc))) {
            char[] buffer = new char[1024];
            int length;
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }
        } catch (UnsupportedCharsetException e) {
            System.out.println("Code problems of file: " + e.getMessage());
            return false;
        } catch (FileNotFoundException e) {
            System.out.println("some problems with current file: " + e.getMessage());
            return false;
        } catch (IOException e) {
            System.out.println("Problems with copying between two files: " + e.getMessage());
            return false;
        }
        return true;
    }
}
