package com.demo;

import java.util.*;
import java.util.Scanner;

public class Company {
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeesNumber() {
		return EmployeesNumber;
	}

	public void setEmployeesNumber(int employeesNumber) {
		this.EmployeesNumber = employeesNumber;
	}

	static String name;
	 static int EmployeesNumber;
	 
	 public Company(String name, int employeesNumber) {
		
}
	 public static void main(String[] args) {
		Company obj1=new Company(name, EmployeesNumber);
		displayGreeting();
		System.out.println("Hello.");
		
		Employee objemp=new Employee(name, EmployeesNumber);
		objemp.display();
	}
	 
	 private static void displayGreeting() {
		 System.out.println("HELLO HAPPY SALES PEOPLE.");
		 System.out.println("THIS APP SHOWS SALES DATA.");
		 System.out.println("---------------------------");
	 
		 System.out.println("Test 1");
		 System.out.println("Test 2.");
	 }
}

