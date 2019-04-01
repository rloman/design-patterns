package nl.designpatterns.visitor.compiler;

public class ComplexDeclaration extends Declaration {

	@Override
	public void accept(NodeVisitor v) {
		v.visit(this);
	}
	
}
