package nl.designpatterns.builder;

import java.util.ArrayList;
import java.util.List;

public class Vacation {
	
	private List<Persoon> personen = new ArrayList<Persoon>();
	private Hotel hotel;
	private Reservation reservation;
	private List <Activity> activities = new ArrayList<Activity>();
	
	public void addPersoon(Persoon persoon) {
		this.personen.add(persoon);
	}
	
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	
	public void addActivity(Activity activity) {
		this.activities.add(activity);
	}
	
	public String show() {
		String result = "";
		result +=personen;
		result += hotel;
		result += reservation;
		result += activities;
		
		return result;
	}
	
}
