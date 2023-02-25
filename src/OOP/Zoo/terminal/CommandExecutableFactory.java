package OOP.zoo.terminal;

import java.util.Arrays;

import OOP.zoo.animals.Animal;
import OOP.zoo.zoo.Zoo;

public class CommandExecutableFactory {

    CommandExecutable create(String[] input) {
        // CreateLionExecutable addLion = new CreateLionExecutable();

        if (Arrays.equals(input, new String[] { "1", "1" })) {
            return new CreateLionExecutable(
                    input[2],
                    Integer.parseInt(input[3]),
                    Integer.parseInt(input[4]),
                    Double.parseDouble(input[5]),
                    Integer.parseInt(input[6]));
        }
        return null;
    }
}
