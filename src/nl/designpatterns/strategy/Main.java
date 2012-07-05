package nl.designpatterns.strategy;

public class Main {

	public static void main(String[] args) {
		
		Duck duck = new TwentseDuck();
		
		duck.fly();
		duck.walk();
		
		duck = new ScienceFictionDuck();
		duck.fly();
		duck.walk();
	}

}
