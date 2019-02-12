package hometask20;


public class ManagementDepartment {
    final static int CURRENT_YEAR = 2019;
    private int counter2;
    private int counter;

    private Employee[] employees;



    public ManagementDepartment(int number) {
        this.employees = new Employee[number];

    }

    public void add(Employee employee) {

        if (counter < employees.length) {
            employees[counter++] = employee;
        } else {
            System.out.println("Набранно максимальное количество сотрудников");
        }

    }

    public Employee[] filter(Employee.Gender gender) {
        Employee[] genderEmployees =new Employee[counter];
        counter2 = 0;

        for (int i = 0; i < counter; i++) {
            if (employees[i].getGender() == gender) {
                genderEmployees[counter2++] = employees[i];
            }


        }
        return genderEmployees;

    }


    public Employee[] filterOlder(int age) {
         Employee[] olderEmployees = new Employee[counter];
        counter2 = 0;

        for (int i = 0; i < counter; i++) {
            if ((CURRENT_YEAR - employees[i].getYear()) > age) {
                olderEmployees[counter2++] = employees[i];
            } else {
                olderEmployees[i] = null;
            }
        }
        return olderEmployees;
    }


    public Employee[] filterYounger(int age) {
      Employee[] youngerEmployees = new Employee[counter];
        counter2 = 0;
        for (int i = 0; i < counter; i++) {
            if ((CURRENT_YEAR - employees[i].getYear()) < age) {
                youngerEmployees[counter2++] = employees[i];
            } else {
                youngerEmployees[i] = null;

            }
        }
        return youngerEmployees;
    }


    public void showAllEmployee() {

        for (int i = 0; i < counter; i++) {
            System.out.println("Работник с именем " + employees[i].getName() + ".  Зарплата " + employees[i].getSalary());
        }
    }

    public void showFilterArr(Employee a[]) {
        for (int i = 0; i < a.length; i++) {
            if(a[i]!=null) {
                System.out.println("Работник с именем " + a[i].getName() + ".  Зарплата " + a[i].getSalary());
            }
            }


    }


}



