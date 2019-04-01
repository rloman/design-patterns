package nl.designpatterns.visitor.tree;

public class ValuePrintingTreeVisitor extends TreeVisitor {

	@Override
	public void visit(Tree t) {
		t.left.accept(this);
		System.out.println(t);
		t.right.accept(this);

	}

}
