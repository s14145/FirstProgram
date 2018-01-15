package com.demo;

public class Employee extends Company {
	int data[]= {0,4,42};

	public Employee(String name, int employeesNumber) {
		super(name, employeesNumber);
		// TODO Auto-generated constructor stub
	}
	public void display() {
		for(int i= 0;i < data.length; i++) {
			System.out.println("");
		}
	}

}
