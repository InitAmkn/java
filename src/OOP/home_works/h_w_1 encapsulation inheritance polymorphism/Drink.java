
public class Drink extends Product {
    protected int volume;

    Drink(String name, int price) {
        super(name, price);
    }

    Drink(String name, int price, int volume) {
        super(name, price);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void consume() {
        System.out.println("Напиток выпит");
    }

    @Override
    public String toString() {

        // return String.format("% - % мл. % град. - % руб.", name, volume, temperature,
        // price);
        return name + ": " + volume + "ml " + price + "rub";
    }
}
