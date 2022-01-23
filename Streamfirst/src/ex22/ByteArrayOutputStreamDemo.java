package ex22;

import java.io.*;

class ByteArrayOutputStreamDemo {
    public static void main(String[] args) {
        ByteArrayOutputStream f = new ByteArrayOutputStream();
        String s = "Эти данные должны быть выведены в массив";
        byte arrData[] = s.getBytes();

        try {
            f.write(arrData);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        System.out.println("Бyфep в виде символьной строки ");
        System.out.println(f.toString());
        System.out.println("B массив ");
        byte b[] = f.toByteArray();
        String string = new String(b);
        System.out.println(string);
        System.out.println("\nB поток вывода типа OutputStream()");

        try (FileOutputStream f2 = new FileOutputStream(" testex22.txt")) {
            f.writeTo(f2);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Уcтaнoвкa позиции указателя в исходное состояние ");
        f.reset();
        for (int i = 0; i < 3; i++)
            f.write('A');
        System.out.println(f.toString());
    }
}
