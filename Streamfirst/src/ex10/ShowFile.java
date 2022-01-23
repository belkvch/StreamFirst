package ex10;

import java.io.*;

class ShowFile {
    public static void main(String[] args) {
        int i;
        if (args.length != 1) {
            System.out.println("Иcпoльзoвaниe: exten.txt");
            return;
        }
        try (FileInputStream fin = new FileInputStream(args[0])) {
            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (FileNotFoundException e) {
            System.out.println("Фaйл не найден.");
        } catch (IOException e) {
            System.out.println("Пpoизoшлa ошибка ввода- вывода");
        }
    }
}
