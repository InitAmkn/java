
public class Main {
    /*
     * Создать наследника реализованного класса HotDrink с дополнительным полем int
     * температура
     * Создать класс HotDrinkVendingMachine наследника VendingMachine и реализовать
     * перегруженный метод getProduct(String name, double volume, double
     * temperature), выдающий продукт соответствующего имени, объема и температуры.
     * Используйте при итерации конструкцию if (product instance of HotDrink){
     * HotDrink ht = (HotDrink) product; }
     * В main проинициализировать несколько экземпляров HotDrink и один
     * HotDrinkVendingMachine и воспроизвести логику заложенную в программе
     * Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
     * 
     */
    public static void main(String[] args) {
        var machine = new VendingMachine("first machine");

        Product first = new Product("орешки", 100);
        Drink second = new Drink("газировка", 150, 500);
        HotDrink third = new HotDrink("Зеленый чай", 150, 500, 50);
        HotDrink fourth = new HotDrink("Латте", 150, 500, 50);
        HotDrink fifth = new HotDrink("Зеленый чай", 100, 350, 50);

        machine.addProduct(first);
        machine.addProduct(second);
        machine.addProduct(third);
        machine.addProduct(fourth);
        machine.addProduct(fifth);

        System.out.println(machine.getProduct("орешки"));
        System.out.println(machine.getProduct("газировка", 500));
        System.out.println(machine.getProduct("Зеленый чай", 350, 50));
    }
}
