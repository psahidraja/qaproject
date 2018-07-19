import java.util.ArrayList;

//cinema class
public class Cinema {

	//variable with arraylist 
	private ArrayList<Ticket> basket;
	
	//default constructor 
	public Cinema() {
		basket = new ArrayList<Ticket>();
	}
	
	//switch cases to switch between the type of tickets 
	public void buyTicket(String typeOfTicket, String movie, String day) {
		Ticket ticket = null; //initialise to null 
		boolean flag = true;
		switch(typeOfTicket) {
		case "oap":
			ticket = new OAP("screen 1", movie);
			break;
		case "student":
			ticket = new Student("screen 1", movie);
			break;
		case "child":
			ticket = new Child("screen 1", movie);
			break;
		case "standard":
			ticket = new Standard("screen 1", movie);
			break;
		default:
			//if wrong ticket is purchased no ticket will be issued 
			System.out.println("Ticket for \""+ typeOfTicket+ "\" does not exist");	
			flag = false;
		}
		if(flag) {
			basket.add(ticket); //adding tickets to the basket 
			//if day equals to wednesday then £2 discount will be provided 
			if(day.equalsIgnoreCase("wednesday")) {
				ticket.setPrice(ticket.getPrice() - 2); //reducing £2 
			}
		}
	}
	
	//method for total of ticket price 
	public void printBasket() {
		double price = 0.0;
		for (Ticket ticket : basket) {
			price += ticket.getPrice();
		}
		//printing total cost of the tickets 
		System.out.println("The total cost of tickets for this movie is " +price);
	}
}
