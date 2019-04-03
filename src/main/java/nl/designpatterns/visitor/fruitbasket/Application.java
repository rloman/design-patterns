package nl.designpatterns.visitor.fruitbasket;

import nl.designpatterns.visitor.fruitbasket.model.*;
import nl.designpatterns.visitor.fruitbasket.visitors.CountingVisitor;
import nl.designpatterns.visitor.fruitbasket.visitors.Visitor;
import nl.designpatterns.visitor.fruitbasket.visitors.XMLPrintingVisitor;

public class Application {

    public static void main(String[] args) {
        FruitBasket mand = new FruitBasket();

        Fruit appel = new Appel();
        Fruit peer = new Peer();
        Fruit banaan = new Banaan();

        mand.add(appel);
        mand.add(peer);
        mand.add(banaan);

        Visitor v = new CountingVisitor();

		mand.accept(v);

       System.out.println(v);

        v = new XMLPrintingVisitor();
        mand.accept(v);

		// alternate using Iterable interface
		for(Fruit f : mand) {
            f.accept(v);
        }

        mand.stream().forEach(System.out::println);

    }
}
