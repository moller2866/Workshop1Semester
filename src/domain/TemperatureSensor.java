package domain;

public class TemperatureSensor extends Sensor{

    public TemperatureSensor(String name) {
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
