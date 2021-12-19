package JavaCore.Module09;

import org.w3c.dom.ls.LSOutput;

import java.io.File;

public class Filez {
    public static void main(String[] args) {
        File file = new File("/Users/michaelkirillov/Desktop/Java Learning", "Head_First_Java_Second_Edition.pdf");
        // 1st way to create object file
        System.out.println(file.getName());

        File file1 = new File("/Users/michaelkirillov/Desktop/Java Learning/Head_First_Java_Second_Edition.pdf");
        // alternate way
        System.out.println(file1.getName());

        File directory = new File("/Users/michaelkirillov/Desktop/Java Learning");
        File file2 = new File(directory, "Head_First_Java_Second_Edition.pdf");
        // 2nd alternate way

        System.out.println(file2.getName());// name
        System.out.println(file2.getParent());// directory
        System.out.println(file.getPath());// path
        System.out.println(file.getAbsolutePath());// abs path
        System.out.println(file.exists());// is in the disk space
        System.out.println(file.lastModified());// last date and time of modifying per milliseconds

        String[] files = directory.list();// get files array

        File direct1 = new File("/Users/michaelkirillov/Desktop/Java Learning/New");
        boolean isCreated = direct1.mkdir();// creates new directory at directory of direct1
        boolean isDeleted = direct1.delete();// deletes empty directory at directory of direct1 or file
//        boolean isFileCreated = file1.createNewFile();

        long length = file2.length();
        System.out.println(length);// length per bytes
    }
}
