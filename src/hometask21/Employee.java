package hometask21;

public class Employee extends Person {
    private String education;

    public Employee(String name, String education) {
        super(name);
        this.education = education;


    }


    public Employee(String name) {
        super(name);

    }
}
