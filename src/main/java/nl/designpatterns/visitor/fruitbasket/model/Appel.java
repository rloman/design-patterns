package nl.designpatterns.visitor.fruitbasket.model;

import nl.designpatterns.visitor.fruitbasket.visitors.Visitor;

public class Appel extends Fruit {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
