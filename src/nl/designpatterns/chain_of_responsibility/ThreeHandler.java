package nl.designpatterns.chain_of_responsibility;

public class ThreeHandler implements Handler {

	@Override
	public boolean handle(int number) {
		System.out.println("Handled a 3!");
		
		return true;
	}

}
