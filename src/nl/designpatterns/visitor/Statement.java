package nl.designpatterns.visitor;

public class Statement {
	
	public void accept(Visitor v) {
		v.visit(this);
	}

}
