package domain;

import java.util.*;

public class BuildingManagementSystem implements IBuildingManagementSystem {
    List<Building> buildings = new ArrayList<>();

    public List<Building> getBuildings() {
        return buildings;
    }

    public UUID addBuilding(Building building) {
        buildings.add(building);
        return building.getID();
    }

    public void removeBuilding(UUID id) {
        for (Building b : buildings) {
            if (b.getID() == id) {
                buildings.remove(b);
                break;
            }
        }
    }

    public String getOverview() {
        String s = "";
        for (Building b : buildings) {
            String buildingStr =
                    "Building name: " + b.getName() +
                            "\nUUID: " + b.getID().toString() +
                            "\nSensors: " + b.getSensors() +
                            "\nActuators: " + b.getActuators() + "\n";
            s = s + buildingStr;
        }
        return s;
    }

    @Override
    public Map<UUID, String> getBuildingInformation() {
        Map<UUID, String> map = new HashMap<>();
        for (Building b : buildings) {
            map.put(b.getID(), b.getName());
        }
        return map;
    }

    @Override
    public Map<UUID, String> getSensorInformation(UUID buildingId) {
        Map<UUID, String> map = new HashMap<>();
        Building building = getBuilding(buildingId);
        if (building != null) {
            for (Sensor s : building.getSensors()) {
                map.put(s.getID(), s.getName());
            }
        }
        return map;
    }

    @Override
    public Map<UUID, String> getActuatorInformation(UUID buildingId) {
        Map<UUID, String> map = new HashMap<>();
        Building building = getBuilding(buildingId);
        if (building != null) {
            for (Actuator s : building.getActuators()) {
                map.put(s.getID(), s.getName());
            }
        }
        return map;
    }

    private Building getBuilding(UUID buildingId) {
        Building building = null;
        for (Building b : buildings) {
            if (b.getID() == buildingId) building = b;
        }
        return building;
    }

    @Override
    public UUID addTemperatureSensor(UUID buildingId, String name) {
        Building building = getBuilding(buildingId);
        return building.addTemperatureSensor(name);
    }

    @Override
    public UUID addCo2Sensor(UUID buildingId, String name) {
        Building building = getBuilding(buildingId);
        return building.addCO2Sensor(name);
    }

    @Override
    public void removeSensor(UUID buildingId, UUID sensorId) {
        Building building = getBuilding(buildingId);
         building.removeSensor(sensorId);
    }

    @Override
    public UUID addVentilationActuator(UUID buildingId, String name) {
        Building building = getBuilding(buildingId);
        return building.addVentilationActuator(name);
    }

    @Override
    public void removeActuator(UUID buildingId, UUID actuatorId) {
        Building building = getBuilding(buildingId);
         building.removeActuator(actuatorId);
    }
}
