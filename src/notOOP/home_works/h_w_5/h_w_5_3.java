package home_works.h_w_5;

import java.util.Arrays;

public class h_w_5_3 {

    public static void main(String[] args) {

        /*
         * 3) Реализовать алгоритм пирамидальной сортировки (HeapSort).
         */

        int[] arr = { 8, 7, 8, 10, 2, 2, 3, 5, 8, 10, 5 };
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void heapSort(int[] arr) {
        for (int i = (arr.length - 2) / 2; i >= 0; i--) {
            sift(arr, i, arr.length);
        }

        for (int j = arr.length - 1; j > 0; j--) {
            swap(arr, 0, j);
            sift(arr, 0, j);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sift(int[] arr, int i, int upper) {
        while (true) {
            int left = i * 2 + 1;
            int right = i * 2 + 2;
            if (Math.max(left, right) < upper) {
                if (arr[i] >= Math.max(arr[left], arr[right])) {
                    break;
                } else if (arr[left] > arr[right]) {
                    swap(arr, i, left);
                    i = left;
                } else {
                    swap(arr, i, right);
                    i = right;
                }

            } else if (left < upper) {
                if (arr[left] > arr[i]) {
                    swap(arr, i, left);
                    i = left;
                } else {
                    break;
                }

            } else if (right < upper) {
                if (arr[right] > arr[i]) {
                    swap(arr, i, right);
                    i = right;
                } else {
                    break;
                }
            } else {
                break;
            }
        }
    }

}
