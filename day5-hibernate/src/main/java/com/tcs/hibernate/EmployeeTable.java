package com.tcs.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmployeeTable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int eno;
	private String ename;
	private double salary;
	
	public EmployeeTable() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeTable(int eno, String ename, double salary) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeTable [eno=" + eno + ", ename=" + ename + ", salary=" + salary + "]";
	}
	

}
