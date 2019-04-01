package nl.designpatterns.templatemethod;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("<coffee>");
		CaffeineBeverage beverage = new Coffee();
		beverage.prepareRecipe();
		System.out.println("</coffee>");
		System.out.println("<tea>");
		beverage = new Tea();
		beverage.prepareRecipe();
		System.out.println("</tea>");

	}

}
