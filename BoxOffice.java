import java.util.*;
/**
* This program is used to display the cost of tickets given a number of adult and student tickets with other optional parameters.
* @author Santhiya Holmes
*/
public class BoxOffice {
	public static final int YEAR = 2014;
	
	public static final int WEEKEND_SURCHARGE = 3;
	
	public static final int CAPTAIN_MATINEE_PRICE = 8;
	public static final int CAPTAIN_WEEKDAY_PRICE = 10;
	public static final int CAPTAIN_STUDENT_PRICE = 8;
	
	public static final int OTHER_MATINEE_PRICE = 6;
	public static final int OTHER_WEEKDAY_PRICE = 8;
	public static final int OTHER_STUDENT_PRICE = 6;
	
	/**
	* User's input is taken in, checked for the correct types, and then used to calculate the final price using other methods.
	* @param args Command line arguments (not used)
	*/
	
	public static void main (String [] args) {
		System.out.println("Welcome to the Wolfpack Theater Box Office! ");
		System.out.println("When prompted, please enter the movie you would like see: ");
		System.out.println("C (C-aptain Phillips), G (G-ravity), or P (P-hilomena), the ");
		System.out.println("date, whether it is a matinee, and the number of adult and ");
		System.out.println("student tickets you would like to purchase. The total cost ");
		System.out.println("of the tickets will then be displayed.");
		
		Scanner console = new Scanner(System.in);
		
		System.out.print("Movie (C-aptain Phillips, G-ravity, P-hilomena): ");
		String movieString = console.next();
		char movie = movieString.charAt(0);	
		boolean letter = ((movie == 'c') || (movie == 'g') ||(movie == 'p') || (movie == 'C') || (movie =='G') || (movie == 'P'));
		if (letter == false) {
			System.out.println("Invalid movie");
			System.exit(1);
			}
			
		System.out.print("Month (3,4,5): ");
		int month = console.nextInt();
		
		System.out.print("Day: ");
		int day = console.nextInt();
		if (isValidDate(month,day) == false) {
			System.out.println("Invalid date");
			System.exit(1);
		}
		System.out.print("Matinee (y,n): ");
		String matinee = console.next();
		matinee = matinee.toLowerCase();
		boolean isMatinee = matinee.startsWith("y");
		System.out.print("Number of adult tickets: ");
		if (!console.hasNextInt()){
			System.out.println("Please enter a number for your tickets");
			System.exit(1);
		}
		int adultTickets = console.nextInt();
		if (adultTickets < 0 ) {
			System.out.println("Invalid number of adult tickets");
			System.exit(1);
		}
		
		System.out.print("Number of student tickets: ");
		if (!console.hasNextInt()){
			System.out.println("Please enter a number for your tickets");
			System.exit(1);
		}
		int studentTickets = console.nextInt();
		if (studentTickets < 0 ) {
			System.out.println("Invalid number of student tickets");
			System.exit(1);
		}
		
		int cost = getCost(movie, month, day, isMatinee, adultTickets, studentTickets);
		System.out.println("Cost of Tickets: $" + cost + ".00");
		}
	/**
	* Finds out if the entered month and date are the right range of dates: march = 31 days, april = 30 days, may 1-15 days
	* @param month month entered by the user
	* @param day date entered by the user
	* @return date
	*/
	public static boolean isValidDate (int month, int day){
		boolean date = true;
		boolean rightMonth = (month == 3) || (month == 4) || (month ==5);
		if (rightMonth == false) {
			date = false;
		}
		if (month==3) {
			if ((day > 31) || (day <1)) {
				date = false;
			}
		}
		else if (month == 4) {
			if ((day > 30) || (day <1)) {
				date = false;
			}
		}
		else {
			if ((day > 15) || (day <1)) {
				date = false;
			}
		}
		return date;
	}

	/**
	* Uses Zeller's algorithm to find out if the date entered is a weekday or a weekend.
	* @param month month entered by the user
	* @param day date entered by the user
	* @return weekDay
	*/
	public static boolean isWeekday (int month, int day) {
		boolean weekDay = false;
		int w = YEAR - (14 - month) / 12;
		int x = w + w / 4 - w / 100 + w / 400;
		int z = month +  12 * ((14 - month) / 12) - 2;
		int dayOfWeek = (day + x + (31 * z) / 12) % 7;
		if (dayOfWeek == 1 || dayOfWeek == 2 || dayOfWeek == 3 || dayOfWeek == 4) {
			weekDay = true;
			}
		return weekDay;
	}
	/**
	* Uses the user's information to calcuate the final cost of the tickets.
	* @param movie the beginning letter of the move the user wants.
	* @param month month entered by the user
	* @param day date entered by the user
	* @param isMatinee boolean the user enters to let the program know is they want a matinee ticket
	* @param numberOfAdultTickets number of adult tickets the user requests
	* @param numberOfStudentTickets number of student tickets the user requests
	* @return cost
	*/
	
	public static int getCost (char movie, int month, int day, boolean isMatinee,
							   int numberOfAdultTickets, int numberOfStudentTickets) {
		checkInput(movie,month,day, numberOfAdultTickets, numberOfStudentTickets);
		int cost= 0;
		boolean ifWeekDay = isWeekday (month, day);
		
		if (isMatinee == true) {
			if ((movie == 'c')||(movie=='C')) {
				if (ifWeekDay) {
					cost = numberOfAdultTickets * CAPTAIN_MATINEE_PRICE + numberOfStudentTickets * CAPTAIN_MATINEE_PRICE;
				}
				else {
					cost = (numberOfAdultTickets * CAPTAIN_MATINEE_PRICE) + (numberOfStudentTickets * CAPTAIN_MATINEE_PRICE) + WEEKEND_SURCHARGE;
				}
			}
			else {
				if (ifWeekDay) {
					cost = numberOfAdultTickets * OTHER_MATINEE_PRICE + numberOfStudentTickets * OTHER_MATINEE_PRICE;
				}
				else {
					cost = (numberOfAdultTickets * OTHER_MATINEE_PRICE) + (numberOfStudentTickets * OTHER_MATINEE_PRICE) + WEEKEND_SURCHARGE;
				}
				}
			}
		else {
			if ((movie == 'c')||(movie=='C')) {
				if (ifWeekDay) {
					cost = numberOfAdultTickets * CAPTAIN_WEEKDAY_PRICE + numberOfStudentTickets * CAPTAIN_STUDENT_PRICE;
				}
				else {
					cost = (numberOfAdultTickets * CAPTAIN_WEEKDAY_PRICE) + (numberOfStudentTickets * CAPTAIN_STUDENT_PRICE) + WEEKEND_SURCHARGE;
				}
			}
			else {
				if (ifWeekDay) {
					cost = numberOfAdultTickets * OTHER_WEEKDAY_PRICE + numberOfStudentTickets * OTHER_STUDENT_PRICE;
				}
				else {
					cost = (numberOfAdultTickets * OTHER_WEEKDAY_PRICE) + (numberOfStudentTickets * OTHER_STUDENT_PRICE) + WEEKEND_SURCHARGE;
				}
			}
		}
		return cost;	

	}
	/**
	* Checks the input sent to the getCost method.
	* @param movie the beginning letter of the move the user wants.
	* @param month month entered by the user
	* @param day date entered by the user
	* @param numberOfAdultTickets number of adult tickets the user requests
	* @param numberOfStudentTickets number of student tickets the user requests
	* @throws IllegalArgumentException movie
	* @throws IllegalArgumentException month,day
	* @throws IllegalArgumentException numberOfAdultTickets
	* @throws IllegalArgumentException numberOfStudentTickets
	*/
	
	public static void checkInput ( char movie, int month, int day, int numberOfAdultTickets, int numberOfStudentTickets ) {
		boolean letter = ((movie == 'c') || (movie == 'g') ||(movie == 'p') || (movie == 'C') || (movie =='G') || (movie == 'P'));
		if (letter == false){
			throw new IllegalArgumentException("Enter the appropriate movie");
		}
		if (isValidDate(month,day) == false) {
			throw new IllegalArgumentException("Enter the appropriate date");
		}
		if (numberOfAdultTickets < 0 ) {
			throw new IllegalArgumentException("Enter the appropriate number of Adult Tickets");
		}
		if (numberOfStudentTickets < 0 ) {
			throw new IllegalArgumentException("Enter the appropriate number of Student Tickets");
		}
	}
}