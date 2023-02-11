package seminars;

import java.util.ArrayList;
import java.util.Random;

public class seminar_3 {

    // Array list
    /*
     * Даны следующие строки, cравнить их с помощью == и метода equals() класса
     * Object
     * String s1 = "hello";
     * String s2 = "hello";
     * String s3 = s1;
     * String s4 = "h" + "e" + "l" + "l" + "o";
     * String s5 = new String("hello");
     * String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
     */
    /*
     * Заполнить список десятью случайными числами.
     * Отсортировать список методом sort() и вывести его на экран.
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        ArrayList<Integer> listSorted = FillList(list);
        OutPutList(listSorted);
        listSorted.sort(null);
        System.out.println();
        OutPutList(listSorted);

        /*
         * Заполнить список названиями планет Солнечной системы в произвольном порядке с
         * повторениями.
         * Вывести название каждой планеты и количество его повторений в списке.
         * 
         * 
         * Создать список типа ArrayList<String>.
         * Поместить в него как строки, так и целые числа.
         * Пройти по списку, найти и удалить целые числа.
         * str.matches("\\d+")
         * 
         * Каталог товаров книжного магазина сохранен в виде двумерного списка
         * List<ArrayList<String>> так, что на 0й позиции каждого внутреннего списка
         * содержится название жанра, а на остальных позициях - названия книг. Напишите
         * метод для заполнения данной структуры.
         * 
         */

    }

    public static void FillPlanetsList() {
        String[] AllPlanets = new String[] { "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus",
                "Neptune" };

        Random random = new Random();

        ArrayList planeList = new ArrayList();
        for (int i = 0; i < 10; i++) {
            // planeList.add(AllPlanets[]);
        }

    }

    public static ArrayList<Integer> FillList(ArrayList<Integer> list) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }

        return list;
    }

    public static void OutPutList(ArrayList<Integer> list) {
        for (int i : list) {
            System.out.print(i + " ");
        }
    }

}
