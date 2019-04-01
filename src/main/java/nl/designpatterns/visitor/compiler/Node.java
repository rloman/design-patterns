package nl.designpatterns.visitor.compiler;


public abstract class Node {
	
	public abstract void accept(NodeVisitor nodeVisitor);

}
