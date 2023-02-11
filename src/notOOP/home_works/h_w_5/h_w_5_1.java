package home_works.h_w_5;

import java.util.HashMap;
import java.util.Scanner;

public class h_w_5_1 {

    private static Scanner iScanner;

    public static void main(String[] args) {
        /*
         * 1) Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1
         * человек может иметь несколько телефонов.
         */

        String[] menu = { "Выберите вариант:",
                "1. Добавление в справочник",
                "2. Просмотр справочника",
                "Stop - выйти из программы" };

        HashMap<String, String> directory = new HashMap<>();
        String encoding = System.getProperty("console.encoding", "cp866");
        try (Scanner iScanner = new Scanner(System.in, encoding)) {
            String temp = "";
            String stop = "stop";

            while (!stop.equalsIgnoreCase(temp)) {
                print(menu);
                temp = iScanner.nextLine();
                switch (temp) {
                    case "1":
                        addPerson(directory);
                        break;
                    case "2":
                        printPerson(directory);
                        break;
                    case "stop":
                        break;
                    default:
                        System.out.println("Выбор не распознан");
                }
                System.out.println();
                // iScanner.close();
            }
            //
        }

    }

    public static void printPerson(HashMap<String, String> directory) {
        for (var el : directory.entrySet()) {

            System.out.println("Имя:   " + el.getValue());
            System.out.println("Номер: " + el.getKey());
            System.out.println();
        }
    }

    public static HashMap<String, String> addPerson(HashMap<String, String> directory) {
        String encoding = System.getProperty("console.encoding", "cp866");
        iScanner = new Scanner(System.in, encoding);

        System.out.print("Введите телефон:");
        String telephone = iScanner.nextLine();
        System.out.print("Введите имя:");
        String name = iScanner.nextLine();

        if (directory.containsKey(telephone)) {
            System.out.println("Такой номер уже есть.");
            return directory;
        }

        directory.put(telephone, name);
        return directory;

    }

    public static void print(String[] arrStr) {
        for (int index = 0; index < arrStr.length; index++) {
            System.out.println(arrStr[index]);
        }
    }

}
