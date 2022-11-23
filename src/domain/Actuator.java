package domain;

public abstract class Actuator extends Unit {


    public Actuator(String name) {
        super(name);
    }

    private double value = 0;

    public void setValue(double value) {
      this.value = value;
    }


    public double getValue() {
        return value;
    }
}


