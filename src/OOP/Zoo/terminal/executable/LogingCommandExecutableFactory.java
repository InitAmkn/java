package OOP.zoo.terminal.executable;

import OOP.zoo.terminal.command.Command;
import OOP.zoo.zoo.Zoo;

public class LogingCommandExecutableFactory extends CommandExecutableFactoryImpl {
    LogingCommandExecutableFactory(Zoo zoo) {
        super(zoo);
    }

    @Override
    public CommandExecutable create(Command input) {
        System.out.println(input);
        CommandExecutable result = super.create(input);
        System.out.println(input);
        return result;

    }
}