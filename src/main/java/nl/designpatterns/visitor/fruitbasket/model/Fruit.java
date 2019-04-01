package nl.designpatterns.visitor.fruitbasket.model;

import nl.designpatterns.visitor.fruitbasket.visitors.Visitor;

public abstract class Fruit {

    public abstract void accept(Visitor visitor);

}
