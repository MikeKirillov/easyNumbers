package JavaCore.Module10.SelfTask10;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class SomeFile {
    private String fileName, mainText, newFileName;
    private File path, file;
    private boolean isCrFile, isCrDir;

    public void createDir(String path) {
        this.path = new File(path);

        if (!this.path.exists()) {
            isCrDir = this.path.mkdir();
            System.out.println("is directory created? - " + isCrDir);
        } else
            System.out.println("directory path '" + getPath() + "' is already created");
    }

    public void createFile(String fileName) throws IOException {
        this.fileName = fileName;
        file = new File(getPath(), getFileName());

        if (!this.file.exists()) {
            isCrFile = file.createNewFile();
            System.out.println("is file created? - " + isCrFile);
        } else
            System.out.println("file name is '" + getFileName() + "' is already exist");
    }

    public void createNewFile(String fileName) throws IOException {
        this.newFileName = fileName;
        file = new File(getPath(), getNewFileName());

        if (!this.file.exists()) {
            isCrFile = file.createNewFile();
            System.out.println("is file created? - " + isCrFile);
        } else
            System.out.println("file name is '" + getFileName() + "' is already exist");
    }

    public void fillDaFile(String mainText) throws IOException {
        this.mainText = mainText;

        FileOutputStream fos = new FileOutputStream(String.valueOf(getFullFilePath()));
        fos.write(getMainText().getBytes(StandardCharsets.UTF_8));// for eng and rus chars

        fos.close();
    }

    public void fileCopying() throws IOException {
        FileInputStream fis = new FileInputStream(String.valueOf(getFullFilePath()));
        FileOutputStream fos = new FileOutputStream(String.valueOf(getNewFullFilePath()));

        byte[] b = new byte[1024];
        int length;

        while ((length = fis.read(b)) > 0) {
            fos.write(b, 0, length);
        }
        fis.close();
        fos.close();
    }

    public String getFileName() {
        return this.fileName;
    }

    public String getNewFileName() {
        return this.newFileName;
    }

    public String getMainText() {
        return this.mainText;
    }

    public File getPath() {
        return this.path;
    }

    private StringBuilder getFullFilePath() {
        StringBuilder sb = new StringBuilder();
        return sb.append(getPath()).append("/").append(getFileName());
    }

    private StringBuilder getNewFullFilePath() {
        StringBuilder sb = new StringBuilder();
        return sb.append(getPath()).append("/").append(getNewFileName());
    }
}
