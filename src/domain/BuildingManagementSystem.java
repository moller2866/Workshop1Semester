package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BuildingManagementSystem {
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
}
