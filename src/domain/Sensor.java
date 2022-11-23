package domain;

public class Sensor extends Unit {

    public Sensor(String name) {
        super(name);
    }

    private double value = 0;

    public double getValue() {
        return value;
    }
}
