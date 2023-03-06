package OOP.zoo.terminal.executable;

import OOP.zoo.terminal.command.Command;
import OOP.zoo.terminal.executable.operations.CreateLionExecutable;
import OOP.zoo.terminal.executable.operations.CreateWolfExecutable;
import OOP.zoo.terminal.executable.operations.DeleteLionExecutable;
import OOP.zoo.terminal.executable.operations.DeleteWolfExecutable;
import OOP.zoo.terminal.executable.operations.ShowAllExecutable;
import OOP.zoo.terminal.executable.operations.ShowLionExecutable;
import OOP.zoo.terminal.executable.operations.ShowWolfExecutable;
import OOP.zoo.zoo.Zoo;

public class CommandExecutableFactoryImpl implements CommandExecutableFactory {

    Zoo zoo;

    public CommandExecutableFactoryImpl(Zoo zoo) {
        this.zoo = zoo;
    }

    public CommandExecutable create(Command input) {

        if (input.isCreate()) {
            if (input.isLion()) {
                return new CreateLionExecutable(input.getParameters(), zoo);
            }
            if (input.isWolf()) {
                return new CreateWolfExecutable(input.getParameters(), zoo);
            }
        }
        if (input.isDelete()) {
            if (input.isLion()) {
                return new DeleteLionExecutable(zoo);
            }
            if (input.isWolf()) {
                return new DeleteWolfExecutable(zoo);
            }
        }

        if (input.isShow()) {
            if (input.isLion()) {
                return new ShowLionExecutable(zoo);
            }
            if (input.isWolf()) {
                return new ShowWolfExecutable(zoo);
            }
            if (input.isAll()) {
                return new ShowAllExecutable(zoo);
            }
        }
        return null;
    }

}
