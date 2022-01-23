package ex16;

import java.io.*;

class FileDemo {
    public static void main(String[] args) {
        File f;
        boolean bool;
        try {
            f = new File("/Users/belkvch/Загрузки");
            bool = f.mkdirs();
            System.out.print("Directory created? " + bool);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
