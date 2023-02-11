package OOP.seminars.seminar_1;

public class Product {
    private String name;
    private float price;

    public Product(String name,
            float price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("%s - %s", name, price);
    }

    public void consume(Product allProducts) {

        System.out.printf("% - %", allProducts.name, allProducts.price);

    }

}
