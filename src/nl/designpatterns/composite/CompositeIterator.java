package nl.designpatterns.composite;

import java.util.Iterator;

public class CompositeIterator implements Iterator {
	
	private Tree tree;
	
	public CompositeIterator(Tree tree) {
		this.tree = tree;
	}

	@Override
	public boolean hasNext() {
		
	}

	@Override
	public Object next() {
		Object result = this.tree;
		tree = tree.getLeft();
			
		return result;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
		
	}

}
