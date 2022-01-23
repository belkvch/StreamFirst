package ex19;

import java.io.*;

class FileOutputStreamDemo {
    public static void main(String[] args) {
        String source = "Now is the time for all good men\n"
                + " to come to the aid of their country\n"
                + " and рау their due taxes. ";

        byte[] buf = source.getBytes();
        try (FileOutputStream f1 = new FileOutputStream("file1.txt");
             FileOutputStream f2 = new FileOutputStream("file2.txt");
             FileOutputStream f3 = new FileOutputStream("file3.txt")) {
            for (int i = 0; i < buf.length; i += 2)
                f1.write(buf[i]);
            f2.write(buf);
            f3.write(buf, buf.length - buf.length / 4, buf.length / 4);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
