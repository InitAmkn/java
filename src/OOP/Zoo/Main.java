package OOP.zoo;

import java.util.ArrayList;

import OOP.zoo.animalUtils.AnimalUtils;
import OOP.zoo.animals.Wolf;
import OOP.zoo.cage.WolfCage;
import OOP.zoo.factory.WolfsFactory;
import OOP.zoo.terminal.TerminalReader;

public class Main {

    public static void main(String[] args) {
        ArrayList<Wolf> wolfs = WolfsFactory.createLions(10);
        AnimalUtils.sortAnimals(wolfs);

        WolfCage wolfsInCage = new WolfCage(wolfs);

        for (Wolf el : wolfs) {
            System.out.println(el.toString());
        }
        wolfsInCage.feed(150);
        System.out.println();
        for (Wolf el : wolfs) {
            System.out.println(el.toString());
        }

        TerminalReader.newTerminalReader(null).endLess();

    }

}
