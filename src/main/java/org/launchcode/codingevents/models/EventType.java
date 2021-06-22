package org.launchcode.codingevents.models;

import javax.validation.constraints.Size;

public class EventType {

    private String name;

    public EventType(@Size(min = 3, message = "Name must be at least 3 characters long.") String name) {
        this.name = name;
    }

    public EventType(){ }

    private EventType type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }
}
