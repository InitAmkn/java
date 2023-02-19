public class HotDrink extends Drink {

    private int temperature;

    public HotDrink(String name, int price, int volume) {
        super(name, price, volume);

    }

    public HotDrink(String name, int price, int volume, int temperature) {
        super(name, price, volume);
        this.temperature = temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return name + ": " + volume + "ml " + temperature + "° " + price + "rub";
    }
}
