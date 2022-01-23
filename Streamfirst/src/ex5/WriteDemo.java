package ex5;

import java.io.PrintStream;
import java.util.Date;

class WriteDemo {
    public static void main(String[] args) {
        int b;
        b = 'A';
        System.out.write(b);
        System.out.write('\n');
        PrintStream printStream = new PrintStream(System.out);
        printStream.printf("Name: %s Age: %d salary = %.2f\n", "Tom", 34, 2500.333333);
        printStream.print(new Date());
        printStream.close();
    }
}
