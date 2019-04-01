package nl.designpatterns.visitor.fruitbasket.visitors;

import nl.designpatterns.visitor.fruitbasket.model.Appel;
import nl.designpatterns.visitor.fruitbasket.model.Banaan;
import nl.designpatterns.visitor.fruitbasket.model.Peer;

public class XMLPrintingVisitor implements Visitor {

    @Override
    public void visit(Appel a) {
        System.out.println("<appel>");
        System.out.println("</appel>");

    }

    @Override
    public void visit(Peer p) {
        System.out.println("<peer>");
        System.out.println("</peer>");
    }

    @Override
    public void visit(Banaan b) {
        System.out.println("<banaan>");
        System.out.println("</banaan>");
    }
}
