package OOP.zoo.terminal.parser;

import java.util.ArrayList;
import java.util.List;

import OOP.zoo.terminal.command.Command;

public class CommandParserImpl implements CommandParser {

    @Override
    public Command parseCommand(String input) {
        String[] dataInput = input.split("\s+");
        String action = dataInput[0];
        String animal = dataInput[1];
        List<String> parameters = new ArrayList<>();
        for (int i = 2; i < dataInput.length; i++) {
            parameters.add(dataInput[i]);
        }
        System.out.println(parameters.toString());
        return new Command(action, animal, parameters);

    }

}
