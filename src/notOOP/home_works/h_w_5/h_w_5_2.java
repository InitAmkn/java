package home_works.h_w_5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class h_w_5_2 {

    public static void main(String[] args) {
        /*
         * 2) Пусть дан список сотрудников:Иван Иванов и т.д.
         * Написать программу, которая найдет и выведет повторяющиеся имена с
         * количеством повторений. Отсортировать по убыванию популярности.
         */
        String namesStr = "Иванов, Федоров, Смирнов, Иванов, Сизов, Сизов, Иванов, Смирнов";
        String[] namesArr = namesStr.split(", ");

        System.out.println(namesCounter(namesArr));
    }

    public static HashMap<String, Integer> namesCounter(String[] namesArr) {
        Arrays.sort(namesArr);
        // System.out.println(Arrays.toString(namesArr));

        HashMap<String, Integer> directory = new HashMap<>();
        for (int i = 0; i < namesArr.length; i++) {
            if (!directory.containsKey(namesArr[i]))
                directory.put(namesArr[i], 1);
            else {
                directory.put(namesArr[i], directory.get(namesArr[i]) + 1);
            }
        }
        directory = directory.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors
                        .toMap(Map.Entry::getKey,
                                Map.Entry::getValue,
                                (e1, e2) -> e1,
                                LinkedHashMap::new));
        // нашел это безумие в интернете

        return directory;
    }

}
