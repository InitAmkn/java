package seminars.semenar_6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

public class seminar_6 {
    public static void main(String[] args) {
        /*
         * Integer[] arr = { 1, 2, 7, 5, 6, 7, 5, 9 };
         * HashSet<Integer> set1 = new HashSet<>(Arrays.asList(arr));
         * Iterator<Integer> iterator = set1.iterator();
         * while (iterator.hasNext()) {
         * System.out.print(iterator.next() + " ");
         * }
         * System.out.println();
         * 
         * LinkedHashSet<Integer> set2 = new LinkedHashSet<>(Arrays.asList(arr));
         * Iterator<Integer> iterator2 = set2.iterator();
         * while (iterator2.hasNext()) {
         * System.out.print(iterator2.next() + " ");
         * }
         * System.out.println();
         * TreeSet<Integer> set3 = new TreeSet<>(Arrays.asList(arr));
         * Iterator<Integer> iterator3 = set3.iterator();
         * while (iterator3.hasNext()) {
         * System.out.print(iterator3.next() + " ");
         */

        /*
         * Задание No1
         * 1. Напишите метод, который заполнит массив из 1000 элементов случайными
         * цифрами от 0 до 24.
         * 2. Создайте метод, в который передайте заполненный выше массив и с
         * помощью Set вычислите процент уникальных значений в данном массиве и
         * верните его в виде числа с плавающей запятой.
         * Для вычисления процента используйте формулу:
         * процент уникальных чисел = количество уникальных чисел * 100 / общее
         * количество чисел в массиве.
         * 
         */
        Integer[] arr = FillArrey(1000);
        System.out.println(Arrays.toString(arr));

        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(arr));
        Iterator<Integer> iterator = set1.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.println((double) set1.size() * 100 / arr.length);
    }

    public static Integer[] FillArrey(int size) {
        Integer[] newArr = new Integer[size];
        Random random = new Random();

        for (Integer i = 0; i < size; i++) {
            newArr[i] = random.nextInt(25);
        }
        return newArr;
    }
}
