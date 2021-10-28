package nl.designpatterns.adapter.bridge.colours;


import java.awt.*;

public abstract class Colour {

    private Color color;

    public Colour() {
        this.color = java.awt.Color.WHITE;
    }

    public Colour(Color color) {
        this.color = color;
    }

    public java.awt.Color getColor() {
        return color;
    }

    public void setColor(java.awt.Color color) {
        this.color = color;
    }
}
