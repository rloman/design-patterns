package nl.designpatterns.state.trafficlight;

public class Main {

	public static void main(String[] args) {
		Trafficlight light = new Trafficlight();
		
		light.switchOrange();
		light.switchGreen();
		light.switchRed();
		light.switchOrange();
		light.switchOrange();
		light.switchRed();

	}

}
