package com.deloitte.emp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_details")

public class Employee   {
	@Id
	@Column(name="Employee_ID")
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int empId;
	@Column(name="Employee_name",nullable=false,unique=true)
	String name;
	 double salary; 
	

	public Employee() {
	 
		 
	}
	public Employee(int id,String name,double salary) {
		this.empId=id;
		this.name=name;
		this.salary=salary;
		 
		 
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + "]";
	}
	
	

 
}
