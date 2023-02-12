import java.util.ArrayList;

public class HotDrinkVendingMachine extends DrinkVendingMachine {
    private ArrayList<HotDrink> hotDrinkList;

    public HotDrinkVendingMachine(String firstMachine) {
        super(firstMachine);
        hotDrinkList = new ArrayList<HotDrink>();
    }

    public void addHotDrink(HotDrink hdr) {
        hotDrinkList.add(hdr);
    }

}
