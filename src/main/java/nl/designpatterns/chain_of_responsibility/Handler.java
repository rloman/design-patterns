package nl.designpatterns.chain_of_responsibility;

public interface Handler {
	
	public void handle(String number);
	public void show();
	public boolean handle(int number);

}
