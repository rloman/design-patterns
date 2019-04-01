package nl.designpatterns.decorator;

public class Sugar extends CondimentDecorator {

	private double prijs = 0.10;
	private Beverage beverage;
	
	public Sugar(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public double cost() {
		return prijs+beverage.cost();
	}

}
