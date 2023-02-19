package OOP.Zoo.cage;

import java.util.ArrayList;
import java.util.Collections;

import OOP.Zoo.Comparators.WolfComparator;
import OOP.Zoo.animals.Animal;
import OOP.Zoo.animals.Wolf;

public class WolfCage implements AnimalCage {

    private ArrayList<Wolf> wolfsInCage;

    public WolfCage() {
        this.wolfsInCage = new ArrayList<Wolf>();
    }

    public WolfCage(ArrayList<Wolf> wolfs) {
        this.wolfsInCage = wolfs;
    }

    @Override
    public void addAnimal(Animal animal) {
        if (animal instanceof Wolf) {
            wolfsInCage.add((Wolf) animal);
        }

    }

    public ArrayList<Wolf> getAll() {
        return wolfsInCage;
    }

    @Override
    public void deliverFood(int weightFood) {
        // TODO Auto-generated method stub

    }

    @Override
    public String toString() {
        StringBuilder wolfs = new StringBuilder();
        for (Wolf el : wolfsInCage) {
            wolfs.append(el.toString());
            wolfs.append("- За решеткой");
            wolfs.append("\n");
        }
        return wolfs.toString();
    }

    public void sortByManeVolume() {
        Collections.sort(wolfsInCage, new WolfComparator());
    }

    @Override
    public Animal releaseAnimalFromCage() {
        if (wolfsInCage.size() > 0) {
            Wolf wolfRemoved = wolfsInCage.get(0);
            wolfsInCage.remove(0);
            return wolfRemoved;
        }
        return null;
    }
}
