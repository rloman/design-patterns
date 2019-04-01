package nl.designpatterns.visitor.fruitbasket.visitors;

import nl.designpatterns.visitor.fruitbasket.model.Appel;
import nl.designpatterns.visitor.fruitbasket.model.Banaan;
import nl.designpatterns.visitor.fruitbasket.model.Peer;

public class CountingVisitor implements Visitor {

    private int appels = 0;
    private int bananen = 0;
    private int peren = 0;


    @Override
    public void visit(Appel a) {
        appels++;

    }

    @Override
    public void visit(Peer p) {
        peren++;

    }

    @Override
    public void visit(Banaan b) {
        bananen++;

    }

    @Override
    public String toString() {
        return "CountingVisitor{" +
                "appels=" + appels +
                ", bananen=" + bananen +
                ", peren=" + peren +
                '}';
    }
}
