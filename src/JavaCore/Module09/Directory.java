package JavaCore.Module09;

import java.io.File;

public class Directory {
    public static void main(String[] args) {
        File directory = new File("/Users/michaelkirillov/Desktop/Java Learning");
        long size = getDirectorySize(directory);
        System.out.println(size / 1024 / 1024 + " MB");
    }

    private static long getDirectorySize(File directory) {
        File[] files = directory.listFiles();
        long length = 0;// files length
        int count = files.length;

        for (File fileUnit : files)
            if (fileUnit.isFile()) length = length + fileUnit.length();// check if file is a file but not directory
            else length = length + getDirectorySize(fileUnit);

//        for (int i = 0; i < count; i++) {// alternate expression
//            if (files[i].isFile()) length += files[i].length();
//            else length += getDirectorySize(files[i]);
//        }
        return length;
    }
}
