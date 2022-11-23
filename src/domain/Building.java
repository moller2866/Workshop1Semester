package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Building extends Unit {
    private List<Sensor> sensorList = new ArrayList<Sensor>();
    private List<Actuator> actuatorList = new ArrayList<Actuator>();

    public Building(String name) {
        super(name);
    }

    public List<Sensor> getSensors() {
        return sensorList;
    }

    public List<Actuator> getActuators() {
        return actuatorList;
    }

    public UUID addTemperatureSensor (String name) {
        TemperatureSensor newTempSensor = new TemperatureSensor(name);
        sensorList.add(newTempSensor);
        return newTempSensor.getID();
    }

    public UUID addCO2Sensor (String name) {
        CO2Sensor newCO2Sensor = new CO2Sensor(name);
        sensorList.add(newCO2Sensor);
        return newCO2Sensor.getID();
    }

    public void removeSensor(UUID id) {
        for (Sensor sensor : sensorList) {
            if (sensor.getID() == id) {
                sensorList.remove(sensor);
            }
        }
    }

    public UUID addActuator (String name) {
        Actuator newActuator = new Actuator(name);
        actuatorList.add(newActuator);
        return newActuator.getID();
    }

    public void removeActuator (UUID id) {
        for (Actuator actuator : actuatorList) {
            if (actuator.getID() == id) {
                actuatorList.remove(actuator);
            }
        }
    }
}