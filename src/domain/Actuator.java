package domain;

public class Actuator extends Unit {
    private double value;

    public Actuator(double value){
        this.value = value;
    }

    public void setValue(){

    }


    public double getValue(){
        return value;
    }
}


