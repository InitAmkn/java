package OOP.zoo.animals.Comparators;

import java.util.Comparator;

import OOP.zoo.animals.Animal;

public class AnimalComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        return Integer.compare(o2.getAge(), o1.getAge());
    }

}
