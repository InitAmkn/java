package OOP.zoo.terminal.executable.operations;

import OOP.zoo.terminal.executable.CommandExecutable;
import OOP.zoo.zoo.Zoo;

public class ShowLionExecutable implements CommandExecutable {

    private Zoo zoo;

    public ShowLionExecutable(Zoo zoo) {
        this.zoo = zoo;
    }

    @Override
    public void execute() {
        zoo.showAllLions();
    }

}
