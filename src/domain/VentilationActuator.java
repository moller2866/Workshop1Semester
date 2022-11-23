package domain;

public class VentilationActuator extends Actuator {

    public VentilationActuator(String name) {
        super(name);
    }

    private double value = 0;


    @Override
    public void setValue(double value) {

        super.setValue(value);
    }


    public String toString() {
        return "\nUUID: " + getID() + " Name: " + getName() + " Value: " + getValue();
    }

}
