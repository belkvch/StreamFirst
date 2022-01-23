package ex17;

import java.io.*;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        int size;

        try (FileInputStream f = new FileInputStream("test.txt")) {
            System.out.println("Oбщee количество доступных байтов: " + (size = f.available()));
            int n = size / 40;
            System.out.println("Пepвыe " + n + " байтов, " + " прочитаны из файла по очереди методом read()");
            for (int i = 0; i < n; i++)
                System.out.print((char) f.read());

            System.out.println("\nBce еще доступно: "
                    + f.available());
            System.out.println("Чтeниe следующих " +
                    n + " байтов по очереди методом read(b[])");
            byte b[] = new byte[n];
            if (f.read(b) != n)
                System.err.println("Нельзя прочитать " + n + " байтов.");
            System.out.println(new String(b, 0, n));

            System.out.println("\nBce еще доступно: "
                    + (size = f.available()));
            System.out.println("Пропустить половину оставшихся байтов методом skip()");
            f.skip(size / 2);

            System.out.println("Bce еще доступно: " + f.available());
            System.out.println("Чтeниe " + n / 2 + " байтов, размещаем в конце массива");
            if (f.read(b, n / 2, n / 2) != n / 2) {
                System.err.println("Нельзя прочитать " + n / 2 + " байтов. ");
            }
            System.out.println(new String(b, 0, b.length));

            System.out.println("\nBce еще доступно: " + f.available());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
