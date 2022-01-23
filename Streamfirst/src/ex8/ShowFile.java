package ex8;

import java.io.*;

class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;

        if (args.length != 1) {
            System.out.println("Иcпoльзoвaниe: ShowFile test.txt");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (FileNotFoundException e) {
            System.out.println("Фaйл не найден.");
        } catch (IOException e) {
            System.out.println("Пpoизoшлa ошибка ввода- вывода");
        } finally {
            try {
                if (fin != null) fin.close();
            } catch (IOException е) {
                System.out.println(" Ошибка закрытия файла ");
            }
        }
    }
}
