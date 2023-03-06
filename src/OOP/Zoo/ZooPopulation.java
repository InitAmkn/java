package OOP.zoo;

public enum ZooPopulation {
    LION("lion"),
    WOLF("wolf"),
    SNAKE("snake"),
    ALL("all");

    private String name;

    ZooPopulation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
