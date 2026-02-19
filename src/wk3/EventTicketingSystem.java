package wk3;

public class EventTicketingSystem {
/*
Tasks
1) Create an EventTicketingSystem
    class EventTicketingSystem
    attributes
        name of event: String
        single ticket cost: int|double
        number of attendees
        cost to host event
        revenue generated
    actions:
        default constructor
        3-args constructor:
            name of event
            single ticket cost
            cost to host event
        buytickets(numberOfTickets)
            increase number of attendees
            increase revenu generated
        refundtickets(numberOfTickets)
            opposite of buytickets
        code getters and setters


 */
public void buyTickets(int numberOfTickets) {
    setRevenueGenerated(getRevenueGenerated() + numberOfTickets * getSingleTicketCost());
    setNumberOfAttendees(getNumberOfAttendees() + numberOfTickets);
}
    public void refundTickets(int numberOfTickets) {
        setRevenueGenerated(getRevenueGenerated() - numberOfTickets * getSingleTicketCost());
        setNumberOfAttendees(getNumberOfAttendees() - numberOfTickets);
     //   buyTickets(-numberOfTickets);
    }
    public EventTicketingSystem(){
        this("Default", 1, 1);
    }
    public EventTicketingSystem(String nameOfEvent, double singleTicketCost, double costToHostEvent){

        setNameOfEvent(nameOfEvent);
        setSingleTicketCost(singleTicketCost);
        setCostToHostEvent(costToHostEvent);
    }

    private String nameOfEvent;
    private double singleTicketCost;
    private int numberOfAttendees;
    private double costToHostEvent;
    private double revenueGenerated;

    public String getNameOfEvent() {
        return nameOfEvent;
    }

    public void setNameOfEvent(String nameOfEvent) {
        this.nameOfEvent = nameOfEvent;
    }

    public double getSingleTicketCost() {
        return singleTicketCost;
    }

    public void setSingleTicketCost(double singleTicketCost) {
        this.singleTicketCost = singleTicketCost;
    }

    public int getNumberOfAttendees() {
        return numberOfAttendees;
    }

    public void setNumberOfAttendees(int numberOfAttendees) {
        this.numberOfAttendees = numberOfAttendees;
    }

    public double getCostToHostEvent() {
        return costToHostEvent;
    }

    public void setCostToHostEvent(double costToHostEvent) {
        this.costToHostEvent = costToHostEvent;
    }

    public double getRevenueGenerated() {
        return revenueGenerated;
    }

    public void setRevenueGenerated(double revenueGenerated) {
        this.revenueGenerated = revenueGenerated;
    }
}
