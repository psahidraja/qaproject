//unit testing class
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instantiating of cinema object 
		Cinema cinema = new Cinema();
		
		//calling methods
		cinema.buyTicket("oap", "Due date", "wednesday");
		cinema.buyTicket("standard", "Due Date","monday");
		cinema.buyTicket("child", "Hangover", "monday");
		cinema.buyTicket("student", "Batman", "monday");
	
		//printing the total basket price 
		cinema.printBasket();
		
	}

}
