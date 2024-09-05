// Classes
class Vehicle {
    // Encapsulation
    private String mode;

    public Vehicle(String mode){
        this.mode = mode;
    }

    public String getMode(){
        return mode;
    }

    // Abstraction
    public void informationOut(){
        System.out.println("I move from one position to another through...");
    }
}

// Inheritance
class Car extends Vehicle {
    private String brand;

    public Car(String mode, String brand){
        super(mode);
        this.brand = brand;
    }

    public String getBrand(){
        return brand;
    }

    // Polymorphism
    @Override
    public void informationOut(){
        System.out.println("I move from one position to another through land");
    }

    // Overloading
    public void informationOut(String engine){
        System.out.println("I move from one position to another through land using " + engine + ".");
    }
}

public class Main {
    public static void main(String[] args){

        // Objects, Instantiation of Classes
        Vehicle boat = new Vehicle("Water");
        Car zenix = new Car("Land", "Toyota");

        boat.informationOut();
        zenix.informationOut();
        zenix.informationOut("1.8 Hybrid");

    }
}
