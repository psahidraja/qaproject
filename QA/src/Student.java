//student is inheritance of ticket class using key word extends 
public class Student extends Ticket{

	//
	public Student(String screen, String movie) {
		super(screen, movie);
		super.setPrice(6.0); //default price for student ticket  
		// TODO Auto-generated constructor stub
	}

}
