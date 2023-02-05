package home_works.h_w_4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class h_w_4_3 {

    public static void main(String[] args) {
        /*
         * Реализовать простой калькулятор (пользователь вводит 2 числа и вводит
         * операцию (+ - / *). int a ; int b; String op (op!=”Stop”); (char != ’b’)
         */

        /*
         * В калькулятор добавьте возможность отменить последнюю операцию.
         */
        calculator();
    }

    public static void calculator() {
        String opList = "+-/*";
        String stop = "stop";
        String undo = "undo";

        while (true) {
            System.out.println("Введите " + stop + " для выхода");
            System.out.println("Введите " + undo + " для отмены ввода");

            String aString = "";
            String bString = "";
            String op = "";

            //
            Stack<String> data = inputDATA(undo, stop);
            if (data.size() < 3)
                break;
            op = data.pop();
            bString = data.pop();
            aString = data.pop();

            try {
                double a = Double.parseDouble(aString);
                double b = Double.parseDouble(bString);
                if (op.length() == 1 && opList.contains(op)) {
                    String outString = String.format("%s %s %s = %s", a, op, b, operations(a, b, op));
                    System.out.println(outString);

                    Logger(outString);
                } else {
                    System.out.println("Операция введена некорректно");
                }

            } catch (Throwable t) {
                System.out.println("Введено не число");
            }

        }

    }

    public static Stack<String> inputDATA(String undo, String stop) {
        Stack<String> inputData = new Stack<>();
        String encoding = System.getProperty("console.encoding", "cp866");
        Scanner iScanner = new Scanner(System.in, encoding);
        while (inputData.size() < 3) {

            if (inputData.size() == 0) {
                System.out.print("Введите число a: ");
                String aString = iScanner.next();

                if (stop.equalsIgnoreCase(aString))
                    break;
                inputData.push(aString);

                if (undo.equalsIgnoreCase(aString)) {
                    inputData.pop();
                }

            }
            if (inputData.size() == 1) {
                System.out.print("Введите число b: ");
                String bString = iScanner.next();

                if (stop.equalsIgnoreCase(bString))
                    break;
                if (undo.equalsIgnoreCase(bString)) {
                    inputData.pop();
                    continue;
                }
                inputData.push(bString);
            }
            if (inputData.size() == 2) {
                System.out.print("Введите операцию:");
                String op = iScanner.next();

                if (stop.equalsIgnoreCase(op))
                    break;
                if (undo.equalsIgnoreCase(op)) {
                    inputData.pop();
                    continue;
                }
                inputData.push(op);
            }

        }
        // iScanner.close(); непонятно в какой момент закрывать iScanner,
        // все время ругается

        return inputData;
    }

    public static Logger iLogger = Logger.getLogger(h_w_4_3.class.getName());

    public static void Logger(String saveString) throws SecurityException, IOException {
        String Path = System.getProperty("user.dir");
        String FileName = "/src/home_works/h_w_4/loggerCalculator.log";
        String FullPath = Path.concat(FileName);
        System.out.println(FullPath);
        FileHandler fh = new FileHandler(FullPath);
        iLogger.addHandler(fh);
        SimpleFormatter txt = new SimpleFormatter();
        fh.setFormatter(txt);
        iLogger.log(Level.INFO, saveString);
        /*
         * try (FileWriter file1 = new
         * FileWriter("src/home_works/h_w_2/loggerCalculator.log", true)) {
         * file1.append(saveString);
         * file1.append("\n");
         * file1.close();
         * } catch (IOException exception) {
         * System.out.println(exception.getMessage());
         * }
         */
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

}
