package nl.designpatterns.visitor.fruitbasket.visitors;

import nl.designpatterns.visitor.fruitbasket.model.Appel;
import nl.designpatterns.visitor.fruitbasket.model.Banaan;
import nl.designpatterns.visitor.fruitbasket.model.Peer;

public interface Visitor {

    void visit(Appel a);
    void visit(Peer p);
    void visit(Banaan b);

}
