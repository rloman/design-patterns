package nl.designpatterns.strategy;

public class TwentseDuck extends Duck {
	
	public TwentseDuck() {
		this.flyBehaviour = new FlyWithWings();
		this.walkBehaviour = new WalkWithFeet();
	}

}
