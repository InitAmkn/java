package OOP.zoo.terminal;

import java.util.Scanner;

public class TerminalReader {

    private static TerminalReader terminalReader;
    private CommandParser commandParser;

    TerminalReader(CommandParser commandParser) {
        this.commandParser = commandParser;
    }

    public static TerminalReader newTerminalReader(CommandParser commandParser) {
        if (terminalReader == null) {
            terminalReader = new TerminalReader(commandParser);
        }
        return terminalReader;
    }

    public void endLess() {
        Scanner iScanner = new Scanner(System.in);
        Menu menu = new Menu();
        while (true) {
            menu.printMenu(menu.selectAction);

            String input = iScanner.nextLine();
            commandParser.parseCommand(input);

            if (input.equals("stop"))
                break;
        }
        iScanner.close();
    }
}
