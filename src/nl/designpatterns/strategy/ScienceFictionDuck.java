package nl.designpatterns.strategy;

public class ScienceFictionDuck extends Duck {
	
	public ScienceFictionDuck() {
		this.flyBehaviour = new FlyWithRocket();
		this.walkBehaviour = new WalkOnWheels();
	}

}
