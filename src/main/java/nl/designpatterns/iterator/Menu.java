package nl.designpatterns.iterator;

import java.util.Iterator;

public interface Menu<E> {
	
	public Iterator<E> getIterator();

}
