//child is inheritance of ticket class using key word extends 
public class Child extends Ticket {

	public Child(String screen, String movie) {
		super(screen, movie);
		super.setPrice(4.0); //default price for child ticket
		// TODO Auto-generated constructor stub
	}

}
