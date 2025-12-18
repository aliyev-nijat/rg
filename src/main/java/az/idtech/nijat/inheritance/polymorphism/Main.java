package az.idtech.nijat.inheritance.polymorphism;

public class Main {

	public static void main(String[] args) {
		Employee[] employees = new Employee[2];
		employees[0] = new Developer();
		employees[1] = new Manager();
		for (Employee e: employees) {
			System.out.println(e.calculateSalary());
		}
	}
}
