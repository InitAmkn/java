package OOP.Zoo.factory;

import java.util.ArrayList;

import OOP.Zoo.animals.Wolf;

public class WolfsFactory {

    public static ArrayList<Wolf> createLions(int lionCount) {

        ArrayList<Wolf> wolfs = new ArrayList<>();

        for (int i = 0; i < lionCount; i++) {
            wolfs.add(new Wolf(String.format("Wolf%s", i + 1), 2000 + i, 4, (int) (10 * Math.random())));
        }

        return wolfs;

    }

}
