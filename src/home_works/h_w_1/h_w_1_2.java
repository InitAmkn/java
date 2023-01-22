package home_works.h_w_1;

import java.util.Scanner;

public class h_w_1_2 {

    public static void main(String[] args) {
        /*
         * Вывести все простые числа от 1 до 1000
         */
        String encoding = System.getProperty("console.encoding", "cp866");
        System.out.print("Введите число n: ");
        Scanner iScanner = new Scanner(System.in, encoding);
        String num = iScanner.next();
        try {
            System.out.print("Список простых чиселот 1 до ");
            System.out.println(num);
            PrintAllPrimeNumbers(Integer.parseInt(num));
        } catch (Throwable t) {
            System.out.println("Введено не число");
        }

        iScanner.close();
    }

    public static void PrintAllPrimeNumbers(int num) {
        for (int i = 1; i <= num; i++) {
            boolean isPrime = true;
            for (int j = i / 2; j > 1; j--) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.print(" ");
                System.out.print(i);
            }
        }
    }

}
