package com.codebeaver.model;

import java.io.Serializable;

public class Bird {
    private String name;
    private String colour;
    private String family;

    public Bird(String name, String colour, String family) {
        this.name = name;
        this.colour = colour;
        this.family = family;
    }

    public String getColour() {
        return colour;
    }

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }
}
