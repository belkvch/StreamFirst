package ex12;

import java.io.File;
import java.util.Date;

class FileDemo {
    private static String getFileExtension(File file) {
        String fileName = file.getName();
        if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0) {
            return fileName.substring(fileName.lastIndexOf(".") + 1);
        } else return "";
    }

    public static void main(String[] args) {
        File f1 = new File("Copyright.txt");
        System.out.println("Имя файла:" + f1.getName());
        System.out.println("Расширение:" + getFileExtension(f1));
        System.out.println("Путь:" + f1.getPath());
        System.out.println("Абсолютный путь:" + f1.getAbsolutePath());
        System.out.println("Родительский каталог:" + f1.getParent());
        System.out.println(f1.exists() ? "файл существует" : "файл не существует ");
        System.out.println(f1.canWrite() ? "файл доступен для записи" : "не доступен для записи");
        System.out.println(f1.canRead() ? "файл доступен для чтения" : "не доступен для чтения ");
        System.out.println(f1.isDirectory() ? "файл является каталогом" : "не является каталогом");
        System.out.println(f1.isFile() ? "файл является обычным файлом" : "может быть именованным каналом");
        System.out.println(f1.isAbsolute() ? "путь к файлу является абсолютным" : "путь к файлу не является абсолютным");
        System.out.println("Последнее изменение в файле:" + new Date(f1.lastModified()));
        System.out.println("Размер:" + f1.length() + " байт ");
    }
}
