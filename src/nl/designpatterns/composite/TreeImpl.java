package nl.designpatterns.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TreeImpl implements Tree {
	
	private Comparable object;
	
	private Tree left;
	private Tree right;
	
	public TreeImpl(Comparable o) {
		this.object = o;
		left = new NullTreeImpl();
		right = new NullTreeImpl();
	}
	
	public void traverse() {
		System.out.println(object);
		
		left.traverse();
		right.traverse();
	}

	@Override
	public void add(Comparable o) {
		//this.object = o;
		if(this.object.compareTo(o) < 0) {
			left = new TreeImpl(o);
		}
		else {
			right = new TreeImpl(o);
		}
	}

	@Override
	public Iterator iterator() {
		//trial
		List <Tree> lijst = new ArrayList<Tree>();
		lijst.add(this);
		//lijst.add(this.getLeft());
		//lijst.add(this.getRight());
		
		return new CompositeIterator(lijst.iterator());
	}

	@Override
	public Comparable get() {
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
