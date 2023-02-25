package OOP.zoo.animalUtils;

import java.util.Collections;
import java.util.List;

import OOP.zoo.animals.Animal;
import OOP.zoo.animals.Comparators.AnimalComparator;

public class AnimalUtils {
    public static <T extends Animal> List<T> sortAnimals(List<T> animalList) {
        Collections.sort(animalList, new AnimalComparator());
        return animalList;
    }
}
