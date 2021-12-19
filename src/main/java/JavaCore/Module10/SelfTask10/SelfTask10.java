package JavaCore.Module10.SelfTask10;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SelfTask10 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        SomeFile sf = new SomeFile();

        System.out.println("enter future file path ");// /Users/michaelkirillov/Desktop/Java Learning/java ex files/
        String path = scanner.nextLine();
        while (path.equals("")) {
            System.out.println("cant be file with empty path");
            path = scanner.nextLine();
        }
        sf.createDir(path);

        System.out.println("enter future file name ");// some_text.txt
        String file = scanner.nextLine();
        while (file.equals("")) {
            System.out.println("cant be file with empty name");
            file = scanner.nextLine();
        }
        sf.createFile(file);

        System.out.println("fill the file with following rndm txt ");// random text
        String text = scanner.nextLine();
        sf.fillDaFile(text);

        System.out.println("prepare to copy file to a new one. enter new file name ");
        String newFile = scanner.nextLine();
        while (newFile.equals("") || newFile.equals(file)) {
            System.out.println("cant be file with empty same name as 1st one");
            newFile = scanner.nextLine();
        }
        sf.createNewFile(newFile);
        sf.fileCopying();
    }
}
