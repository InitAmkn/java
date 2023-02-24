package vendingMachine;

import java.util.ArrayList;

import product.Drink;
import product.HotDrink;
import product.Product;

public class VendingMachine<T extends Product> {
    private String name;
    protected ArrayList<T> productList;

    public VendingMachine(String name) {
        this.name = name;
        this.productList = new ArrayList<T>();
    }

    public void add(T newPosition) {
        productList.add(newPosition);
    }

    public T getProduct(String name) {
        for (T el : productList) {
            if (el.getName().equals(name))
                return el;
        }
        return null;
    }

    public Drink getProduct(String name, int volume) {
        for (T el : productList) {
            if (el instanceof Drink) {
                Drink ht = (Drink) el;
                if (ht.getName().equals(name) && ht.getVolume() == volume) {
                    return ht;
                }
            }
        }
        return null;
    }

    public HotDrink getProduct(String name, int volume, int temperature) {
        for (T el : productList) {
            if (el instanceof HotDrink) {
                HotDrink ht = (HotDrink) el;
                if (ht.getName().equals(name) && ht.getVolume() == volume && ht.getTemperature() == temperature) {
                    return ht;
                }
            }
        }
        return null;
    }

    public void printProducts() {
        for (T el : this.productList) {
            System.out.println(el);
        }
    }

}
