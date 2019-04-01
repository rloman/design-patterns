package nl.designpatterns.builder;

import java.util.Date;

public class VacationBuilder {
	
	private static VacationBuilder builder = new VacationBuilder();
	
	private VacationBuilder() {}
	
	public static VacationBuilder getInstance() {
		return builder;
	}
	
	private Vacation vacation = new Vacation();
	
	public void addPersoon(String voornaam, String achternaam) {
		
		Persoon p = new Persoon(achternaam, voornaam, new Date());
		this.vacation.addPersoon(p);
	}
	
	public void setHotel(String name) {
		this.vacation.setHotel(new Hotel(name));
		
	}
	
	public void setReservation(String in, String uit) {
		
		
		// test normaliter zou ik datum moeten parsen maar dat vind ik nog steeds zuigen in Java.
		Date inDate = new Date();
		Date outDate = new Date(new Date().getTime()-10000);
		Reservation reservation = new Reservation(inDate, outDate);
		
		this.vacation.setReservation(reservation);
		
		
	}
	
	public void addActivity(Activity activity) {
		
		this.vacation.addActivity(activity);
		
		
	}
	
	public Vacation getVacation() {
		return this.vacation;
	}

}
