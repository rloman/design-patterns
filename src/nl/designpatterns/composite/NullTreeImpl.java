package nl.designpatterns.composite;

import java.util.Iterator;

public class NullTreeImpl implements Tree {
	
	@Override
	public void traverse() {
	}

	@Override
	public void add(Comparable o) {
		return;
	}

	@Override
	public Iterator iterator() {
		return new NullIterator();
	}

	@Override
	public Comparable get() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tree getLeft() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tree getRight() {
		return null;
	}
	

}
