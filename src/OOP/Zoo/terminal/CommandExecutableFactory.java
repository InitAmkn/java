package OOP.zoo.terminal;

import OOP.zoo.zoo.Zoo;

public class CommandExecutableFactory {

    private Zoo zoo = new Zoo();

    CommandExecutable create(String[] input) {

        if (input[0].equals("add")) {
            if (input[1].equals("lion")) {

                CreateLionExecutable addLion = new CreateLionExecutable(input[2],
                        Integer.parseInt(input[3]),
                        Integer.parseInt(input[4]),
                        Double.parseDouble(input[5]),
                        Integer.parseInt(input[6]),
                        zoo);
                addLion.execute();
                zoo.showAllLions();
                return addLion;
            }
        }
        if (input[0].equals("delete")) {
            if (input[1].equals("lion")) {
                DeleteLionExecutable deleteLion = new DeleteLionExecutable(zoo);
                deleteLion.execute();
                zoo.showAllLions();
            }
        }
        return null;
    }

}
