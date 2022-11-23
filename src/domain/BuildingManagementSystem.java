package domain;

import java.util.List;
import java.util.UUID;

public class BuildingManagementSystem {
    List<Building> buildings;

    public List<Building> getBuildings() {
        return buildings;
    }

    public UUID addBuilding(String name) {
        Building building = new Building(name);
        buildings.add(building);
        return building.getID();
    }

    public void removeBuilding(UUID id) {
        for (int i = 0; i < buildings.size(); i++) {
            if (buildings.get(i).getID() == id) {
                buildings.remove(i);
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
            "%s%s".formatted(s, buildingStr);
        }
        return s;
    }
}
