import java.util.Scanner;

public class MovieTicketBook{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		MovieTicket ticket = new MovieTicket("Inception");

        ticket.displayTicketDetails();
        System.out.println();

        System.out.println("Enter seat number to book:");
        String seatNumber = scanner.nextLine();
        System.out.println("Enter ticket price:");
        double price = scanner.nextDouble();

        ticket.bookTicket(seatNumber, price);
        System.out.println();
        ticket.displayTicketDetails();

        scanner.close();
	}
}
class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;

    // Constructor 
    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = null; 
        this.price = 0.0;       
    }

    public void bookTicket(String seatNumber, double price) {
        if (this.seatNumber != null) {
            System.out.println("Seat " + this.seatNumber + " is already booked for " + movieName + ".");
            return;
        }
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully for " + movieName + "!");
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        if (seatNumber == null) {
            System.out.println("No ticket has been booked for " + movieName + " yet.");
        } else {
			System.out.println("Ticket Details: ");
            System.out.println("Movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: " + price);
        }
    }
}

    
   