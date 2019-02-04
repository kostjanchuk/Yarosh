package hometask18;

public class Airplane extends Vehicle {

    private int numberOfEngines;


    @Override
    public void move() {
        System.out.println("The plane is flying");
    }

    public void landing() {
        System.out.println("The plane is landing");
    }


}
