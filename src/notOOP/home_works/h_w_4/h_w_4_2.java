package home_works.h_w_4;

import java.util.Arrays;
import java.util.LinkedList;

public class h_w_4_2 {

    public static void main(String[] args) {
        /*
         * Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() -
         * помещает элемент в конец очереди, dequeue() - возвращает первый элемент из
         * очереди и удаляет его, first() - возвращает первый элемент из очереди, не
         * удаляя.
         */

        var lstStr = new LinkedList<String>();
        for (int i = 0; i < 10; i++) {
            lstStr.add("x" + i);
        }
        // вероятно я не понял задачу,
        // прошу рассписывать условия более очевидно

        LinkedEnqueue(lstStr, "hyh");
        System.out.println(Arrays.toString(lstStr.toArray()));
        System.out.println(LinkedDequeue(lstStr));
        System.out.println(Arrays.toString(lstStr.toArray()));
    }

    public static LinkedList<String> LinkedEnqueue(LinkedList<String> lst, String param) {
        // enqueue() помещает элемент в конец очереди
        lst.add(param);
        return lst;
    }

    public static String LinkedDequeue(LinkedList<String> lst) {
        // dequeue() - возвращает первый элемент из очереди и удаляет его
        String tempStr = "";
        if (lst.size() > 0) {
            tempStr = lst.get(0);
            lst.remove(0);
        }

        return tempStr;
    }

    public static String LinkedFirst(LinkedList<String> lst) {
        // first() - возвращает первый элемент из очереди, не удаляя
        String tempStr = "";
        if (lst.size() > 0) {
            tempStr = lst.get(0);
        }
        return tempStr;
    }

}
