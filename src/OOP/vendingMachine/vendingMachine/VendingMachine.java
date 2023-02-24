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
        for (var el : productList) {
            if (el.getName().equals(name))
                return el;
        }
        return null;
    }

    public T getProduct(String name, int volume) {
        for (var el : productList) {
            if (el instanceof T) {
                Drink ht = (Drink) el;
                if (ht.getName().equals(name) && ht.getVolume() == volume) {
                    return (T) ht;
                }
            }
        }
        return null;
    }

    public T getProduct(String name, int volume, int temperature) {
        for (T el : productList) {
            if (el instanceof T) {
                HotDrink ht = (HotDrink) el;
                if (ht.getName().equals(name) && ht.getVolume() == volume && ht.getTemperature() == temperature) {
                    return (T) ht;
                }
            }
        }
        return null;
    }

    public void printProducts() {
        for (var el : this.productList) {
            System.out.println(el);
        }
    }

}
