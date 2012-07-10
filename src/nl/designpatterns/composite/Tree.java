package nl.designpatterns.composite;

public interface Tree extends Iterable  {
	
	void traverse();
	void add(Object o);
	Object get();
	Tree getLeft();
	Tree getRight();

}
