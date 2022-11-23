package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Building extends Unit {
    private List<Sensor> sensorList = new ArrayList<Sensor>();
    private List<Actuator> actuatorList = new ArrayList<Actuator>();

    public List<Sensor> getSensors() {
        return sensorList;
    }

    public List<Actuator> getActuators() {
        return actuatorList;
    }

    public UUID addTemperatureSensor (String name) {
        return null;
    }

    public UUID addCo2Sensor (String name) {
        return null;
    }

    public void removeSensor (UUID id) {
        // something
    }

    public UUID addActuator (String name) {
        return null;
    }

    public void removeActuator (UUID id) {
        // something
    }
}