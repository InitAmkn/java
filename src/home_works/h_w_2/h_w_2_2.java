package home_works.h_w_2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class h_w_2_2 {

    public static void main(String[] args) {

        /*
         * 2) Реализуйте алгоритм сортировки пузырьком числового массива, результат
         * после каждой итерации запишите в лог-файл.
         */
        int[] tempArray = FillArray(20);
        System.out.println(Arrays.toString(tempArray));
        System.out.println(Arrays.toString(BubbleSorting(tempArray)));

    }

    public static void Logger(String saveString) {
        try (FileWriter file1 = new FileWriter("src/home_works/h_w_2/logger.log", true)) {
            file1.append(saveString);
            file1.append("\n");
            file1.close();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static int[] FillArray(int length) {
        Random rand = new Random();
        int[] randArray = new int[length];
        for (int i = 0; i < randArray.length; i++) {
            randArray[i] = rand.nextInt(100);
        }
        return randArray;
    }

    public static int[] BubbleSorting(int[] randArray) {
        boolean isSorted;
        do {
            isSorted = true;
            for (int i = 0; i < randArray.length - 1; i++) {
                if (randArray[i] > randArray[i + 1]) {
                    isSorted = false;
                    break;
                }

            }
            for (int j = 0; j < randArray.length - 1; j++) {
                int temp = 0;
                if (randArray[j] > randArray[j + 1]) {
                    temp = randArray[j + 1];
                    randArray[j + 1] = randArray[j];
                    randArray[j] = temp;
                }
            }
            Logger(Arrays.toString(randArray));
        } while (!isSorted);
        return randArray;
    }

}
