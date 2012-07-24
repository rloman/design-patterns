package nl.designpatterns.visitor;

public class StructurePrintingVisitor extends Visitor {

	@Override
	public void visit(Program program) {
		System.out.println("<Program>");
		program.declaration.accept(this);
		program.statement.accept(this);
		System.out.println("</Program>");
		
	}

	@Override
	public void visit(Statement statement) {
		System.out.println("\t<Statement>");
		System.out.println("\t</Statement>");
		
	}

	@Override
	public void visit(Declaration declaration) {
		System.out.println("\t<Declaration>");
		System.out.println("\t</Declaration");
		
	}

}
