package nl.designpatterns.composite;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {
	
	private Stack <Tree> stack = new Stack<Tree>();
	
	public CompositeIterator(Tree tree) {
		stack.push(tree);
		System.out.println("Tree bevat "+tree.get());
		System.out.println("Left:"+tree.getLeft());
		System.out.println("Right:"+tree.getRight());
	}

	@Override
	public boolean hasNext() {
		return !stack.isEmpty();
	}

	@Override
	public Object next() {
		Tree result = stack.pop();
		if(!(result.getLeft() instanceof NullTreeImpl) && result.getLeft()!=null) stack.push(result.getLeft());
		if(!(result.getRight() instanceof NullTreeImpl) && result.getRight() != null) stack.push(result.getRight());
		
		return result;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
		
	}
	
	public Stack getStack() {
		return stack;
	}

}
