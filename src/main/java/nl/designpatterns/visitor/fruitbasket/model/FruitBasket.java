package nl.designpatterns.visitor.fruitbasket.model;

import nl.designpatterns.visitor.fruitbasket.visitors.Visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class FruitBasket extends Fruit implements Iterable<Fruit> {

    private List<Fruit> content = new ArrayList<>();

    public void add(Fruit f) {
            this.content.add(f);
    }


    @Override
    public void accept(Visitor visitor) {
        System.out.println("<fruit>");
        for(Fruit f: this.content) {
           f.accept(visitor);
        }
        System.out.println("</fruit>");
    }

    @Override
    public Iterator<Fruit> iterator() {
        return this.content.iterator();
    }

    public Stream<Fruit> stream() {

        return this.content.stream();
    }
}
