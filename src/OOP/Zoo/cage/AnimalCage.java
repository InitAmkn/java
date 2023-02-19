package OOP.Zoo.cage;

import java.sql.Time;

import javax.xml.crypto.Data;

import OOP.Zoo.animals.Animal;

public interface AnimalCage {

    public abstract void addAnimal(Animal animal);

    public abstract void deliverFood(int weightFood);

    public abstract Animal releaseAnimalFromCage();

    // public abstract Time cleanCage();

}
