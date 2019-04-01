package nl.designpatterns.command;

public class Light {
	
	private boolean on = false;
	
	
	public void on() {
		this.on = true;
	}
	
	public void off() {
		this.on = false;
	}
	
	public void toggle() {
		this.on = !this.on;
	}
	
	public void showStatus() {
		System.out.println("The light is "+this.on);
	}

}
