import java.util.List;

public class BusinessTicket extends Ticket {
    private double luggageAllowance;

    public BusinessTicket(double baseFare, String passengerName, int passengerAge) {
        super(baseFare, passengerName, passengerAge);
        this.luggageAllowance = 30.0;
    }

    public double getLuggageAllowance() {
        return luggageAllowance;
    }

    public void setLuggageAllowance(double luggageAllowance) {
        this.luggageAllowance = luggageAllowance;
    }

    @Override
    public double calculateFare(){
        baseFare = baseFare * 1.25;
        double fareAfterTax = baseFare + (baseFare * (tax / 100));
        return fareAfterTax + additionalCharge;
    }

    @Override
    public List getFacilities() {
        return List.of("Business seating", "Free meal", "Priority boarding");
    }

    @Override
    public void displayTicketInfo() {
        super.displayTicketInfo();
        System.out.println("Luggage Allowance: " + luggageAllowance + " kg");
    }
}