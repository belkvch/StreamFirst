package ex6;

import java.io.*;
import java.util.Date;

class PrintWriterDemo {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(System.out, true);
        pw.println("For show");
        int i = -7;
        pw.println(i);
        double d = 23.3;
        pw.println(d);

        PrintWriter writer = new PrintWriter(new File("datetime.txt"));
        writer.format("Сейчас: %tT %n", new Date());
        writer.format("Сегодня: %tF %n", new Date());
        writer.format("Сегодня: %tD %n", new Date());
        writer.close();
    }
}
