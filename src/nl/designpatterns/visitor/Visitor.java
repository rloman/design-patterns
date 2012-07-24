package nl.designpatterns.visitor;

public abstract class Visitor {
	
	public abstract void visit(Program program);
	public abstract void visit(Statement statement);
	public abstract void visit(Declaration declaration);

}
