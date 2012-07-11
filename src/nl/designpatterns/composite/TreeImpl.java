package nl.designpatterns.composite;

import java.util.Iterator;

public class TreeImpl implements Tree {
	
	private Object object;
	
	private Tree left = new NullTreeImpl();
	private Tree right = new NullTreeImpl();
	
	public TreeImpl(Object o) {
		this.object = o;
	}
	
	public TreeImpl(){}
	
	public void traverse() {
		System.out.println(object);
		
		left.traverse();
		right.traverse();
	}

	@Override
	public void add(Object o) {
		this.object = o;
		left = new TreeImpl(o);
		right = new TreeImpl(o);
		
	}

	@Override
	public Iterator iterator() {
		return new CompositeIterator(this);
	}

	@Override
	public Object get() {
		return this.object;
	}

	@Override
	public Tree getLeft() {
		return this.left;
	}

	@Override
	public Tree getRight() {
		return this.right;
	}
	
	

}
