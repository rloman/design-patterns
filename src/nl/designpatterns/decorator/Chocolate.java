package nl.designpatterns.decorator;

public class Chocolate extends CondimentDecorator {
	private final double PRICE = 0.55;
	private Beverage beverage;
	
	public Chocolate(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return this.beverage.cost() + PRICE;
	}

}
