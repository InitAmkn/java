package OOP.zoo.terminal.menu;

import java.util.ArrayList;

import OOP.zoo.ZooCommand;
import OOP.zoo.ZooPopulation;

public class View {
    Menu action = new MenuActions();
    Menu animalGroups = new MenuAnimalGroups();
    Menu animalGroupsShow = new MenuAnimalGroupsShow();
    MenuCreate menuCreateLion = new MenuCreateLion();
    MenuCreate menuCreateWolf = new MenuCreateWolf();

    public String start() {
        ArrayList<String> result = new ArrayList<>();
        result.add(action.select());

        if (result.get(0).equals(ZooCommand.ADD.getName())) {
            result.add(animalGroups.select());
            if (result.get(1).equals(ZooPopulation.LION.getName())) {
                result.addAll(menuCreateLion.select());
            }
            if (result.get(1).equals(ZooPopulation.WOLF.getName())) {
                result.addAll(menuCreateWolf.select());
            }
        } else if (result.get(0).equals(ZooCommand.SHOW.getName())) {
            result.add(animalGroupsShow.select());
        }

        System.out.println(String.join("\s", result));
        return String.join("\s", result);

    }
}
