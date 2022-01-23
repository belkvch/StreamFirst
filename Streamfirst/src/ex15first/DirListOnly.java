package ex15first;

import java.io.*;

class DirListOnly {
    public static void main(String[] args) {
        String dirname = "/Users/belkvch/Documents/Фото";
        File f1 = new File(dirname);
        FilenameFilter only = new OnlyExt("jpg");
        String[] s = f1.list(only);
        for (int i = 0; i < s.length; i++)
            System.out.println(s[i]);
    }
}
