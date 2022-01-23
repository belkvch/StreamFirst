package ex1;

import java.util.Scanner;

class UserInputProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int intValue;
        byte byteValue;
        double doubleValue;
        long longValue;

        System.out.println("Введите целое число: ");
        while (!in.hasNextInt()) {
            System.out.println("Вы не ввели целое число!");
            in.next(); //this is important!
        }
        intValue = in.nextInt();
        System.out.println(intValue);

        System.out.println("Введите байтовое число:");
        while (!in.hasNextByte()) {
            System.out.println("Вы не ввели байтовое число!");
            in.next(); //this is important!
        }
        byteValue = in.nextByte();
        System.out.println(byteValue);

        String temp = in.nextLine();
        System.out.println("Введите одну строку:");
        String string = in.nextLine();
        System.out.println(string);

        System.out.println("Введите вещественное число:");
        while (!in.hasNextDouble()) {
            System.out.println("Вы не ввели вещественное число!");
            in.next(); //this is important!
        }
        doubleValue = in.nextDouble();
        System.out.println(doubleValue);

        System.out.println("Введите длинное целое число:");
        while (!in.hasNextLong()) {
            System.out.println("Вы не ввели длинное целое число!");
            in.next(); //this is important!
        }
        longValue = in.nextLong();
        System.out.println(longValue);

        System.out.println("Введите слово:");
        string = in.next();//считываем слово
        System.out.println(string);
    }
}
