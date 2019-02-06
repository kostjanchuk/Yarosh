package hometask20;


public class Start {

    public static void main(String[] args) {
        ManagementDepartment managementDepartment1= new ManagementDepartment(10);

        Employee employee1= new Employee("Kostya",1999,5000, Employee.Gender.MALE);
        Employee employee2= new Employee("Dasha",1995,2000, Employee.Gender.FEMALE);
        Employee employee3= new Employee("Masha",1998,2000, Employee.Gender.FEMALE);
        Employee employee4= new Employee("Katya",1960,2000, Employee.Gender.FEMALE);
        Employee employee5= new Employee("Stepan",1970,2000, Employee.Gender.MALE);

        managementDepartment1.add(employee1);
        managementDepartment1.add(employee2);
        managementDepartment1.add(employee3);
        managementDepartment1.add(employee4);
        managementDepartment1.add(employee5);



        managementDepartment1.add(employee1);
        managementDepartment1.add(employee2);
        managementDepartment1.add(employee3);
        managementDepartment1.add(employee4);
        managementDepartment1.add(employee5);




        managementDepartment1.add(employee1);
        



        System.out.println("На работу приняли сотрудников");
        managementDepartment1.showAllEmployee();
        System.out.println("Работники мужского пола ");
        managementDepartment1.showFilterArr( managementDepartment1.filter(Employee.Gender.MALE));

        System.out.println("Работники женского пола ");
        managementDepartment1.showFilterArr( managementDepartment1.filter(Employee.Gender.FEMALE));

        System.out.println("Работники младше 30 ");
        managementDepartment1.showFilterArr(managementDepartment1.filterYounger(30));

        System.out.println("Работники старше 30 ");
        managementDepartment1.showFilterArr(managementDepartment1.filterOlder(30));








    }
}
