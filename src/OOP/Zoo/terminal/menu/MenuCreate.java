package OOP.zoo.terminal.menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class MenuCreate {

    protected String name = "Name:";
    protected String yearBirth = "Year birth:";
    protected String countLimbs = "Count limbs:";
    protected String weight = "Weight:";

    List<String> getMenu() {
        List<String> menu = new ArrayList<>();
        menu.add(name);
        menu.add(yearBirth);
        menu.add(countLimbs);
        menu.add(weight);
        return menu;
    }

    Scanner iScanner = new Scanner(System.in);

    public ArrayList<String> select() {

        ArrayList<String> outString = new ArrayList<>();

        int i = 0;
        while (i < getMenu().size()) {
            System.out.print(getMenu().get(i));
            System.out.print(" ");
            String input = iScanner.nextLine();
            if (i > 0) {
                if (!input.matches("\\d+")) // input.matches("\d+") // проверка на число
                {
                    System.out.println("Incorrect input data, use numbers.");
                    continue;
                }
            }
            outString.add(input);
            i++;
        }
        return outString;
    }
}