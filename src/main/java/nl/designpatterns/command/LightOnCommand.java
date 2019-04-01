package nl.designpatterns.command;

public class LightOnCommand implements Command {
	
	private Light light;
	
	@Override
	public void execute() {
		light.on();
		light.showStatus();
	}
	
	public LightOnCommand(Light light) {
		this.light = light;
	}
	
}
