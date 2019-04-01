package nl.designpatterns.decorator;

public class Tea extends Beverage {
	
	private final double PRICE = 1.5;

	@Override
	public double cost() {
		return PRICE;
	}

}
