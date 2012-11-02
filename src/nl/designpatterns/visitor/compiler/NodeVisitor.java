package nl.designpatterns.visitor.compiler;


public abstract class NodeVisitor {
	
	public abstract void visit(Program program);
	public abstract void visit(Statement statement);
	public abstract void visit(Declaration declaration);
	public abstract void visit(ComplexDeclaration complexDeclaration);

}
