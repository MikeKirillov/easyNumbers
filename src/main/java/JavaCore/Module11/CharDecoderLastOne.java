package JavaCore.Module11;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

class ConvertException extends Exception {
    ConvertException(String message) {
        super(message);
    }
}

public class CharDecoderLastOne {
    public static void main(String[] args) {
        try {
            copyFileUsingStream("src/JavaCore/Module11/utf16.txt",
                    "UTF-16",
                    "src/JavaCore/Module11/utf8.txt",
                    "UTF-8");
            System.out.println("Decoding is finally finished");
        } catch (ConvertException e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    private static void copyFileUsingStream(String source, String sourceEnc, String dest, String destEnc) throws ConvertException {
        try (Reader fis = new InputStreamReader(new FileInputStream(source), Charset.forName(sourceEnc));
             Writer fos = new OutputStreamWriter(new FileOutputStream(dest), Charset.forName(destEnc))) {
            char[] buffer = new char[1024];
            int length;
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }
        } catch (UnsupportedCharsetException e) {
            throw new ConvertException("Code problems of file: " + e.getMessage());
        } catch (FileNotFoundException e) {
            throw new ConvertException("some problems with current file: " + e.getMessage());
        } catch (IOException e) {
            throw new ConvertException("Problems with copying between two files: " + e.getMessage());
        }
    }
}
