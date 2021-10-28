package nl.designpatterns.adapter.bridge.shapes;

import nl.designpatterns.adapter.bridge.colours.Colour;

public class Square extends Shape {

    public Square(Colour colour) {
        super(colour);
    }
}
