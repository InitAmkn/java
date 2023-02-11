package OOP.seminars.seminar_1;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Product banana = new Product("Банан", 5f);
        Product beetroot = new Product("Cвекла", 5f);
        Product mushroom = new Product("Гриб", 5f);
        LinkedList<Product> products = new LinkedList<>(Arrays.asList(banana, beetroot, mushroom));
        VendingMachine findProduct = new VendingMachine();

        findProduct.setProducts(products);
        System.out.println(findProduct.getProductByName("Cвекла").toString());
    }

}
