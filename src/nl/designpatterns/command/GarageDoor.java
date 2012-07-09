package nl.designpatterns.command;

public class GarageDoor {

	private boolean open = false;

	public void open() {
		this.open = true;
	}

	public void close() {
		this.open = false;
	}

	public void showStatus() {
		System.out.println("The door is:"+this.open);
	}

}
