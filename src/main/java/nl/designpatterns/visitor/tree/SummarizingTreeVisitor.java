package nl.designpatterns.visitor.tree;

public class SummarizingTreeVisitor extends TreeVisitor {
	
	private int sum = 0;

	@Override
	public void visit(Tree t) {
		
		sum += t.value;
		
		t.left.accept(this);
		t.right.accept(this);
	
	}
	
	public int getValue(){
		return this.sum;
	}
}
