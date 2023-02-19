package OOP.Zoo;

import java.util.ArrayList;

import OOP.Zoo.animals.Lion;
import OOP.Zoo.animals.Wolf;
import OOP.Zoo.cage.LionCage;
import OOP.Zoo.cage.WolfCage;
import OOP.Zoo.factory.LionsFactory;
import OOP.Zoo.factory.WolfsFactory;

public class Main {

    public static void main(String[] args) {
        ArrayList<Wolf> wolfs = WolfsFactory.createLions(10);

        WolfCage wolfsInCage = new WolfCage(wolfs);
        wolfsInCage.sortByWeightAndAge();
        ;
        // for (Lion el : lionsInCage.getAll()) {
        // System.out.println(el.toString());
        // }
        System.out.println(wolfsInCage);

        for (int index = 0; index < 12; index++) {
            System.out.println(wolfsInCage.releaseAnimalFromCage());
        }
        System.out.println(wolfsInCage);

    }

}
