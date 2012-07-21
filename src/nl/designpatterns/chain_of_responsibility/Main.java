package nl.designpatterns.chain_of_responsibility;

public class Main {

	public static void main(String[] args) {
		
		NumberHandler handler = new NumberHandler();
		handler.handle(4);

	}

}
