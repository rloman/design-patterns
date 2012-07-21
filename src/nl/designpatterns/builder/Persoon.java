package nl.designpatterns.builder;

import java.util.Date;

public class Persoon {
	
	private String lastName;
	private String firstName;
	private Date dateOfBirth;
	
	public Persoon(String lastName, String firstName, Date dateOfBirth) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.dateOfBirth = dateOfBirth;
	}

}
