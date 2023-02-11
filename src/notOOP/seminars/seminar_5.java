package seminars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class seminar_5 {
    public static void main(String[] args) {
        /*
         * Создать структуру для хранения Номеров паспортов и Фамилий сотрудников
         * организации.
         * 123456 Иванов
         * 321456 Васильев
         * 234561 Петрова
         * 234432 Иванов
         * 654321 Петрова
         * 345678 Иванов
         * Вывести данные по сотрудникам с фамилией Иванов.
         * 
         * 
         * Scanner iScanner = new Scanner(System.in);
         * Map<Integer, String> names = new HashMap<>();
         * for (int i = 0; i < 3; i++) {
         * System.out.print("Введите номер и фамилию: ");
         * String[] name = iScanner.nextLine().split(" ");// name[0] - номер. name[1] -
         * фамилия
         * names.put(Integer.parseInt(name[0]), name[1]);
         * }
         * 
         * for (var el : names.entrySet()) {
         * System.out.print(el.getKey() + ": " + el.getValue() + "\n");
         * }
         * iScanner.close();
         */

        /*
         * Даны 2 строки, написать метод, который вернет true, если эти строки являются
         * изоморфными и false, если нет. Строки изоморфны, если одну букву в первом
         * слове можно заменить на некоторую букву во втором слове, при этом
         * повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением
         * порядка следования. (Например, add - egg изоморфны)
         * буква может не меняться, а остаться такой же. (Например, note - code)
         * Пример 1:
         * Input: s = "foo", t = "bar"
         * Output: false
         * Пример 2:
         * Input: s = "paper", t = "title"
         * 
         * 
         */

        /*
         * Написать программу, определяющую правильность расстановки скобок в выражении.
         * Пример 1: a+(d*3) - истина
         * Пример 2: [a+(1*3) - ложь
         * Пример 3: [6+(3*3)] - истина
         * Пример 4: {a}[+]{(d*3)} - истина
         * Пример 5: <{a}+{(d*3)}> - истина
         * Пример 6: {a+]}{(d*3)} - ложь
         */

        /*
         * Задание №5
         * Взять набор строк, например,
         * 
         * Мороз и солнце день чудесный
         * Еще ты дремлешь другпрелестный
         * Пора красавица проснись.
         * 
         * Написать метод, который отсортирует эти строки по длине с помощью TreeMap.
         * Строки с
         * одинаковой длиной не должны “потеряться”.
         */
        System.out.println(Check("<{a}+{(d*3)}>"));
    }

    public static Boolean Check(String expr) {
        Map<Character, Character> newMap = new HashMap<>();
        newMap.put('{', '}');
        newMap.put('(', ')');
        newMap.put('[', ']');
        newMap.put('<', '>');
        Stack<Character> charStack = new Stack<>();
        for (int i = 0; i < expr.length(); i++) {
            if (newMap.containsKey(expr.charAt(i))) {
                charStack.push(expr.charAt(i));
            } else if (newMap.containsValue(expr.charAt(i))) {
                if (charStack.isEmpty())
                    return false;
                if (Character.compare(expr.charAt(i), charStack.get(charStack.size() - 1)) > 0) {

                    charStack.pop();
                }
            }
        }
        System.out.println(charStack);
        return charStack.isEmpty();
    }

    public static Boolean IsIzomorph() {
        Map<Character, Character> pairs = new HashMap<>();
        String s1 = "title";
        String s2 = "title";
        // s = "paper", t = "tiqle"
        // key -> value
        // p -> t
        // a -> i
        // p -> q - не изоморф
        // e -> l
        // r -> e
        // addaa изоморфно eggee? - да
        // addaa изоморфно egghh? - нет
        if (s1.length() != s2.length())
            return false;
        if (s1.equals(s2))
            return true;
        for (int i = 0; i < s1.length(); i++) {
            Character a = s1.charAt(i);// символ первого слова
            Character b = s2.charAt(i);// символ второго слова
            // если в map уже есть ключ "a", то тогда значение по ключу a должно
            // соответствовать "b"
            if (pairs.containsKey(a) && pairs.get(a) != b)
                return false;
            else
                pairs.put(a, b);
        }
        return true;
    }
}