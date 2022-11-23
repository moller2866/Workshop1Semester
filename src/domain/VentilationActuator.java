public class VentilationActuator extends Actuator {
    private double value;


    @Override
    public void setValue() {
        super.setValue();
    }


    public String toString(){
        return "the value of the VentilationActuator is" + this.value;
    }
}
