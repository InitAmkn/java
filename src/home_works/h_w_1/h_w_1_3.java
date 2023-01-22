package home_works.h_w_1;

import java.util.Scanner;

public class h_w_1_3 {

    public static void main(String[] args) {
        /*
         * Реализовать простой калькулятор (пользователь вводит 2 числа и вводит
         * операцию (+ - / *). int a ; int b; String op (op!=”Stop”); (char != ’b’)
         */
        String opList = "+-/*";
        String stop = "stop";
        String encoding = System.getProperty("console.encoding", "cp866");
        Scanner iScanner = new Scanner(System.in, encoding);

        while (true) {
            System.out.println("Введите " + stop + " для выхода");
            System.out.print("Введите число a: ");
            String aString = iScanner.next();
            if (stop.equalsIgnoreCase(aString))// почему-то "stop == aString" не работает...
                break;

            System.out.print("Введите число b: ");
            String bString = iScanner.next();
            if (stop.equalsIgnoreCase(bString))
                break;

            System.out.print("Введите операцию:");
            String op = iScanner.next();
            if (stop.equalsIgnoreCase(op))
                break;

            try {
                double a = Double.parseDouble(aString);
                double b = Double.parseDouble(bString);
                if (op.length() == 1 && opList.contains(op)) {
                    System.out.println(a + " " + op + " " + b + " = " + operations(a, b, op));
                } else {
                    System.out.println("Операция введена некорректно");
                }

            } catch (Throwable t) {
                System.out.println("Введено не число");
            }

        }
        iScanner.close();

    }

    public static double operations(double a, double b, String op) {
        double c = 0;
        switch (op) {
            case "+":
                c = a + b;
                break;
            case "-":
                c = a - b;
                break;
            case "*":
                c = a * b;
                break;
            case "/":
                c = a / b;
                break;

        }
        return c;
    }

    /*
     * 
     * 
     * 
     * 
     * 
     * +Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть
     * заменены знаком вопроса, например 2? + ?5 = 69. Требуется восстановить
     * выражение до верного равенства. Предложить хотя бы одно решение или сообщить,
     * что его нет. 24 45 //24 + 45 = 69 (n=2)
     */

}
