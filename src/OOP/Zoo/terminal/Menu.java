package OOP.zoo.terminal;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private String[][] selectAction = {
            { "", "Select an action:" },
            { "1.", "Add an animal" },
            { "2.", "Delete an animal" },
    };

    private String[][] animalGroups = {
            { "", "Select animal group:" },
            { "1.", "Lions" }
    };
    private String[][] enterDataAboutLion = {
            { "", "Enter the data about the animal:" },
            { "1.", "Name:" },
            { "2.", "Year birth:" },
            { "3.", "Count limbs:" },
            { "4.", "Weight:" },
            { "5.", "Mane volume:" }
    };

    Scanner iScanner = new Scanner(System.in);

    private String printMenu(String[][] menu) {
        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i][0]);
            System.out.print(" ");
            System.out.println(menu[i][1]);
        }
        String result = iScanner.nextLine();
        return result;
    }

    private ArrayList<String> inputData(String[][] menu) {
        ArrayList<String> outString = new ArrayList<>();

        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i][0]);
            System.out.print(" ");
            System.out.print(menu[i][1]);
            System.out.print(" ");

            if (i != 0) {
                outString.add(iScanner.nextLine());
            } else {
                System.out.println();
            }
        }
        return outString;
    }

    private void incorrectInput() {
        System.out.println("Incorrect selection of the menu item.");
        view();
    }

    public String[] view() {

        ArrayList<String> result = new ArrayList<>();
        switch (printMenu(selectAction)) {
            case "1":
                result.add("add");
                switch (printMenu(animalGroups)) {
                    case "1":
                        result.add("lion");
                        result.addAll(inputData(enterDataAboutLion));
                        break;
                    default:
                        incorrectInput();
                        break;
                }
                break;

            case "2":
                result.add("delete");
                switch (printMenu(animalGroups)) {
                    case "1":
                        result.add("lion");
                        // System.err.println("You have deleted the animal");
                        break;
                    default:
                        incorrectInput();
                        break;
                }
                break;
            default:
                incorrectInput();
                break;
        }

        return result.toArray(new String[result.size()]);
    }

}
