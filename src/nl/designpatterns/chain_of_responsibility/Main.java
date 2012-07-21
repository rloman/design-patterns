package nl.designpatterns.chain_of_responsibility;

public class Main {

	public static void main(String[] args) {
		
		
		// voorbeeld van het design pattern
		// je zou 1 handler class kunnen maken die 
		// geinstanteerd wordt met een int dat is
		// dan de waarde waarop hij handled.
		// dit van 0 tot en met 9 dus ...
		NumberHandler handler = new NumberHandler();
		handler.handle(4);
		
		handler.handle("1234857428752943570243857209384");

	}

}
