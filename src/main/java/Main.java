import domain.Actuator;
import domain.Building;
import domain.BuildingManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        BuildingManagementSystem system = new BuildingManagementSystem();
        Building bar1 = new Building("bar");
        Building bar2 = new Building("bar");
        Building bar3 = new Building("bar");
        system.addBuilding(bar1);
        system.addBuilding(bar2);
        system.addBuilding(bar3);

        bar1.addTemperatureSensor("room1");
        bar1.addCO2Sensor("room2");

        UUID ventid = bar2.addVentilationActuator("room1");
        bar2.addCO2Sensor("room2");

        UUID tempid = bar3.addTemperatureSensor("room1");
        bar3.addVentilationActuator("room2");

        system.removeBuilding(bar1.getID());

        System.out.println(system.getOverview());

        bar2.removeActuator(ventid);
        bar3.removeSensor(tempid);

        System.out.println("#####");
        System.out.println(bar2.getSensors());
        System.out.println(bar3.getActuators());
        System.out.println("#####");

        System.out.println(system.getOverview());

    }
}