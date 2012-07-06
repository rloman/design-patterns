package nl.designpatterns.decorator;

public class Coffee extends Beverage {
	
	private final double PRICE = 2.5;

	@Override
	public double cost() {
		return PRICE;
	}

}
