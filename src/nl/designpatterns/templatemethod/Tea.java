package nl.designpatterns.templatemethod;

public class Tea extends CaffeineBeverage {

	@Override
	void brew() {
		System.out.println("Put teabag in the water.");

	}

	@Override
	void addCondiments() {
		System.out.println("Add sugar and honey to the tea");

	}

}
