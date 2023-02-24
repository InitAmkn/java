package vendingMachine;

import java.util.ArrayList;

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

    public void printProducts() {
        for (T el : this.productList) {
            System.out.println(el);
        }
    }

}
