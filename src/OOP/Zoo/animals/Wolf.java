package OOP.zoo.animals;

import OOP.zoo.ZooPopulation;

// Создать класс Wolf, наследника класса Animal.

// Создать класс WolfCage, имплементирующий интерфейс AnimalCage
// Добавить абстрактный метод в интерфейс AnimalCage, достающий первое попавшееся животное из клетки.
// Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре

public class Wolf extends Animal {
    public static final int MAX_WEIGHT = 20;
    public static final String TYPE = ZooPopulation.WOLF.getName();

    public Wolf(String name, int yearBirth, int countLimbs, double weight) {
        super(name, yearBirth, countLimbs, weight);

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

        return String.format("%S; name:%S; Age:%S; Count Limbs:%S; Weight:%S",
                TYPE,
                name,
                getAge(),
                countLimbs,
                weight);
    }
}
