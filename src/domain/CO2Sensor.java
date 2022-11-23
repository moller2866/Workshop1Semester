package domain;

public class CO2Sensor extends Sensor{

    public CO2Sensor(String name) {
        super(name);
    }

    private double value = 0;

    @Override
    public double getValue() {
        return value;
    }
    @Override
    public String toString() {
        return "\nUUID: " + getID() + " Name: " + getName() + " Value: " + getValue();
    }
}
