package nl.designpatterns.visitor.compiler;


public class Application {

	public static void main(String[] args) {
		
		Node p = new Program();
		NodeVisitor v = new StructurePrintingVisitor();
		p.accept(v);
		
		

	}

}
