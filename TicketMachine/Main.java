class TicketMachine{
    private int price;
    private int balance;
    private int total;

    public TicketMachine(int price){
        if(price > 0){
            this.price = price;
        }else{
            System.out.println("Ticket price have to be greater than 0!");
        }
        this.balance = 0;
        this.total = 0;
    }

    public int getPrice(){
        return price;
    }

    public int getBalance(){
        return balance;
    }

    public int getTotal(){
        return total;
    }

    public void insertMoney(int amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Inserted Money: " + amount);
        }else{
            System.out.println("Insert a positive amount of money!");
        }
    }

    public void getTicket(){
        if(balance >= price){
            balance -= price;
            total += price;

            System.out.println("---Ticket--- Price: " + price);
        }else{
            System.out.println("Insufficient balance.");
        }
    }
}

public class Main {
    public static void main(String[] args){

        TicketMachine ngeng = new TicketMachine(10);

        ngeng.insertMoney(30);
        ngeng.getTicket();
        System.out.println("Balance: " + ngeng.getBalance());

    }
}
