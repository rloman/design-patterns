package nl.designpatterns.command;

public class GarageDoorOpenCommand implements Command {
	private GarageDoor garageDoor;

	@Override
	public void execute() {
		garageDoor.open();
		garageDoor.showStatus();
	}
	
	public GarageDoorOpenCommand(GarageDoor door) {
		this.garageDoor = door;
	}
	
}
