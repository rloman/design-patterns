package nl.designpatterns.bridge.shapes;

import nl.designpatterns.bridge.colours.Colour;

public abstract class Shape {

    private Colour colour;

    public Shape(Colour colour) {
        this.colour = colour;
    }
}
