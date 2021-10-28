package nl.designpatterns.adapter.bridge.shapes;

import nl.designpatterns.adapter.bridge.colours.Colour;

public abstract class Shape {

    private Colour colour;

    public Shape(Colour colour) {
        this.colour = colour;
    }
}
