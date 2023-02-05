package home_works.h_w_4;

import java.util.Arrays;
import java.util.LinkedList;

public class h_w_4_1 {

    public static void main(String[] args) {
        /*
         * Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который
         * вернет “перевернутый” список.
         */

        var lstInt = new LinkedList<Integer>();

        for (int i = 0; i < 10; i++) {
            lstInt.add(i);
        }

        var lstStr = new LinkedList<String>();
        for (int i = 0; i < 10; i++) {
            lstStr.add("x" + i);
        }

        System.out.println(Arrays.toString(lstInt.toArray()));
        System.out.println(Arrays.toString(reversList(lstInt).toArray()));

        System.out.println(Arrays.toString(lstStr.toArray()));
        System.out.println(Arrays.toString(reversList(lstStr).toArray()));
    }

    public static LinkedList reversList(LinkedList lst) {
        var tempStk = new LinkedList<>();

        for (int i = lst.size() - 1; i >= 0; i--) {
            tempStk.add(lst.get(i));
        }

        return tempStk;
    }

}
/*
 * Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() -
 * помещает элемент в конец очереди, dequeue() - возвращает первый элемент из
 * очереди и удаляет его, first() - возвращает первый элемент из очереди, не
 * удаляя.
 */

/*
 * В калькулятор добавьте возможность отменить последнюю операцию.
 */