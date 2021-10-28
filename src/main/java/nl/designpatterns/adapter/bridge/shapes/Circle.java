package nl.designpatterns.adapter.bridge.shapes;

import nl.designpatterns.adapter.bridge.colours.Colour;

public class Circle extends Shape {

    public Circle(Colour colour) {
        super(colour);
    }
}
