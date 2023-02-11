package home_works.h_w_6;

public class Notebook {
    private String brand;
    private String RAM;
    private String SSD;
    private String OS;
    private String CPU;
    private String color;
    private Float priceRuble;

    public Notebook(String brand,
            String RAM,
            String SSD,
            String OS,
            String CPU,
            String color,
            Float priceRuble) {

        this.brand = brand;
        this.RAM = RAM;
        this.SSD = SSD;
        this.OS = OS;
        this.CPU = CPU;
        this.color = color;
        this.priceRuble = priceRuble;
    }

    public String getBrand() {
        return brand;
    }

    public String GetDataByIndex(String index) {
        switch (index) {
            case "1":
                return RAM;
            case "2":
                return SSD;
            case "3":
                return OS;
            case "4":
                return CPU;
            case "5":
                return color;
            case "6":
                return String.format("%f rub", priceRuble);
            default:
                return null;
        }
    }
}
