package OOP.zoo.terminal;

import OOP.zoo.terminal.command.Command;
import OOP.zoo.terminal.executable.CommandExecutable;
import OOP.zoo.terminal.executable.CommandExecutableFactoryImpl;
import OOP.zoo.terminal.menu.View;
import OOP.zoo.terminal.parser.CommandParser;
import OOP.zoo.zoo.Zoo;

public class TerminalReader {

    private static TerminalReader terminalReader;
    private CommandParser commandParser;
    private final Zoo zoo;
    View view = new View();
    private CommandExecutable commandExecutable;

    private TerminalReader(CommandParser commandParser, Zoo zoo) {
        this.commandParser = commandParser;
        this.zoo = zoo;
        endLess();
    }

    public static TerminalReader newTerminalReader(CommandParser commandParser, Zoo zoo) {
        if (terminalReader == null) {
            terminalReader = new TerminalReader(commandParser, zoo);
        }
        return terminalReader;
    }

    public void endLess() {

        while (true) {
            String request = view.start();
            Command command = this.commandParser.parseCommand(request);
            this.commandExecutable = new CommandExecutableFactoryImpl(zoo).create(command);
            commandExecutable.execute();
        }
    }
}
