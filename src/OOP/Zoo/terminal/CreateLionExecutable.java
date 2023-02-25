package OOP.zoo.terminal;

import OOP.zoo.animals.Lion;
import OOP.zoo.cage.LionCage;
import OOP.zoo.zoo.Zoo;

public class CreateLionExecutable implements CommandExecutable {

    private String name;
    private int yearBirth;
    private int countLimbs;
    private double weight;
    private int maneVolume;

    private Zoo zoo;

    // CreateLionExecutable(String name,
    // int yearBirth,
    // int countLimbs,
    // double weight,
    // int maneVolume) {

    // }

    public CreateLionExecutable(String name,
            int yearBirth,
            int countLimbs,
            double weight,
            int maneVolume) {
        this.name = name;
        this.yearBirth = yearBirth;
        this.countLimbs = countLimbs;
        this.weight = weight;
        this.maneVolume = maneVolume;
    }

    @Override
    public void execute() {
        zoo.lions.addAnimal(new Lion(
                name,
                yearBirth,
                countLimbs,
                weight,
                maneVolume));

    }

}
