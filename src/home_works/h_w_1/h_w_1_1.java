package home_works.h_w_1;

import java.util.Scanner;

public class h_w_1_1 {

    public static void main(String[] args) {
        /*
         * Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение
         * чисел от 1 до n)
         */
        String encoding = System.getProperty("console.encoding", "cp866");
        System.out.print("Введите число n:");
        Scanner iScanner = new Scanner(System.in, encoding);
        String num = iScanner.next();
        try {
            System.out.print("Сумма чисел от 1 до n: \t");
            System.out.println(FindTriangularNum(Long.parseLong(num)));
            System.out.print("Факториал n!: \t\t");
            System.out.println(FindFactorial(Long.parseLong(num)));
        } catch (Throwable t) {
            System.out.println("Введено не число");
        }

        iScanner.close();
    }

    public static Long FindTriangularNum(Long inputNum) {
        Long triangularNum = 0l;
        for (Long i = 0l; i <= inputNum; i++) {
            triangularNum = triangularNum + i;
        }
        return triangularNum;
    }

    public static Long FindFactorial(Long inputNum) {
        Long factorialNum = 1l;
        for (Long i = 1l; i <= inputNum; i++) {
            factorialNum = factorialNum * i;
        }
        return factorialNum;
    }

}
