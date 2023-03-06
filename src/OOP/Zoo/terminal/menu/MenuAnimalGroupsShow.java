package OOP.zoo.terminal.menu;

import java.util.ArrayList;
import java.util.List;

import OOP.zoo.ZooPopulation;

public class MenuAnimalGroupsShow extends MenuAnimalGroups {

    protected String[] imputThree = { "3", "All", ZooPopulation.ALL.getName() };

    @Override
    List<String[]> getMenu() {
        List<String[]> menu = new ArrayList<>();
        menu.addAll(super.getMenu());
        menu.add(imputThree);
        return menu;
    }
}
