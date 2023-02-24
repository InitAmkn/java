package OOP.zoo.cage;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

import OOP.zoo.animals.Animal;
import OOP.zoo.animals.Snake;
import OOP.zoo.animals.Comparators.SnakeComparator;
import OOP.zoo.animals.Comparators.WolfComparator;

public class SnakeCage implements AnimalCage<Snake> {

    private ArrayList<Snake> snakesInCage;
    private LocalDate dateFeed;

    public SnakeCage() {
        this.snakesInCage = new ArrayList<Snake>();
    }

    public SnakeCage(ArrayList<Snake> wolfs) {
        this.snakesInCage = wolfs;
    }

    @Override
    public void addAnimal(Snake animal) {
        if (animal instanceof Snake) {
            snakesInCage.add((Snake) animal);
        }

    }

    public ArrayList<Snake> getAll() {
        return snakesInCage;
    }

    @Override
    public LocalDate feed(double weightFoodKG) {
        double foodForOne = weightFoodKG / snakesInCage.size();
        for (Snake el : snakesInCage) {
            el.feed(foodForOne);
        }
        dateFeed = LocalDate.now();
        return dateFeed;
    }

    @Override
    public LocalDate checkDateTheLastFeeding() {
        return dateFeed;
    }

    @Override
    public String toString() {
        StringBuilder snakes = new StringBuilder();
        for (Snake el : snakesInCage) {
            snakes.append(el.toString());
            snakes.append(" - За решеткой");
            snakes.append("\n");
        }
        return snakes.toString();
    }

    public void sortByWeightAndAge() {
        Collections.sort(snakesInCage, new SnakeComparator());
    }

    @Override
    public Animal releaseAnimalFromCage() {
        if (snakesInCage.size() > 0) {
            Snake snakeRemoved = snakesInCage.get(0);
            snakesInCage.remove(0);
            return snakeRemoved;
        }
        return null;
    }
}
