package nl.designpatterns.facade.hometheater;

public class Main {

	public static void main(String[] args) {
		
		HomeTheaterFacade facade = new HomeTheaterFacade(new DVDBurner(), new PlexPlayer(), new HifiSet());
		
		facade.niceEveningWithWoman();

	}

}
