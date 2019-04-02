package nl.designpatterns.decorator;

public class Application {

	public static void main(String[] args) {

		Beverage drink = new Sugar(new Chocolate(new Milk(new Coffee())));
		
		System.out.println(drink.cost());
		
	}

}
