package Lessons.l_1;

import java.text.Format;
import java.time.LocalDateTime;
import java.util.Scanner;

public class helloWord {
    public static void main(String[] args) {

        var scan = new Scanner(System.in);
        System.out.println("hello world");
        System.out.println(LocalDateTime.now());
        System.out.print("Как тебя зовут?: ");
        String name = scan.nextLine();
        int hour = LocalDateTime.now().getHour();
        if (hour < 5) {
            System.out.printf("Доброй ночи, %s", name);
        } else if (hour < 12) {
            System.out.printf("Доброе утро, %s", name);
        } else if (hour < 18) {
            System.out.printf("Добрый день, %s", name);
        } else {
            System.out.printf("Добрый вечер, %s", name);
        }

    }
}
