package OOP.Zoo.cage;

import OOP.Zoo.animals.Animal;

public interface AnimalCage {

    public abstract void addAnimal(Animal animal);

    public abstract void deliverFood(int weightFood);

    public abstract Animal releaseAnimalFromCage();

    // public abstract Time cleanCage();

}
