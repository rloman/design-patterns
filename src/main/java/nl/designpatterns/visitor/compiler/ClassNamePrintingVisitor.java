package nl.designpatterns.visitor.compiler;

public class ClassNamePrintingVisitor extends NodeVisitor {

	@Override
	public void visit(Program program) {

		this.printNode(program);
		program.declaration.accept(this);
		program.statement.accept(this);
		program.complexDeclaration.accept(this);

	}

	@Override
	public void visit(Statement statement) {
		printNode(statement);

	}

	@Override
	public void visit(Declaration declaration) {
		printNode(declaration);
	}
	
	@Override
	public void visit(ComplexDeclaration complexDeclaration) {
		printNode(complexDeclaration);
	}

	private void printNode(Node node) {
		System.out.println("Class:" + node.getClass().getCanonicalName());
	}

}
