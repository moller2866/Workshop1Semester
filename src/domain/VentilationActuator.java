package domain;

public class VentilationActuator extends Actuator {
    private double value;


    @Override
    public void setValue() {
        super.setValue();
    }


    public String toString(){
        return "the value of the domain.VentilationActuator is" + this.value;
    }
}
