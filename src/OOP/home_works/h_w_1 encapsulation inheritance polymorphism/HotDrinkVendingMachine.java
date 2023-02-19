
public class HotDrinkVendingMachine extends DrinkVendingMachine {
    public HotDrinkVendingMachine(String name) {
        super(name);

    }

    public void addHotDrink(HotDrink hdr) {
        productList.add(hdr);
    }

}
