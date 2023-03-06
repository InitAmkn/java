package OOP.zoo;

import OOP.zoo.terminal.TerminalReader;
import OOP.zoo.terminal.parser.CommandParser;
import OOP.zoo.terminal.parser.CommandParserImpl;
import OOP.zoo.zoo.Zoo;

public class Main {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        CommandParser parserZoo = new CommandParserImpl();
        TerminalReader.newTerminalReader(parserZoo, zoo);
    }

}
