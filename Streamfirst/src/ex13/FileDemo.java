package ex13;

import java.io.File;

class FileDemo {
    public static void main(String[] args) {
        File firstFile;
        File secondFile;
        File fileToDelete;
        boolean bool;

        try {
            firstFile = new File("firstFile.txt");
            secondFile = new File("secondFile.txt");
            bool = firstFile.renameTo(secondFile);
            System.out.println("File renamed: " + bool);
        } catch (Exception e) {
            e.printStackTrace();
        }

        fileToDelete = new File("delete.txt");
        bool = fileToDelete.delete();

        System.out.println("File deleted: " + bool);
    }
}
