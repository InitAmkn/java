
import java.util.ArrayList;

public class VendingMachine {
    private String name;
    protected ArrayList<Product> productList;

    public VendingMachine(String firstMachine) {
        this.name = firstMachine;
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

    // Если я пытаюсь перегрузить этот метод в классе потомка
    // то компилятор его не видит по какой-то причине
    public Drink getProduct(String name, int volume) {
        for (var product : productList) {
            if (product instanceof Drink) {
                Drink ht = (Drink) product;
                return ht;
            }
        }
        return null;

    }

    public HotDrink getProduct(String name, int volume, int temperature) {
        for (var product : productList) {
            if (product instanceof HotDrink) {
                HotDrink ht = (HotDrink) product;
                return ht;
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
