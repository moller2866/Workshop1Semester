package domain;

import java.util.UUID;

public class Unit {
    private String name;
    private UUID id;

    public String getName() {
        return name;
    }

    public Unit(String name) {
        this.name = name;
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public String toString() {
        String output = "id: " + id + ", Name: " + name;
        return output;
    }
}