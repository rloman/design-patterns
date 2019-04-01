package nl.designpatterns.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Tree <T extends Comparable>  implements Iterable<Tree> {

	private T object;

	private Tree left;
	private Tree right;

	public Tree() {
	}

	public void traverse() {
		if (left != null)
			left.traverse();
		System.out.println(object);
		if (right != null)
			right.traverse();
	}

	public void add(T o) {
		if (this.object == null) {
			this.object = o;
			return;
		}
		if (this.object.compareTo(o) >= 0) {
			if (left == null) {
				left = new Tree();
			}

			left.add(o);

		} else {
			if (right == null) {
				right = new Tree();

			}
			right.add(o);
		}
	}

	public Iterator<Tree> iterator() {
		// trial
		List<Tree> lijst = new ArrayList<Tree>();
		lijst.add(this);
		// lijst.add(this.getLeft());
		// lijst.add(this.getRight());

		return new CompositeIterator(lijst.iterator());
	}

	public Comparable get() {
		return this.object;
	}

	public Tree getLeft() {
		return this.left;
	}

	public Tree getRight() {
		return this.right;
	}
}
