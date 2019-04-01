package nl.designpatterns.visitor.compiler;


public class StructurePrintingVisitor extends NodeVisitor {

	@Override
	public void visit(Program program) {
		System.out.println("<Program>");
		program.declaration.accept(this);
		program.statement.accept(this);
		program.complexDeclaration.accept(this);
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
	
	@Override
	public void visit(ComplexDeclaration complexDeclaration) {
		System.out.println("\t<ComplexDeclaration>");
		System.out.println("\t</ComplexDeclaration");
	}

}
