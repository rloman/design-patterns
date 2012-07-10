package nl.designpatterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class BreakfastMenu<E> implements Menu<E> {
	private List<E> food;
//	private String[] foodAlt;
	
	public BreakfastMenu() {
		food = new ArrayList<E>();
	}
	
	public void addFood(E food) {
		this.food.add(food);
	}
	
	public BreakfastMenuIterator<E> getIterator() {
		return new BreakfastMenuIterator<E>(food);
	}
	
}
