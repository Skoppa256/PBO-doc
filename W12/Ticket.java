import java.util.List;

public class Ticket {
    protected double baseFare;
    protected String passengerName;
    protected int passengerAge;
    protected double tax;
    protected double additionalCharge;

    public Ticket(double baseFare, String passengerName, int passengerAge){
        this.baseFare = baseFare;
        this.passengerName = passengerName;
        this.passengerAge = passengerAge;
        this.tax = 0.0;
        this.additionalCharge = 0.0;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public void setAdditionalCharge(double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    public double calculateFare(){
        double fareAfterTax = baseFare + (baseFare * (tax / 100));
        return fareAfterTax + additionalCharge;
    }

    public List getFacilities() {
        return List.of("Basic seating");
    }

    public void displayTicketInfo() {
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Passenger Age: " + passengerAge);
        System.out.println("Base Fare: " + baseFare);
        System.out.println("Tax: " + tax + "%");
        System.out.println("Additional Charges: " + additionalCharge);
        System.out.println("Total Fare: " + calculateFare());
    }
}
