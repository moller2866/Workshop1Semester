package domain;

public class Actuator extends Unit {

    public Actuator(String name){
        super(name);
    }

    private double value = 0;
    public void setValue(){
        //something

    }


    public double getValue(){
        return value;
    }
}


