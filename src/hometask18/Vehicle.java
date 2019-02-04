package hometask18;

public class Vehicle {

    private int speed;
    private int ticketPrice;
    private String Company;


    public Vehicle() {


    }

    public Vehicle(int speed, int ticketPrice, String company) {
        this.speed = speed;
        this.ticketPrice = ticketPrice;
        Company = company;
    }


    public void move() {
        System.out.println("Vehicle is moving");
    }

}
