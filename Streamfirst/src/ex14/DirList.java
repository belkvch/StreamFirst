package ex14;

import java.io.File;

class DirList {
    public static void main(String[] args) {
        String dirname = "/Users/belkvch/Documents/Прога";
        File f1 = new File(dirname);
        if (f1.isDirectory()) {
            System.out.println("Kaтaлoг " + dirname);
            String s[] = f1.list();
            for (int i = 0; i < s.length; i++) {
                File f = new File(dirname + "/" + s[i]);
                if (f.isDirectory()) {
                    System.out.println(s[i] + " является каталогом");
                } else {
                    System.out.println(s[i] + " является файлом");
                }
            }
        } else {
            System.out.println(dirname + " не является каталогом");
        }
    }
}
