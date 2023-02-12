import java.util.ArrayList;

public class DrinkVendingMachine extends VendingMachine {
    protected ArrayList<Drink> drinkList;

    public DrinkVendingMachine(String firstMachine) {
        super(firstMachine);
        drinkList = new ArrayList<Drink>();
    }

    public void addDrink(Drink dr) {
        drinkList.add(dr);
    }

}
