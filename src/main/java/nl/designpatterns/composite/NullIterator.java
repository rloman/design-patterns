package nl.designpatterns.composite;

import java.util.Iterator;
import java.util.Optional;

public class NullIterator implements Iterator {

	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public Object next() {
		return Optional.empty();
	}

	@Override
	public void remove() {
	}

}
