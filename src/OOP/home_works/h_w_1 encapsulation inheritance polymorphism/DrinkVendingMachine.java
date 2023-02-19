
public class DrinkVendingMachine extends VendingMachine {

    public DrinkVendingMachine(String name) {
        super(name);
    }

    public void addDrink(Drink dr) {
        productList.add(dr);
    }

}
