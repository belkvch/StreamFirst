package ex18;

import java.io.*;

class FileOutputStreamDemo {
    public static void main(String[] args) {
        String source = "Now is the time for all good men\n"
                + " to come to the aid of their country\n"
                + " and рау their due taxes.";

        byte[] buf = source.getBytes();
        FileOutputStream f1 = null;
        FileOutputStream f2 = null;
        FileOutputStream f3 = null;

        try {
            f1 = new FileOutputStream("file1.txt");
            f2 = new FileOutputStream("file2.txt");
            f3 = new FileOutputStream("file3.txt");

            for (int i = 0; i < buf.length; i += 2)
                f1.write(buf[i]);
            f2.write(buf);
            f3.write(buf, buf.length-buf.length/4, buf.length/4);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (f1 != null) f1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (f2 != null) f2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(f3 != null) f3.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
