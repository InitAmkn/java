package seminar_1;

public class Product {
    protected String name;
    protected int price;

    protected Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void consume() {
        System.out.println("Продукт потреблен");
    }

    public String getName() {
        return this.name;
    }

    public Integer getPrice() {
        return this.price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + ": " + price;
    }
}
