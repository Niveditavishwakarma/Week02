public class HotelBookingClass{
	public static void main(String args[]){
        // Using the default constructor
        HotelBooking defaultBooking = new HotelBooking();
        System.out.println("Default Booking:");
        defaultBooking.displayDetails();

        System.out.println();

        // Using the parameterized constructor
        HotelBooking paramBooking = new HotelBooking("John Doe", "Deluxe", 3);
        System.out.println("Parameterized Booking:");
        paramBooking.displayDetails();

        System.out.println();

        // Using the copy constructor
        HotelBooking copyBooking = new HotelBooking(paramBooking);
        System.out.println("Copy Booking:");
        copyBooking.displayDetails();

        System.out.println();

        // Modify the copied booking and check the original
        copyBooking.setGuestName("Jane Smith");
        copyBooking.setRoomType("Suite");
        copyBooking.setNights(5);

        System.out.println("Modified Copy Booking:");
        copyBooking.displayDetails();

        System.out.println();

        System.out.println("Original Booking After Modifying the Copy:");
        paramBooking.displayDetails();
    }
	
}

class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    // Default constructor
    public HotelBooking() {
        this.guestName = "Unknown";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }
    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    // Method to display booking details
    public void displayDetails() {
        System.out.println("Booking Details:");
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }
}
