package nl.designpatterns.chain_of_responsibility;

public class NumberHandler implements Handler {
	
	private Handler chain = new OneHandler();

	@Override
	public boolean handle(int number) {
		return chain.handle(number);
	}
	
	public void handle(String number) {
		for(int i = 0;i<number.length();i++) {
			int getal = Integer.parseInt(number.substring(i, i+1));
			handle(getal);
		}
	}
}
