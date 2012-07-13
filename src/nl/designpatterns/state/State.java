package nl.designpatterns.state;

public interface State {
	
	void insertQuarter();
	void ejectQuarter();
	void turnCrank();
	void dispense();
	void refill(int balls);
	
	

}
