package OOP.zoo.terminal;

import OOP.zoo.animals.Lion;
import OOP.zoo.zoo.Zoo;

public class CreateLionExecutable implements CommandExecutable {

    private String name;
    private int yearBirth;
    private int countLimbs;
    private double weight;
    private int maneVolume;

    private Zoo zoo;

    public CreateLionExecutable(String name,
            int yearBirth,
            int countLimbs,
            double weight,
            int maneVolume,
            Zoo zoo) {
        this.name = name;
        this.yearBirth = yearBirth;
        this.countLimbs = countLimbs;
        this.weight = weight;
        this.maneVolume = maneVolume;
        this.zoo = zoo;
    }

    @Override
    public void execute() {

        zoo.addLion(new Lion(
                this.name,
                this.yearBirth,
                this.countLimbs,
                this.weight,
                this.maneVolume));
        // zoo.showAllLions();
    }

}
