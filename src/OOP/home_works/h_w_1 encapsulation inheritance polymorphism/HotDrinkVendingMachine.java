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

    public HotDrink getProduct(String name, int volume, int temperature) {
        for (var el : productList) {
            if (el instanceof HotDrink) {
                HotDrink ht = (HotDrink) el;
                if (ht.getName().equals(name) && ht.getVolume() == volume && ht.getTemperature() == temperature) {
                    return ht;
                }
            }
        }
        return null;

    }
}
