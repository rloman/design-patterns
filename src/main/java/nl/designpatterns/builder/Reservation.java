package nl.designpatterns.builder;

import java.util.Date;

public class Reservation {
	
	private Date startDate;
	private Date endDate;
	
	public Reservation(Date in, Date out) {
		this.startDate = in;
		this.endDate = out;
	}

}
