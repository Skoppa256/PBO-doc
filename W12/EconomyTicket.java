import java.util.List;

public class EconomyTicket extends Ticket {
    private double luggageAllowance;

    public EconomyTicket(double baseFare, String passengerName, int passengerAge) {
        super(baseFare, passengerName, passengerAge);
        this.luggageAllowance = 15.0;
    }

    public double getLuggageAllowance() {
        return luggageAllowance;
    }

    public void setLuggageAllowance(double luggageAllowance) {
        this.luggageAllowance = luggageAllowance;
    }

    @Override
    public double calculateFare(){
        baseFare = baseFare * 0.9;
        double fareAfterTax = baseFare + (baseFare * (tax / 100));
        return fareAfterTax + additionalCharge;
    }

    @Override
    public List getFacilities() {
        return List.of("Basic seating");
    }

    @Override
    public void displayTicketInfo() {
        super.displayTicketInfo();
        System.out.println("Luggage Allowance: " + luggageAllowance + " kg");
    }
}