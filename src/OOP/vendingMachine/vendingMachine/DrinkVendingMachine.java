package vendingMachine;

import product.Drink;
import product.Product;

public class DrinkVendingMachine<T extends Product> extends VendingMachine<Drink> {

    public DrinkVendingMachine(String name) {
        super(name);
    }

    public Drink getProduct(String name, int volume) {
        for (Drink el : productList) {
            if (el.getName().equals(name) && el.getVolume() == volume) {
                return el;
            }
        }
        return null;
    }
}
