package seminars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class seminar_4 {
    /*
     * 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
     * 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов.
     * Сравните с предыдущим.
     * 
     * public static void main(String[] args) {
     * 
     * List<Integer> list1 = new ArrayList<>();
     * List<Integer> list2 = new LinkedList<>();
     * long start = System.nanoTime();
     * for (int i = 0; i < 100000; i++) {
     * list1.add(i);
     * }
     * long end = System.nanoTime();
     * System.out.println(end - start);
     * 
     * start = System.nanoTime();
     * for (int i = 0; i < 100000; i++) {
     * list2.add(i);
     * }
     * end = System.nanoTime();
     * System.out.println(end - start);
     */
    /*
     * Реализовать консольное приложение, которое:
     * Принимает от пользователя строку вида
     * text~num
     * Нужно рассплитить строку по ~, сохранить text в связный список на позицию
     * num.
     * Если введено print~num, выводит строку из позиции num в связном списке и
     * удаляет её из списка
     * 
     * 
     * Scanner iScanner = new Scanner(System.in);
     * List<String> names = new ArrayList<>();
     * while (true) {
     * String str = iScanner.nextLine();
     * if (str.equals(""))
     * break;
     * String[] strArr = str.split("~");// strArr[0]=name(привет),
     * strArr[1]=number(1)
     * int number = Integer.parseInt(strArr[1]);
     * if (strArr[0].equals("print"))
     * try {
     * System.out.println(names.get(number));
     * names.remove(number);
     * } catch (Exception ex) {
     * System.out.println(ex.getMessage());
     * }
     * else if (number != names.size()) {
     * System.out.println("Incorrect index should be " + names.size());
     * continue;
     * } else
     * names.add(number, strArr[0]);
     * 
     * }
     * iScanner.close();
     */

    /*
     * Реализовать консольное приложение, которое:
     * Принимает от пользователя и “запоминает” строки.
     * Если введено print, выводит строки так, чтобы последняя введенная была первой
     * в списке, а первая - последней.
     * Если введено revert, удаляет предыдущую введенную строку из памяти
     */

    /*
     * 1) Написать метод, который принимает массив элементов, помещает их в стэк и
     * выводит на консоль содержимое стэка.
     * 2) Написать метод, который принимает массив элементов, помещает их в очередь
     * и выводит на консоль содержимое очереди
     */

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        Stack<String> inputString = new Stack<>();
        while (true) {
            String txt = iScanner.nextLine();
            if (txt.equals(""))
                break;
            else if (txt.equals("print")) {
                Collections.reverse(inputString);
                System.out.println(inputString.toString());
                Collections.reverse(inputString);
            } else if (txt.equals("revert")) {
                System.out.println(inputString.pop());
                System.out.println(inputString.toString());
            } else {
                inputString.push(txt);
            }
        }
        iScanner.close();

        String[] array = { "1", "2", "3", "4", "5" };
        Stack<String> stack = stackMethod(array);
        Queue<String> queue = queueMethod(array);

        System.out.println(stack); // [1, 2, 3, 4, 5]
        System.out.println(queue); // [1, 2, 3, 4, 5]

        stack.pop();
        System.out.println(stack); // [1, 2, 3, 4]

        queue.remove();
        System.out.println(queue); // [2, 3, 4, 5]

    }

    public static Stack<String> stackMethod(String[] array) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < array.length; i++) {
            stack.add(array[i]);
        }

        return stack;

    }

    public static Queue<String> queueMethod(String[] array) {
        Queue<String> queue = new LinkedList<String>();

        for (int i = 0; i < array.length; i++) {
            queue.add(array[i]);
        }

        return queue;

    }
}