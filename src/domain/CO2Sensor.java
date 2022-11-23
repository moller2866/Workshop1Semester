package domain;

public class CO2Sensor extends Sensor{

    private double value = 0;

    @Override
    public double getValue() {
        return value;
    }
    @Override
    public String toString() {
        return "UUID" + getID() + "Name " + getName() + "Value " + getValue();
    }
}
