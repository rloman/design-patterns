package nl.designpatterns.visitor.tree;

public class Application {

	public static void main(String[] args) {
		
		Tree t = new Tree();
		t.put(1);
		t.put(3);
		t.put(444);
		t.put(2);
		
		TreeVisitor visitor = new ValuePrintingTreeVisitor();
		t.accept(visitor);
		
		SummarizingTreeVisitor visitor2 = new SummarizingTreeVisitor();
		t.accept(visitor2);
		
		System.out.println(visitor2.getValue());
		

	}

}
