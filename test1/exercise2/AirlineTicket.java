package test1.exercise2;

import java.util.Arrays;

public class AirlineTicket {
    // Variables
    double fare;
    String ticketCode;
    int[] seatNumbers;

    static String regex = "^[A-Z]{2}\\d{4}$";

    // Main method
    public static void main(String[] args) {

        // Test 1 - valid ticket creation
        AirlineTicket ticket = new AirlineTicket(350.00, "AB1234", new int[]{12, 14});
        System.out.println("Test 1 passed: " + (ticket.getFare() == 350.00 && ticket.getTicketCode().equals("AB1234")));

        // Test 2 - negative fare throws exception
        try {
            new AirlineTicket(-50.0, "AB1234");
            System.out.println("Test 2 failed: no exception thrown");
        } catch (IllegalArgumentException e) {
            System.out.println("Test 2 passed: " + e.getMessage());
        }

        // Parameterized test 1 - invalid ticket codes
        String[] invalidCodes = {"ab1234", "A1234B", "ABC123", "AB12345"};
        for (String code : invalidCodes) {
            try {
                new AirlineTicket(100.0, code);
                System.out.println("Test 3 failed for: " + code);
            } catch (IllegalArgumentException e) {
                System.out.println("Test 3 passed for: " + code);
            }
        }

        // Parameterized test 2 - valid fares and ticket codes
        double[] fares = {100.0, 250.5, 999.9};
        String[] validCodes = {"AB1234", "XY9999", "ZZ0001"};
        for (int i = 0; i < fares.length; i++) {
            AirlineTicket t = new AirlineTicket(fares[i], validCodes[i]);
            System.out.println("Test 4 passed for: " + (t.getFare() == fares[i] && t.getTicketCode().equals(validCodes[i])));
        }
    }

    // Constructors
    // Constructor 1
    public AirlineTicket(double fare, String ticketCode, int[] seatNumbers) {
        if (fare <= 0) throw new IllegalArgumentException("Fare must be positive.");
        if (ticketCode == null || !ticketCode.matches(regex))
            throw new IllegalArgumentException("Invalid ticket code: " + ticketCode);
        this.fare = fare;
        this.ticketCode = ticketCode;
        this.seatNumbers = seatNumbers;
    }

    // Constructor 2
    public AirlineTicket(double fare, String ticketCode) {
        this(fare, ticketCode, new int[]{});
    }

    // Economy
    public static AirlineTicket economyTicket(String ticketCode, int[] seatNumbers) {
        return new AirlineTicket(199.99, ticketCode, seatNumbers);
    }

    // Business
    public static AirlineTicket businessTicket(String ticketCode, int[] seatNumbers) {
        return new AirlineTicket(799.99, ticketCode, seatNumbers);
    }

    // Getters
    public double getFare() { return fare; }
    public String getTicketCode() { return ticketCode; }
    public int[] getSeatNumbers() { return seatNumbers; }

    // toString using StringBuilder
    @Override
    public String toString() {
        return new StringBuilder("AirlineTicket{")
        .append("fare=").append(fare)
        .append(", ticketCode='").append(ticketCode).append('\'')
        .append(", seatNumbers=").append(Arrays.toString(seatNumbers))
        .append('}')
        .toString();
    }
}