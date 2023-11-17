package nl.designpatterns.bridge.shapes;

import nl.designpatterns.bridge.colours.Colour;

public class Circle extends Shape {

    public Circle(Colour colour) {
        super(colour);
    }
}
