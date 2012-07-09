package nl.designpatterns.templatemethod;

public class Coffee extends CaffeineBeverage {

	@Override
	void brew() {
		System.out.println("Brew/filter the coffee ...");

	}

	@Override
	void addCondiments() {
		System.out.println("Add milk and sugar to the coffeee.");

	}

}
