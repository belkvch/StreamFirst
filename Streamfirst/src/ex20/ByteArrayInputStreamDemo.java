package ex20;

import java.io.*;

class ByteArrayInputStreamDemo {
    public static void main(String[] args) {
        String tmp = " abcdefghijklmnopqrstuvwxyz ";
        byte[] b = tmp.getBytes();
        ByteArrayInputStream inputl = new ByteArrayInputStream(b);
        ByteArrayInputStream input2 = new ByteArrayInputStream(b, 0, 3);
        for (int i = 0; i < b.length; i++) {
            System.out.print((char) inputl.read());
        }
        System.out.println();
        for (int i = 0; i < b.length; i++) {
            if (input2.available() != 0)
                System.out.print((char) input2.read());
        }
    }
}
