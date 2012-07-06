package nl.designpatterns.decorator;

public class Main {

	public static void main(String[] args) {

		Beverage drank = new Sugar(new Chocolate(new Milk(new Coffee())));
		
		System.out.println(drank.cost());
		
	}

}
