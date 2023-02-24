package OOP.zoo.cage;

import java.time.LocalDate;
import java.util.List;

import OOP.zoo.animals.Animal;

public interface AnimalCage<T extends Animal> {

    public abstract void addAnimal(T animal);

    public abstract LocalDate feed(double weightFoodKG);

    public abstract LocalDate checkDateTheLastFeeding();

    public abstract T releaseAnimalFromCage();

    // public abstract Time cleanCage();

    default public List<T> sortByAge(List<T> animalList) {
        return animalList;
    }
}
