package nl.designpatterns.builder;

public class Application {

	public static void main(String[] args) {
		
		VacationBuilder builder = VacationBuilder.getInstance();
		builder.addActivity(Activity.HARDLOPEN);
		builder.addPersoon("Liek", "Loman");
		builder.setHotel("Amelander Kaap");
		builder.setReservation("1-08-2012", "14-08-2012");
		
		Vacation vacation = builder.getVacation();
		String show = vacation.show();
		System.out.println(show);
		
		
		

	}

}
