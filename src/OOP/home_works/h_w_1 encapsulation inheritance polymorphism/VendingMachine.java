
import java.util.ArrayList;

public class VendingMachine {
    private String name;
    protected ArrayList<Product> productList;

    public VendingMachine(String name) {
        this.name = name;
        this.productList = new ArrayList<Product>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public Product getProduct(String name) {
        for (Product el : productList) {
            if (el.getName().equals(name))
                return el;
        }
        return null;
    }

    public Product getProduct(String name, int volume) {
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

    public Product getProduct(String name, int volume, int temperature) {
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

    public void printProducts() {
        for (var el : this.productList) {
            System.out.println(el);
        }
    }

}
