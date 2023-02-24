
import product.Drink;
import product.HotDrink;
import product.Product;
import vendingMachine.DrinkVendingMachine;
import vendingMachine.HotDrinkVendingMashine;
import vendingMachine.VendingMachine;

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
    public static <T> void main(String[] args) {
        VendingMachine<Product> machineOne = new VendingMachine<>("Product machine 1");
        DrinkVendingMachine<Drink> machineTwo = new DrinkVendingMachine<>("Drink machine 1");
        HotDrinkVendingMashine<HotDrink> machinethree = new HotDrinkVendingMashine<>("Hot Drink machine 1");
        Product first = new Product("орешки", 100);
        Drink second = new Drink("газировка", 150, 500);
        HotDrink third = new HotDrink("Зеленый чай", 150, 500, 500);
        HotDrink fourth = new HotDrink("Латте", 150, 500, 50);
        HotDrink fifth = new HotDrink("Зеленый чай", 100, 500, 50);

        machineOne.add(first);
        machineTwo.add(second);
        machinethree.add(third);
        machinethree.add(fourth);
        machinethree.add(fifth);

        System.out.println(machineOne.getProduct("орешки"));
        System.out.println(machineTwo.getProduct("газировка"));
        System.out.println(machinethree.getProduct("Зеленый чай", 500, 50));

    }
}
