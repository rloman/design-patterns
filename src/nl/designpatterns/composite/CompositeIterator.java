package nl.designpatterns.composite;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {

	private Stack<Iterator<Tree>> stack = new Stack<Iterator<Tree>>();

	public CompositeIterator(Iterator<Tree> iterator) {
		stack.push(iterator);
		/*System.out.println("Tree bevat " + tree.get());
		System.out.println("Left:" + tree.getLeft());
		System.out.println("Right:" + tree.getRight());
		*/
	}

	@Override
	public boolean hasNext() {
		if(stack.isEmpty()) {
			return false;
		}
		else {
			Iterator<Tree> iterator = stack.peek();
			if(!iterator.hasNext()) {
				stack.pop();
				return hasNext();
			}
			else {
				return true;
			}
		}
	}

	@Override
	public Object next() {
		if (hasNext()) {
			Iterator<Tree> iterator = stack.peek();
			Tree tree =  iterator.next();
			if(tree instanceof TreeImpl) {
				stack.push(tree.getLeft().iterator());
				stack.push(tree.getRight().iterator());
			}
			return tree;
		}
		else {
			return null;
		}
		
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();

	}

	public Stack getStack() {
		return stack;
	}

}
