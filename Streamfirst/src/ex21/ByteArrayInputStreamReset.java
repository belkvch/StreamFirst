package ex21;

import java.io.*;

class ByteArrayInputStreamReset {
    public static void main(String[] args) {
        String tmp = "abc";
        byte b[] = tmp.getBytes();
        ByteArrayInputStream in = new ByteArrayInputStream(b);
        for (int i = 0; i < 2; i++) {
            int с;
            while ((с = in.read()) != -1) {
                if (i == 0) {
                    System.out.print((char) с);
                } else {
                    System.out.print(Character.toUpperCase((char) с));
                }
            }
            System.out.println();
            in.reset();
        }
    }
}
