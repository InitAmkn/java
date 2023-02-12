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

    public Drink getProduct(String name, int volume) {
        for (var el : productList) {
            if (el instanceof Drink) {
                Drink ht = (Drink) el;
                if (ht.getName().equals(name) && ht.getVolume() == volume) {
                    return ht;
                }
            }
        }
        return null;

    }
}
