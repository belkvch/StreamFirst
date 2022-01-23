package ex15second;

import java.io.*;

class DirListOnlyWithLambda {
    public static void main(String[] args) {
        String dirname = "/Users/belkvch/Documents/Фото";
        File f1 = new File(dirname);
        String[] listFiles = f1.list(((dir, name) -> name.toLowerCase().endsWith("jpg")));
        for (int i = 0; i < listFiles.length; i++)
            System.out.println(listFiles[i]);
    }
}
