package hometask20;

public class Employee {

    private String name;
    private int year;
    private double salary;
    private Gender gender;

    enum Gender {
        MALE, FEMALE
    }


    public Employee(String name, int year, double salary, Gender gender) {
        this.name = name;
        this.year = year;
        this.salary = salary;
        this.gender = gender;

    }

    public Gender getGender() {
        return gender;

    }


    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public double getSalary() {
        return salary;
    }
}
