package nl.designpatterns.templatemethod;

public abstract class CaffeineBeverage {
	
	 public final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
		hook(); // name should change but it's still a hook! :-)
	}
	
	 void boilWater() {
		System.out.println("Boiling water ...");
		hookWaterHasBoiled();
	}
	 
	 void pourInCup() {
		 System.out.println("Pour fluid in cup.");
	 }
	 

	abstract void brew();
	abstract void addCondiments();
	
	void hook(){} 
	
	void hookWaterHasBoiled(){}
	
}
