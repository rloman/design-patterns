package nl.designpatterns.visitor.compiler;


public class Declaration extends Node {
	
	public void accept(NodeVisitor v) {
		v.visit(this);
	}

}
