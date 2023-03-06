package OOP.zoo.terminal.executable;

import OOP.zoo.terminal.command.Command;

public interface CommandExecutableFactory {
    public CommandExecutable create(Command command);
}
