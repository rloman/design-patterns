package nl.designpatterns.chain_of_responsibility;

public class NumberHandler implements Handler {
	
	private Handler chain = new OneHandler();

	@Override
	public boolean handle(int number) {
		return chain.handle(number);
	}
}
