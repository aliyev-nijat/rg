package az.idtech.nijat.inheritance.polymorphism;

import java.util.Random;

public class Employee {

	public int calculateSalary() {
		Random r = new Random();
		
		return r.nextInt(3000);
	}
}
