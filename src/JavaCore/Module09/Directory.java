package JavaCore.Module09;

import java.io.File;
import java.util.Arrays;

public class Directory {
    public static void main(String[] args) {
        File direct = new File("/Users/michaelkirillov/Desktop/Java Learning");
        long size = getDirectorySize(direct);
        System.out.println(size / 1024 / 1024 + " MB");

        getFileNames(direct);
    }

    private static long getDirectorySize(File direct) {
        File[] files = direct.listFiles();
        long length = 0;// files length

        for (File fileUnit : files)
            if (fileUnit.isFile()) length = length + fileUnit.length();// check if file is a file but not directory
            else length = length + getDirectorySize(fileUnit);

//        for (int i = 0; i < files.length; i++) {// alternate expression
//            if (files[i].isFile()) length += files[i].length();
//            else length += getDirectorySize(files[i]);
//        }
        return length;
    }

    private static void getFileNames(File direct) {
        File[] files = direct.listFiles();
//        for (int i = 0; i < files.length; i++) {// files and directories names
//            if (files[i].isFile() && !files[i].isHidden()) {
//                System.out.println("File name is " + files[i].getName());
//            } else if (files[i].isDirectory() && !files[i].isHidden()) {
//                System.out.println("Directory name is " + files[i].getName());
//            }
//        }
//    }

//        String[] names = new String[2];// files names in array
//        for (int i = 0; i < files.length; i++) {
//            if (files[i].isFile() && !files[i].isHidden()) {
//                for (int j = 0; j < names.length; j++){
//                    names[j] = files[i].getName();
//                }
//            }
//        }
//        System.out.println(Arrays.toString(names));
//    }

        StringBuilder names = new StringBuilder();// files names in a row
        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile() && !files[i].isHidden()) {
                names.append(files[i].getName()).append("\n");
            }
        } 
        System.out.println("Files names:\n" + names);
    }
}
