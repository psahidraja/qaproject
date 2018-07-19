// encapsulation ticket class abstraction of Student, OAP, Standard, Child
public abstract class Ticket {

	//variables
	private String screen, movie;
	private double price;

	//constructor 
	public Ticket(String screen, String movie) {
		this.screen = screen;
		this.movie = movie;
	}
	
	
	//accessor method can access from any other class
	public String getScreen() {
		return screen;
	}
	
	public String getMovie() {
		return movie;
	}
	
	public double getPrice() {
		return price;
	}
	
	//mutator method can access from any other class
	public void setScreen(String screen) {
		this.screen = screen;
	}
	
	public void setMovie(String movie) {
		this.movie = movie;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
}
