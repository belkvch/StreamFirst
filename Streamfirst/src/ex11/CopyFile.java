package ex11;

import java.io.*;

class CopyFile {
    public static void main(String[] args) {
        int i;
        if (args.length != 2) {
            System.out.println("Иcпoльзoвaниe: CopyFile exten.txt resultelev.txt");
            return;
        }

        try (FileInputStream fin = new FileInputStream(args[0]);
             FileOutputStream fout = new FileOutputStream(args[1])) {
            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            } while (i != -1);
            System.out.println("Копирование выполнено успешно!");
        } catch (IOException e) {
            System.out.println(" Oшибкa ввода- вывода: " + e);
        }
    }
}
