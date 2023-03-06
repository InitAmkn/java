package OOP.zoo.terminal.executable.operations;

import OOP.zoo.terminal.executable.CommandExecutable;
import OOP.zoo.zoo.Zoo;

public class DeleteWolfExecutable implements CommandExecutable {

    private Zoo zoo;

    public DeleteWolfExecutable(Zoo zoo) {
        this.zoo = zoo;
    }

    @Override
    public void execute() {
        this.zoo.takeOfWolf();
    }

}
