package com.skilllogic.Springprg.beans;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private AddressEmployee ADDR;
	public void setADDR(AddressEmployee aDDR) {
		ADDR =aDDR;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void display()
	{
		System.out.println("id "+id);
		System.out.println("name "+name);
		System.out.println("salary "+salary);
		ADDR.display();
	}

}
