package OOP.zoo.terminal;

import java.util.Arrays;

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

        Menu menu = new Menu();

        while (true) {
            CommandExecutableFactory operationSelector = new CommandExecutableFactory();
            String[] request = menu.view();
            try {
                System.out.println(Arrays.toString(request));
                operationSelector.create(request);
            } catch (Exception e) {
                System.out.println("Incorrect input");
                operationSelector = null;
            }
        }
    }
}
