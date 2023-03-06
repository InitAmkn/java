package OOP.zoo.animals;

import OOP.zoo.ZooPopulation;

public class Lion extends Animal {
    private int maneVolume;

    public static final double MAX_WEIGHT = 50;
    public static final String TYPE = ZooPopulation.LION.getName();

    public Lion(String name,
            int yearBirth,
            int countLimbs,
            double weight,
            int maneVolume) {
        super(name, yearBirth, countLimbs, weight);
        this.maneVolume = maneVolume;
    }

    public int getManeVolume() {
        return maneVolume;
    }

    public void setManeVolume(int maneVolume) {
        this.maneVolume = maneVolume;
    }

    @Override
    public String getType() {
        return TYPE;
    }

    @Override
    public double getMaxWeight() {
        return MAX_WEIGHT;
    }

    @Override
    public String toString() {

        return String.format("%S; name:%S; Age:%S; Count Limbs:%S; Weight:%S; Mane Volume:%S",
                TYPE,
                name,
                getAge(),
                countLimbs,
                weight,
                maneVolume);
    }
}
