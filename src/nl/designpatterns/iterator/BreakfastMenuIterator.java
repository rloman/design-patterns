package nl.designpatterns.iterator;

import java.util.Iterator;
import java.util.List;
/*
 * This iterator hides the collection from the Breakfastmenu. Changing the internals
 * in the BreakfastMenu (for instance: changing the collection from List to Array doesn't change the clients
 * which are iterating throught the collection. Only the iterator should be adjusted.
 */
public class BreakfastMenuIterator<E> implements Iterator<E> {
	
	private List<E> food;
	private int position;
	
	public BreakfastMenuIterator(List<E> food) {
		this.food = food;
		this.position = 0;
	}

	@Override
	public boolean hasNext() {
		if(position < food.size() && this.food.get(position)!=null) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public E next() {
		E item = food.get(position);
		position++;
		
		return item;
	}

	@Override
	public void remove() {
		this.food.remove(position);
	}

}
