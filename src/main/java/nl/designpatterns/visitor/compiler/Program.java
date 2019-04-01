package nl.designpatterns.visitor.compiler;


public class Program extends Node {
	
	Node declaration = new Declaration();
	Node statement = new Statement();
	Node complexDeclaration = new ComplexDeclaration();
	
	public void accept(NodeVisitor v) {
		v.visit(this);
		//declaration.accept(v); // kan niet vanwege recursion
		//statement.accept(v);
		
	}

}
