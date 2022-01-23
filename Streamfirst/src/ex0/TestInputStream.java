package ex0;

import java.io.*;

public class TestInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("input.txt");
        System.setIn(fileInputStream); //перенаправили поток
        byte[] fileData = System.in.readAllBytes();
        String s = new String(fileData);
        System.out.println(s);

        FileOutputStream fileOutputStream = new FileOutputStream("server.log");
        {
            System.setOut(new PrintStream(fileOutputStream)); //класс оборачивается
            System.out.println("Привет, Java\n");
            System.setErr(new PrintStream(fileOutputStream));
            System.err.write("Сообщение об исключении\n".getBytes());
        }
    }
}
