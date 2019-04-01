package nl.designpatterns.strategy;

public abstract class Duck {
	
	 FlyBehaviour flyBehaviour;
	 WalkBehaviour walkBehaviour;
	
	 public void fly() {
		 this.flyBehaviour.fly();
	 }
	 
	 public void walk() {
		 this.walkBehaviour.walk();
	 }
	

	
	
}
