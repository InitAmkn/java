package home_works.h_w_3;

import java.util.Arrays;
import java.util.Random;

public class h_w_3_1 {

    public static void main(String[] args) {
        /*
         * 1) Реализовать алгоритм сортировки слиянием
         */

        int[] array = FillArray(10);
        System.out.println(Arrays.toString(array));
        MergeSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static int[] FillArray(int length) {
        Random rand = new Random();
        int[] randArray = new int[length];
        for (int i = 0; i < randArray.length; i++) {
            randArray[i] = rand.nextInt(100);
        }
        return randArray;
    }

    public static void MergeSort(int[] array) {
        if (array.length < 2) {
            return;
        }

        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }
        for (int i = mid; i < array.length; i++) {
            right[i - mid] = array[i];
        }
        MergeSort(left);
        MergeSort(right);
        Merge(array, left, right);
    }

    public static void Merge(int[] arrayTarget, int[] array1, int[] array2) {
        int array1MinIndex = 0;
        int array2MinIndex = 0;
        int arrayTargetMinIndex = 0;
        while (array1MinIndex < array1.length && array2MinIndex < array2.length) {
            if (array1[array1MinIndex] <= array2[array2MinIndex]) {
                arrayTarget[arrayTargetMinIndex] = array1[array1MinIndex];
                array1MinIndex++;
            } else {
                arrayTarget[arrayTargetMinIndex] = array2[array2MinIndex];
                array2MinIndex++;
            }
            arrayTargetMinIndex++;
        }

        while (array1MinIndex < array1.length) {
            arrayTarget[arrayTargetMinIndex] = array1[array1MinIndex];
            array1MinIndex++;
            arrayTargetMinIndex++;
        }
        while (array2MinIndex < array2.length) {
            arrayTarget[arrayTargetMinIndex] = array2[array2MinIndex];
            array2MinIndex++;
            arrayTargetMinIndex++;
        }

    }

}
