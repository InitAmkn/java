package OOP.zoo.terminal.menu;

import java.util.ArrayList;
import java.util.List;

import OOP.zoo.ZooCommand;

public class MenuActions extends Menu {
    protected String[] introductoryPhrase = { "", "Select an action:" };
    protected String[] imputOne = { "1", "Add an animal", ZooCommand.ADD.getName() };
    protected String[] imputTwo = { "2", "Delete an animal", ZooCommand.DELETE.getName() };
    protected String[] imputThree = { "3", "Show all animals", ZooCommand.SHOW.getName() };

    @Override
    List<String[]> getMenu() {
        List<String[]> menu = new ArrayList<>();
        menu.add(introductoryPhrase);
        menu.add(imputOne);
        menu.add(imputTwo);
        menu.add(imputThree);
        return menu;
    }
}
