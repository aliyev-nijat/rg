package az.idtech.nijat.lesson_oop.task7;

public class Main {

    public static void main(String[] args) {
        Address address = new Address("Babayev","Baku",1122);
        Employee employee = new Employee("Nijat Aliyev", 5000, address);
        employee.showEmployeeDetails();

        Address address2 = new Address("Azadlig avenue","London",4555);
        Employee employee2 = new Employee("Mehdi Quliyev", 2000, address2);
        employee2.showEmployeeDetails();

        Address address3 = new Address("Nijat Aliyev","Berlin",1222);
        Employee employee3 = new Employee("Vuqar Hemidov", 9000, address3);
        employee3.showEmployeeDetails();
    }
}
