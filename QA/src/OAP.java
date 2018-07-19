//OAP is inheritance of ticket class using key word extends 
public class OAP extends Ticket{

	public OAP(String screen, String movie) {
		super(screen, movie);
		super.setPrice(6.0); //default price for OAP ticket
		// TODO Auto-generated constructor stub
	}

}
