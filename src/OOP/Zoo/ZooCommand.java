package OOP.zoo;

public enum ZooCommand {
    DELETE("delete"),
    ADD("add"),
    SHOW("show");

    private String name;

    ZooCommand(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
