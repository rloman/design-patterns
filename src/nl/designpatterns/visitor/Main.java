package nl.designpatterns.visitor;

public class Main {

	public static void main(String[] args) {
		
		Program p = new Program();
		Visitor v = new StructurePrintingVisitor();
		p.accept(v);

	}

}
