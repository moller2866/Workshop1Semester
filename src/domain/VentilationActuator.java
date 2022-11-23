public class VentilationActuator extends Actuator {
    private double value;

    public VentilationActuator(double value){
        super(value);
    }

    private double value = 0;


    @Override
    public void setValue() {
        super.setValue();
    }


    public String toString() {
        return "the value of the VentilationActuator is" + this.value;
    }
}
