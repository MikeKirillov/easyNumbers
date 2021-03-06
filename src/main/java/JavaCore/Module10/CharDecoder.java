package JavaCore.Module10;

import java.io.*;
import java.nio.charset.Charset;

public class CharDecoder {
    /*public static void main(String[] args) throws IOException {
        fileCopying("src/JavaCore/Module10/utf8.txt",
            "UTF-8",
            "src/JavaCore/Module10/utf16.txt",
            "UTF-16");
    }

    private static void fileCopying(String src, String srcEnc, String dsc, String dscEnc) throws IOException {
        Charset sEnc = Charset.forName(srcEnc);
        Charset dEnc = Charset.forName(dscEnc);
        Reader fis = new InputStreamReader(new FileInputStream(src), sEnc);
        Writer fos = new OutputStreamWriter(new FileOutputStream(dsc), dEnc);

        char[] buffer = new char[1024];
        int length;

        while ((length = fis.read(buffer)) > 0) {
            fos.write(buffer, 0, length);
        }
        fis.close();
        fos.close();
    }*/


    public static void main(String[] args) throws IOException {
        copyFileUsingStream(new File("src/JavaCore/Module10/utf16.txt"),
                Charset.forName("UTF-16"),
                new File("src/JavaCore/Module10/utf8.txt"),
                Charset.forName("UTF-8"));
    }

    private static void copyFileUsingStream(File source, Charset sourceEnc, File dest, Charset descEnc) throws IOException {
        Reader fis = new FileReader(source, sourceEnc);
        Writer fos = new FileWriter(dest, descEnc);
        char[] buffer = new char[1024];
        int length;
        while ((length = fis.read(buffer)) > 0) {
            fos.write(buffer, 0, length);
        }
        fis.close();
        fos.close();
    }
}