package OOP.zoo.terminal;

import java.util.Scanner;

public class Menu {
    String[][] selectAction = {
            { "", "Select an action:" },
            { "1", "Add an animal" },
            { "2", "Delete an animal" },
    };

    String[][] animalGroups = {
            { "", "Select animal group:" },
            { "1", "Lions" }
    };
    String[][] enterDataAboutLion = {
            { "", "Enter the data about the animal:" },
            { "1", "Name:" },
            { "2", "Year birth:" },
            { "3", "Count limbs:" },
            { "4", "Weight:" },
            { "5", "Mane volume:" }
    };
    String[][] animalTakeOf = {
            { "", "You have deleted the animal" }
    };
    Scanner iScanner = new Scanner(System.in);

    public String printMenu(String[][] menu) {
        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i][0]);
            System.out.print(" ");
            System.out.println(menu[i][1]);
        }
        return iScanner.nextLine();
    }

    public String printMenuWithInputData(String[][] menu) {
        StringBuilder outString = new StringBuilder();

        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i][0]);
            System.out.print(" ");
            System.out.println(menu[i][1]);
            System.out.print(" ");
            outString.append(iScanner.nextLine());
        }

        return outString.toString();
    }
}
