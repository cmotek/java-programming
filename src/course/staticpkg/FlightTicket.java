package course.staticpkg;

public class FlightTicket {
    public int flightNumber;
    public int seatNumber;
    public String ticketCategory;
    public int ticketId;

    public static int availableSeats = 2;

    static {
        System.out.println("Static block 1 called");
    }

    static {
        System.out.println("Static block 2 called");
    }

    public FlightTicket(int flightNumber, int seatNumber, String ticketCategory, int ticketId) {
        this.flightNumber = flightNumber;
        this.seatNumber = seatNumber;
        this.ticketCategory = ticketCategory;
        this.ticketId = ticketId;
    }

    public static void main(String[] args) {
        createTicket(1, "Economy", 12345);
        createTicket(2, "Business", 12346);
        createTicket(3, "Business", 12347);
    }

    private static void createTicket(int seatNumber, String Economy, int ticketId) {
        if (availableSeats > 0) {
            FlightTicket ticket1 = new FlightTicket(1122, seatNumber, Economy, ticketId);
            availableSeats--;
            System.out.println("Available seats now ::"+ availableSeats);
        } else {
            System.out.println("Sorry ticket not available.");
        }
    }
}
