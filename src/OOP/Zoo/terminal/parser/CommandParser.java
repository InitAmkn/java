package OOP.zoo.terminal.parser;

import OOP.zoo.terminal.command.Command;

public interface CommandParser {
    Command parseCommand(String input);
    // \\s+ регулярные выражения

}
