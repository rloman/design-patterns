package nl.designpatterns.chain_of_responsibility;

public class TwoHandler implements Handler {
	private Handler chain = new ThreeHandler();

	@Override
	public boolean handle(int number) {
		if(number == 2) { // magic number :-)) 
			System.out.println("Handled a 2");
			return true;
		}
		else {
			return chain.handle(number);
		}
	}
}
