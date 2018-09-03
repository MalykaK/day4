package com.capgemini.day4;

public class Employees {
	private double basicSalary;
	private long empId;
	private String empName;
	public static final double medical=200;
	public static final double pt=500;
	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employees(double basicSalary, long empId, String empName) {
		super();
		this.basicSalary = basicSalary;
		this.empId = empId;
		this.empName = empName;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public static double getMedical() {
		return medical;
	}
	public static double getPt() {
		return pt;
	}
	
	public double calculateNetSalary() {
		double hra,pf,grossSalary,netSalary;
		hra=0.5*basicSalary;
		pf=0.12*basicSalary;
		grossSalary=hra+basicSalary+medical;
		netSalary=grossSalary-(pf-pt);
		return netSalary;
	}
	}
	
	


