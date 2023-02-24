package OOP.zoo.animals;

public class Snake extends Animal {

    private int bodyLength;
    public static final int MAX_WEIGHT = 10;
    public static final String TYPE = "Snake";

    public Snake(String name,
            int yearBirth,
            int countLimbs,
            double weight,
            int bodyLength) {

        super(name, yearBirth, countLimbs, weight);
        this.bodyLength = bodyLength;
    }

    public int getBodyLength() {
        return bodyLength;
    }

    public void setBodyLength(int bodyLength) {
        this.bodyLength = bodyLength;
    }

    @Override
    public String getType() {
        return TYPE;
    }

    @Override
    public double getMaxWeight() {
        return MAX_WEIGHT;
    }

    @Override
    public String toString() {

        return String.format("name:%S; Age:%S; Count Limbs:%S; Weight:%S; body Length:%S",
                name,
                getAge(),
                countLimbs,
                weight,
                bodyLength);
    }
}