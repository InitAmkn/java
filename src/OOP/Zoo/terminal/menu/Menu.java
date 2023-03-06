package OOP.zoo.terminal.menu;

import java.util.List;
import java.util.Scanner;

public abstract class Menu {
    Scanner iScanner = new Scanner(System.in);

    abstract List<String[]> getMenu();

    private void printMenu(List<String[]> menu) {
        for (int i = 0; i < menu.size(); i++) {
            System.out.print(menu.get(i)[0]);
            System.out.print(" ");
            System.out.println(menu.get(i)[1]);
        }
    }

    public String select() {

        printMenu(getMenu());

        String input = iScanner.nextLine();

        for (int i = 1; i < getMenu().size(); i++) {
            if (input.equals(getMenu().get(i)[0])) {
                return getMenu().get(i)[2];
            }
        }
        System.out.print("Incorrect selection of the menu item.");
        return select();

    }
}
