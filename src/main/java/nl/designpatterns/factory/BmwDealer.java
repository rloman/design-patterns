package nl.designpatterns.factory;

public class BmwDealer {

	static Car eenBmw;
	
	public static void main(String[] args) {
		
		eenBmw = new BmwFactory().createCar("320i");
		

	}

}
