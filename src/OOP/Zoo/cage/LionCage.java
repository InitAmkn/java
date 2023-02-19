package OOP.Zoo.cage;

import java.util.ArrayList;
import java.util.Collections;

import OOP.Zoo.Comparators.LionComparator;
import OOP.Zoo.animals.Animal;
import OOP.Zoo.animals.Lion;

public class LionCage implements AnimalCage {

    private ArrayList<Lion> lionsInCage;

    public LionCage() {
        this.lionsInCage = new ArrayList<Lion>();
    }

    public LionCage(ArrayList<Lion> lions) {
        this.lionsInCage = lions;
    }

    @Override
    public void addAnimal(Animal animal) {
        if (animal instanceof Lion) {
            lionsInCage.add((Lion) animal);
        }

    }

    public ArrayList<Lion> getAll() {
        return lionsInCage;
    }

    @Override
    public void deliverFood(int weightFood) {
        // TODO Auto-generated method stub

    }

    @Override
    public String toString() {
        StringBuilder lions = new StringBuilder();
        for (Lion el : lionsInCage) {
            lions.append(el.toString());
            lions.append(" - За решеткой\n");
        }
        return lions.toString();
    }

    public void sortByManeVolume() {
        Collections.sort(lionsInCage, new LionComparator());
    }

    @Override
    public Animal releaseAnimalFromCage() {
        if (lionsInCage.size() > 0) {
            Lion lionRemoved = lionsInCage.get(0);
            lionsInCage.remove(0);
            return lionRemoved;
        }
        return null;
    }
}
