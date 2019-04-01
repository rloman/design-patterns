package nl.designpatterns.command;

public class SimpleRemoteControlTest {

	public static void main(String[] args) {
		
		SimpleRemoteControl control = new SimpleRemoteControl();
		control.setCommand(new LightOnCommand(new Light()));
		
		control.buttonPressed();
		
		control.setCommand(new GarageDoorOpenCommand(new GarageDoor()));
		
		control.buttonPressed();

	}

}
