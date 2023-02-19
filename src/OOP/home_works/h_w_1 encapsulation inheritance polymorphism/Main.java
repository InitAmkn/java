
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
        VendingMachine machineOne = new VendingMachine("first machine");
        HotDrinkVendingMachine machineTwo = new HotDrinkVendingMachine("second machine");
        Product first = new Product("орешки", 100);
        Product second = new Drink("газировка", 150, 500);
        Product third = new HotDrink("Зеленый чай", 150, 500, 500);
        Product fourth = new HotDrink("Латте", 150, 500, 50);
        Product fifth = new HotDrink("Зеленый чай", 100, 500, 50);

        machineOne.addProduct(first);
        machineOne.addProduct(second);
        machineOne.addProduct(third);
        machineOne.addProduct(fourth);
        machineTwo.addProduct(fifth);

        System.out.println(machineOne.getProduct("орешки"));
        System.out.println(machineOne.getProduct("газировка", 500));
        System.out.println(machineTwo.getProduct("Зеленый чай", 500, 50));

        // непоняятно как сделать так чтобы для класса VendingMachine
        // тоже работала перегрузка getProduct
    }
}
