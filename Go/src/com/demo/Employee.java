package com.demo;

public class Employee extends Company {
	public Employee(String name, int employeesNumber) {
		super(name, employeesNumber);
		// TODO Auto-generated constructor stub
	}


	int data[]= {0,4,42};

	
	public void display() {
		System.out.println("Data: ");
		for(int i= 0;i < data.length; i++) {
			System.out.println("Next Value: "+data[i]);
			System.out.println("-------------------------");
			System.out.println("Best Value");
		}
	}

}
