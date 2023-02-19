package OOP.Zoo.animals;

import java.time.LocalDate;

public abstract class Animal {

    protected String name;
    protected int yearBirth;
    protected int countLimbs;
    protected int weight;

    public Animal(String name,
            int yearBirth,
            int countLimbs,
            int weight) {

        this.name = name;
        this.yearBirth = yearBirth;
        this.countLimbs = countLimbs;
        this.weight = weight;
    }

    public int getAge() {
        LocalDate date = LocalDate.now();
        return date.getYear() - yearBirth;
    }

    public String getName() {
        return name;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public int getCountLimbs() {
        return countLimbs;
    }

    public void setCountLimbs(int countLimbs) {
        this.countLimbs = countLimbs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public void feed(int foodWeight) {
        if (this.weight + foodWeight <= getMaxWeight()) {
            this.weight = weight + foodWeight;
        } else {
            System.out.println("Max weight exceeded");
        }
    }

    public abstract String getType();

    public abstract int getMaxWeight();
}
