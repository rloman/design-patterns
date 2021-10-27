package nl.designpatterns.prototype;

public abstract class Prototype implements Cloneable {

    public String name;
    public StringBuilder builder = new StringBuilder();


    // shallow
    @Override
    public Prototype clone() throws CloneNotSupportedException{

        // clone the object
        Prototype prototype = (Prototype) super.clone();

        // manually perform a deep copy of the builder.
        prototype.builder = new StringBuilder(builder.toString());

        return prototype;
    }
}

class ConcretePrototype1 extends Prototype {
    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return (ConcretePrototype1)super.clone();
    }
}

class ConcretePrototype2 extends Prototype {
    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return (ConcretePrototype2)super.clone();
    }
}