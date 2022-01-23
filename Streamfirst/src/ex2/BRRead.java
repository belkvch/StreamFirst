package ex2;

import java.io.*;

class BRRead {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Введите символы, 'q' - для выхода:");
            do {
                //считать введенные данные посимвольно
                c = (char) br.read();
                //вывести посимвольно введенные данные
                System.out.print(c);
            } while (c != 'q');
            if (c == 'q') break;
        }
    }
}
