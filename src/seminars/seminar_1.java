package seminars;

import java.time.LocalTime;
import java.util.Scanner;
import java.util.Random;

public class seminar_1 {
    public static void main(String[] args) {
        /*
         * System.out.println("Hello");
         * LocalDateTime now = LocalDateTime.now();
         * System.out.println(now);
         * Scanner iScanner = new Scanner(System.in);
         * 
         * String name = iScanner.next();
         * System.out.println(name);
         * iScanner.close();
         */
        /*
         * В консоли запросить имя пользователя. В зависимости от текущего времени,
         * вывести приветствие вида
         * "Доброе утро, <Имя>!", если время от 05:00 до 11:59
         * "Добрый день, <Имя>!", если время от 12:00 до 17:59;
         * "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
         * "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
         * 
         * 
         * String encoding = System.getProperty("console.encoding", "cp866");
         * System.out.println("Представтесь");
         * Scanner iScanner = new Scanner(System.in, encoding);
         * String name = iScanner.next();
         * System.out.println(HelloUser() + ", " + name);
         * 
         * iScanner.close();
         */

        /*
         * Дан массив двоичных чисел, например [1,1,0,1,1,1,1], вывести максимальное
         * количество подряд идущих 1.
         * Найти максимальное количество подряд идущих одинаковых элементов массива.
         * (постараться сделать с одним циклом)
         * 
         * 
         * int[] mas = new int[] { 1, 0, 1, 1, 0, 1, 1, 1, 0 };
         * System.out.println(FindOneCount(mas, 1));
         */

        /*
         * Дан массив nums = [3,2,1,2,3] и число val = 3.
         * Если в массиве есть числа, равные заданному, нужно перенести эти элементы в
         * конец массива.
         * Таким образом, первые несколько (или все) элементов массива должны быть
         * отличны от заданного, а остальные - равны ему.
         * [2,2,1,3,3]
         * 
         */

    }

    public static void FillMas(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            // arr[i] = (int)(Math.random()*2);// 0 1 -> 0 2 0,5; 1,6; 0,9
            arr[i] = random.nextInt(9);
        }
    }

    public static void PrintMas(int[] arr) {
        for (var el : arr) {
            System.out.print(el + " ");
        }
        System.out.println();
    }

    public static int FindOneCount(int[] masOne, int findCountNum) {
        int maxCount = 0;
        int count = 0;
        for (int i = 0; i < masOne.length; i++) {
            if (masOne[i] == findCountNum) {
                count++;
            }
            if (masOne[i] != findCountNum || i == masOne.length - 1) {
                if (count > maxCount) {
                    maxCount = count;
                }
                count = 0;
            }

        }
        return maxCount;
    }

    public static String HelloUser() {
        LocalTime now = LocalTime.now();
        if (now.isAfter(LocalTime.of(5, 0)) && now.isBefore(LocalTime.of(11, 59))) {
            return "Доброе утро";
        }
        if (now.isAfter(LocalTime.of(12, 0)) && now.isBefore(LocalTime.of(17, 59))) {
            return "Добрый день";
        }
        if (now.isAfter(LocalTime.of(18, 0)) && now.isBefore(LocalTime.of(22, 59))) {
            return "Добрый вечер";
        }
        if (now.isAfter(LocalTime.of(23, 0)) && now.isBefore(LocalTime.of(4, 59))) {
            return "Доброй ночи";
        }

        return "";
    }

}
