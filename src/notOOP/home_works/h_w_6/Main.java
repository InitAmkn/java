package home_works.h_w_6;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    /*
     * Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
     * методы. Реализовать в java.
     * Создать множество ноутбуков.
     * 1. Написать метод, который будет запрашивать у пользователя критерий
     * фильтрации и выведет выборку: имя ноутбука и выбранный критерий . Критерии
     * фильтрации можно хранить в Map.
     * Сделать выборку.
     * Например:
     * Введите цифру, соответствующую необходимому критерию:
     * 1 - ОЗУ
     * 2 - Объем ЖД
     * 3 - Операционная система
     * 4 - Цвет …
     * Пользователь ввел 1. Вывести в виде.
     * |Имя| ОЗУ|
     * |--------|-----------|
     * | Asus | 2ГБ |
     * | HP | 4ГБ |
     * | MSI | 6ГБ |
     * 
     * 2. Отфильтровать ноутбуки первоначального множества. По имени ноутбука в
     * алфавитном порядке, по цене по убыванию
     * Например, по алфавиту
     * |Имя| ОЗУ| Цена
     * |--------|-----------|-----------|
     * | Asus | 2ГБ | 4666|
     * | MSI | 4ГБ |6600|
     * | HP | 6ГБ| 5555|
     */
    static String encoding = System.getProperty("console.encoding", "cp866");
    static Scanner iScanner = new Scanner(System.in, encoding);

    public static void main(String[] args) {

        Notebook n1 = new Notebook("DEXP", "4 ГБ", "128 ГБ", "Windows 11 Pro", "Intel Celeron N4020", "серебристый",
                10000f);
        Notebook n2 = new Notebook("Asus", "6 ГБ", "128 ГБ", "Windows 10 Pro", "Intel Celeron 3350", "серый", 11000f);
        Notebook n3 = new Notebook("MSI", "4 ГБ", "512 ГБ", "Windows 10 Pro", "Intel Celeron N4020", "белый", 16000f);
        Notebook n4 = new Notebook("Aser", "8 ГБ", "1 TБ", "Windows 10 Home", "Intel Celeron N4020", "черный", 18000f);
        Notebook n5 = new Notebook("Hasee", "16 ГБ", "512 ГБ", "Windows 11 Home", "Intel Celeron N6020", "серый",
                22000f);

        LinkedList<Notebook> allNotebooks = new LinkedList<>(Arrays.asList(n1, n2, n3, n4, n5));

        String[] menu_1 = {
                "Выберите вариант взаимодействия:",
                "1 - Вывести варанты по одному критерию",
                "2 - Сортировка всех вариантов по критерию"
        };

        String[] menu_1_1 = {
                "Введите цифру, соответствующую необходимому критерию:",
                "1 - ОЗУ",
                "2 - Объем ЖД",
                "3 - Операционная система",
                "4 - Процессор",
                "5 - Цвет",
                "6 - Цена"
        };
        String[] menu_1_2 = {
                "Введите цифру, соответствующую необходимому критерию:",
                "1 - Бренд",
                "2 - Цена (по убыванию)"
        };

        printMenu(menu_1);
        switch (iScanner.nextLine()) {
            case "1":
                printMenu(menu_1_1);
                printFindInfo(allNotebooks, iScanner.nextLine());
                break;
            case "2":
                printMenu(menu_1_2);
                printSortedInfo(allNotebooks, iScanner.nextLine());
                break;
        }

        iScanner.close();
    }

    public static void printSortedInfo(LinkedList<Notebook> allNotebooks, String index) {
        // пришлось изучить инфу про копораторы
        switch (index) {
            case "1":
                Collections.sort(allNotebooks, new Comparator<Notebook>() {
                    @Override
                    public int compare(Notebook n1, Notebook n2) {
                        return n1.getBrand().compareTo(n2.getBrand());
                    }
                });
                break;
            case "2":
                Collections.sort(allNotebooks, new Comparator<Notebook>() {
                    @Override
                    public int compare(Notebook n1, Notebook n2) {
                        return n2.GetDataByIndex("6").compareTo(n1.GetDataByIndex("6"));
                    }
                });
                break;
            default:
                System.out.println("Ввод некорректный, данные без сортировки:");
                break;
        }

        for (var el : allNotebooks) {
            System.out.printf("|%s|%s|%s|%s|%s|%s|%s|", el.getBrand(), el.GetDataByIndex("1"), el.GetDataByIndex("2"),
                    el.GetDataByIndex("3"), el.GetDataByIndex("4"), el.GetDataByIndex("5"), el.GetDataByIndex("6"));
            System.out.println();
        }
    }

    public static void printFindInfo(LinkedList<Notebook> allNotebooks, String index) {

        for (var el : allNotebooks) {
            if (el.GetDataByIndex(index) == null) {
                System.out.println("Вы вне зоны поиска");
                break;
            }
            System.out.printf("|%s|%s|", el.getBrand(), el.GetDataByIndex(index));
            System.out.println();
        }
    }

    public static void printMenu(String[] arrStr) {
        for (int index = 0; index < arrStr.length; index++) {
            System.out.println(arrStr[index]);
        }
    }
}
