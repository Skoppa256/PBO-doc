public class Main {
    public static void main(String[] args) {
        double baseFare = 1000.0;

        Ticket economy = new EconomyTicket(baseFare, "Budi", 20);
        Ticket business = new BusinessTicket(baseFare, "Andi", 24);
        Ticket firstClass = new FirstClassTicket(baseFare, "Bambang", 22);

        economy.setTax(10);
        System.out.println("Economy Ticket:");
        economy.displayTicketInfo();

        business.setTax(10);
        System.out.println("\nBusiness Ticket:");    
        business.displayTicketInfo();

        firstClass.setTax(10);
        System.out.println("\nFirst Class Ticket:");
        firstClass.displayTicketInfo();
    }
}