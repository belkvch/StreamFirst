package ex7;

import java.io.*;
import java.nio.charset.*;

public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fileIn;
        if (args.length != 1) {
            System.out.println("Иcпoльзoвaниe: test.txt ");
            return;
        }
        try {
            fileIn = new FileInputStream(args[0]); //!!!!!!!!! ТУТ
            InputStreamReader in = new InputStreamReader(fileIn, StandardCharsets.UTF_8);
            BufferedReader  input = new BufferedReader(new InputStreamReader(fileIn, StandardCharsets.UTF_8));
        } catch (FileNotFoundException e) {
            System.out.println("Heвoзмoжнo открыть файл");
            return;
        }

        try {
            do {
                i = fileIn.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Oшибкa чтения из файла");
        }

        try {
            fileIn.close();
        } catch (IOException e) {
            System.out.println("Oшибкa закрытия файла");
        }
    }
}