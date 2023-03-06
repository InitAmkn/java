package OOP.zoo.terminal.executable.operations;

import OOP.zoo.terminal.executable.CommandExecutable;
import OOP.zoo.zoo.Zoo;

public class ShowAllExecutable implements CommandExecutable {

    private Zoo zoo;

    public ShowAllExecutable(Zoo zoo) {
        this.zoo = zoo;
    }

    @Override
    public void execute() {
        zoo.showAllAnimals();
    }

}
