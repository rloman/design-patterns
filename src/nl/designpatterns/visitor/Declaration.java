package nl.designpatterns.visitor;

public class Declaration {
	
	public void accept(Visitor v) {
		v.visit(this);
	}

}
