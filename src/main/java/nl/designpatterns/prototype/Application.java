package nl.designpatterns.prototype;

public class Application {

    public static void main(String[] args) throws CloneNotSupportedException {

        ConcretePrototype2 c = new ConcretePrototype2();
        c.name = "It rocks!";

        ConcretePrototype2 clone = (ConcretePrototype2) c.clone();

        System.out.println(clone.getClass().getName());

        System.out.println(clone.name);

        System.out.println(clone == c);
        System.out.println(c.getClass().equals(clone.getClass()));

        System.out.println(c.name == clone.name);

        System.out.println(c.builder == clone.builder);

    }
}
