package com.capgemini.day4;

public class SalesMangers extends Employees {
	private  double petrolAllowance;
	private  double foodAllowance;
	private double otherAllowance;
	public SalesMangers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SalesMangers(double basicSalary, long empId, String empName) {
		super(basicSalary, empId, empName);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public  double calculateNetSalary() {
		petrolAllowance=0.08*getBasicSalary();
		foodAllowance=0.13*getBasicSalary();
		otherAllowance=0.03*getBasicSalary();
		return super.calculateNetSalary()+petrolAllowance+foodAllowance+otherAllowance;
		
	}
		

	
}
