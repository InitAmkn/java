package seminars;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class seminar_2 {
    public static void main(String[] args) {
        /*
         * Дано четное число N (>0) и символы c1 и c2.
         * Написать метод, который вернет строку длины N, которая состоит из
         * чередующихся символов c1 и c2, начиная с c1.
         * N=5
         * c1=”Oleg”
         * c2=”Vasya”
         * res = “OlegVasyaOlegVasyaOleg”
         */
        /*
         * String c1 = "Oleg";
         * String c2 = "Vasya";
         * // System.out.println(Ex1(c1, c2, 10));
         * 
         * 
         * Напишите метод, который сжимает строку.
         * Пример: вход aaaabbbcdd.
         * Выход abcd
         * charAt(i) и indefOf(s)
         */
        String c1 = "adfda";
        // System.out.println(Palindrome(c1));

        /*
         * Напишите метод, который принимает на вход строку (StringBulder) и определяет
         * является ли строка палиндромом (возвращает boolean значение).
         * equals и StringBulder для revers
         */

        /*
         * Напишите метод, который составит строку, состоящую из 100 повторений слова
         * TEST и метод, который запишет эту строку в простой текстовый файл,
         * обработайте исключения.
         */
        // Print100TEST();

        /*
         * Напишите метод, который вернет содержимое текущей папки в виде массива строк.
         * Напишите метод, который выведет массив, возвращенный предыдущим методом в
         * файл.
         * Обработайте ошибки с помощью try-catch конструкции. В случае возникновения
         * исключения, оно должно записаться в лог-файл.
         * https://metanit.com/java/tutorial/6.11.php
         * [ “Sem1”, “Sem2”]
         */

        File dir = new File(".");

        for (String path : dir.list()) {
            System.out.println(path);// dir.isDirectory()

        }

    }

    public static void Print100TEST() {
        StringBuilder TEST100 = new StringBuilder();
        for (int index = 0; index < 10; index++) {
            TEST100.append("TEST");
        }

        try (FileWriter file1 = new FileWriter("file.txt", false)) {

            file1.append(TEST100.toString());
            file1.append("\n");
            file1.close();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }

    }

    public static boolean Palindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static String Ex2(String c1) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < result.length(); i++) {
            if (result.toString().indexOf(c1.charAt(i)) == -1) {
                result.append(c1.charAt(i));
            }
        }
        return result.toString();
    }

    public static String Ex1(String c1, String c2, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            /*
             * if (i % 2 == 0) {
             * result.append(c1);
             * } else {
             * result.append(c2);
             * }
             */
            result = (i % 2 == 0) ? result.append(c1) : result.append(c2);
        }
        return result.toString();
    }
}
