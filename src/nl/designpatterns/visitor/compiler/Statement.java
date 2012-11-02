package nl.designpatterns.visitor.compiler;


public class Statement extends Node {
	
	public void accept(NodeVisitor v) {
		v.visit(this);
	}

}
