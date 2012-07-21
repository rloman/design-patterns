package nl.designpatterns.chain_of_responsibility;

public class OneHandler implements Handler {
	
	private Handler chain = new TwoHandler();
	

	@Override
	public boolean handle(int number) {
		if(number == 1) { // magic number :-)) 
			System.out.println("Handled a 1");
			return true;
		}
		else {
			return chain.handle(number);
		}
	}

}
