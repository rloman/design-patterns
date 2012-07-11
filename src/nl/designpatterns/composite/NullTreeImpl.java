package nl.designpatterns.composite;

import java.util.Iterator;

public class NullTreeImpl implements Tree {
	
	@Override
	public void traverse() {
	}

	@Override
	public void add(Object o) {
		return;
	}

	@Override
	public Iterator iterator() {
		return null;
	}

	@Override
	public Object get() {
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
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
