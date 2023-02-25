package OOP.zoo.factory;

import java.util.ArrayList;

import OOP.zoo.animals.Lion;

public class LionsFactory {

    public static ArrayList<Lion> createLions(int lionCount) {

        ArrayList<Lion> lions = new ArrayList<>();

        for (int i = 0; i < lionCount; i++) {
            lions.add(new Lion(String.format("Lion%s", i + 1),
                    2000 + i,
                    4,
                    (10 * Math.random()),
                    (int) (10 * Math.random())));
        }

        return lions;

    }

}
