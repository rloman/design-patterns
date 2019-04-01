package nl.designpatterns.facade.enumeration;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorAdapter<E> implements Enumeration<E> {
	
	private Iterator<E> iterator;

	@Override
	public boolean hasMoreElements() {
		return iterator.hasNext();
	}

	@Override
	public E nextElement() {
		return iterator.next();
	}
	
	public IteratorAdapter(Iterator<E> iterator) {
		this.iterator = iterator;
	}
	
	

}
