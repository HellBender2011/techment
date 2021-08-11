package com.techment.test;

public class Employee {

	String firstName;
	String lastName;
	
	
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}


	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee("Amit", "Kumar");
		System.out.println(emp1.toString());
		
		Employee emp2 = new Employee("Divya", "Kashyap");
		System.out.println(emp2.toString());
		
		Employee emp3 = new Employee("Nishita", "Toshi");
		System.out.println(emp3.toString());

	}

}
