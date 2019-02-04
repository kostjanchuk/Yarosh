package hometask21;

public class Manager extends Employee {
    private int salary;

    public Manager(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    public Manager(String name, String education, int salary) {
        super(name, education);
        this.salary = salary;


    }
}
