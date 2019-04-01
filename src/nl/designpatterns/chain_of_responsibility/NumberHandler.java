package nl.designpatterns.chain_of_responsibility;

public class NumberHandler implements Handler {
	
	private int number;
	private int hits;
	private Handler chain;
	
	public NumberHandler(int number) {
		this.number = number;
		number++;
		if(number <10) {
			chain = new NumberHandler(number);
		}
		else {
			chain = new NullHandler();
		}
	}
	
	public NumberHandler() {
		this(0);
	}

	public boolean handle(int number) {
		if(this.number == number) {
			System.out.println("Handled a "+number+"!");
			hits++;
			
			return true;
		}
		else {
			return chain.handle(number);
		}
	}
	
	@Override
	public void handle(String number) {
		for(int i = 0;i<number.length();i++) {
			int getal = Integer.parseInt(number.substring(i, i+1));
			handle(getal);
		}
	}
	
	@Override
	public void show() {
		System.out.println("Found "+hits+" occurrences of "+this.number+"!");
		chain.show();
		
	}
}
