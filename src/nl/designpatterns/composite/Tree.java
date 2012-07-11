package nl.designpatterns.composite;

public interface Tree extends Iterable  {
	
	void traverse();
	void add(Comparable o);
	Comparable get();
	Tree getLeft();
	Tree getRight();

}
