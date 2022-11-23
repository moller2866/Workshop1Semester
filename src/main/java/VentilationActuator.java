public class VentilationActuator extends Actuator {
    private double value;


    @Override
    public void setValue() {
        super.setValue();
    }


    public String toString(){
        return "Your ID is" + this.getId() + "Your name is" +this.getName() + "the value is" +value;
    }
}
