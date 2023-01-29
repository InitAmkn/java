package home_works.h_w_3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class h_w_3_3 {

    public static void main(String[] args) {
        /*
         * 3) Задан целочисленный список ArrayList. Найти минимальное, максимальное и
         * среднее ариф из этого списка.
         */

        ArrayList<Integer> array = FillArray(10);

        System.out.println(Arrays.toString(array.toArray()));
        System.out.format("Max = %s", Max(array));
        System.out.println();
        System.out.format("Min = %s", Min(array));
        System.out.println();
        System.out.format("ArithmeticMean = %s", ArithmeticMean(array));
    }

    public static double ArithmeticMean(ArrayList<Integer> array) {
        double sum = 0;
        for (Integer integer : array) {
            sum += integer;
        }

        return sum / array.size();
    }

    public static int Max(ArrayList<Integer> array) {
        if (array.size() < 1) {
            return 0;
        }
        int max = array.get(0);

        for (int i = 0; i < array.size(); i++) {
            if (max <= array.get(i)) {
                max = array.get(i);
            }
        }
        return max;
    }

    public static int Min(ArrayList<Integer> array) {
        if (array.size() < 1) {
            return 0;
        }
        int min = array.get(0);

        for (int i = 0; i < array.size(); i++) {
            if (min > array.get(i)) {
                min = array.get(i);
            }
        }
        return min;
    }

    public static ArrayList<Integer> FillArray(int length) {
        Random rand = new Random();
        ArrayList<Integer> randArray = new ArrayList<Integer>();
        for (int i = 0; i < length; i++) {
            randArray.add(rand.nextInt(100));
        }
        return randArray;
    }

}
