package OOP.Zoo.factory;

import java.util.ArrayList;

import OOP.Zoo.animals.Lion;

public class LionsFactory {

    public static ArrayList<Lion> createLions(int lionCount) {

        ArrayList<Lion> lions = new ArrayList<>();

        for (int i = 0; i < lionCount; i++) {
            lions.add(new Lion(String.format("Lion%s", i + 1), 2000 + i, 4, (int) (10 * Math.random()),
                    (int) (10 * Math.random())));
        }

        return lions;

    }

}
