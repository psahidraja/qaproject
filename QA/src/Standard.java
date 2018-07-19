//standard is inheritance of ticket class using key word extends 
public class Standard extends Ticket{

	public Standard(String screen, String movie) {
		super(screen, movie);
		super.setPrice(8.0); //default price for standard ticket
		// TODO Auto-generated constructor stub
	}

}
