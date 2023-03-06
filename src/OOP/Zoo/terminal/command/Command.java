package OOP.zoo.terminal.command;

import java.util.Arrays;
import java.util.List;

import OOP.zoo.ZooCommand;
import OOP.zoo.ZooPopulation;

public class Command {

    private String action;// введенная строка
    private String animal;
    private List<String> parameters;

    public Command(String action, String animal, List<String> parameters) {
        this.action = action;
        this.animal = animal;
        this.parameters = parameters;
    }

    public boolean isCreate() {
        return action.equals(ZooCommand.ADD.getName());
    }

    public boolean isDelete() {
        return action.equals(ZooCommand.DELETE.getName());
    }

    public boolean isShow() {
        return action.equals(ZooCommand.SHOW.getName());
    }

    public boolean isAll() {
        return animal.equals(ZooPopulation.ALL.getName());
    }

    public boolean isLion() {
        return animal.equals(ZooPopulation.LION.getName());
    }

    public boolean isWolf() {
        return animal.equals(ZooPopulation.WOLF.getName());
    }

    public List<String> getParameters() {
        return parameters;
    }

    @Override
    public String toString() {
        return String.format("%s - %s - %s", action, animal, Arrays.toString(parameters.toArray()));
    }
}
