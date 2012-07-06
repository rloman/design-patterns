package nl.designpatterns.factory;

public class BmwFactory extends CarFactory {

	@Override
	public Car createCar(String type) {
		// TODO Auto-generated method stub
		if("320i".equals(type)) {
			return new Bmw320i();
		}
		
		else return new Bmw();
	}

}
