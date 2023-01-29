package home_works.h_w_3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class h_w_3_2 {

    public static void main(String[] args) {
        /*
         * 2) Пусть дан произвольный список целых чисел, удалить из него четные числа
         */

        int[] array = FillArray(10);

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(FilterEvenNumbers(array).toArray()));

    }

    public static ArrayList<Integer> FilterEvenNumbers(int[] array) {
        ArrayList<Integer> resultArray = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                resultArray.add(array[i]);
            }
        }
        return resultArray;

    }

    public static int[] FillArray(int length) {
        Random rand = new Random();
        int[] randArray = new int[length];
        for (int i = 0; i < randArray.length; i++) {
            randArray[i] = rand.nextInt(100);
        }
        return randArray;
    }

}
