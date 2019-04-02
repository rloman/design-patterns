package nl.designpatterns.chain_of_responsibility;

public class Application {

	public static void main(String[] args) {
		
		NumberHandler handler = new NumberHandler();
		handler.handle(4);
		
		
		String tobeHandled = "1234857428752943570243857209384";
		handler.handle(tobeHandled);
		System.out.println(tobeHandled);
		handler.show();

	}

}
