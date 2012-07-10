package nl.designpatterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BreakfastMenu {
	private List<String> food;
	private String[] foodAlt;
	
	public BreakfastMenu() {
		food = new ArrayList<String>();
	}
	
	public void addFood(String food) {
		this.food.add(food);
	}
	
	public BreakfastMenuIterator getIterator() {
		return new BreakfastMenuIterator(food);
	}

	public Iterator<String> iteratorAlt() {
		Arrays.
	}
	
}
