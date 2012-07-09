package nl.designpatterns.templatemethod;

public abstract class CaffeineBeverage {
	
	 public final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	
	 void boilWater() {
		System.out.println("Boiling water ...");
	}
	 
	 void pourInCup() {
		 System.out.println("Pour fluid in cup.");
	 }
	 

	abstract void brew();
	abstract void addCondiments();
	
}
