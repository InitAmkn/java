package OOP.seminars.seminar_1;

import java.util.LinkedList;

public class VendingMachine {
    private LinkedList<Product> products;

    public void setProducts(LinkedList<Product> products) {
        this.products = products;
    }

    public Product getProductByName(String name) {

        for (Product product : products) {
            if (name.equals(product.getName()))
                return product;
        }
        return null;
    }
}
