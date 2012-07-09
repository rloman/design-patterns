package nl.designpatterns.facade;

public class HomeTheaterFacade {
	
	private DVDBurner burner;
	private PlexPlayer plex;
	private HifiSet player;
	
	public HomeTheaterFacade(DVDBurner burner, PlexPlayer plex, HifiSet player) {
		this.burner = burner;
		this.plex = plex;
		this.player = player;
	}
	
	public void niceEveningWithWoman() {
		burner.burn();
		plex.play();
		player.play();
		
	}

}
