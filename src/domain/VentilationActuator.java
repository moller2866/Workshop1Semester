public class VentilationActuator extends Actuator {

    public VentilationActuator(String name){
        super(name);
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
