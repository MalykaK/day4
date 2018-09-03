package com.capgemini.day4;

public class President extends Employees {
	private double kilometersTravelled;
	private double tourAllowance;
	private final double telephoneAllowance=2000;
	
	
	public President() {
		super();
		// TODO Auto-generated constructor stub
	}


	public President(double basicSalary, long empId, String empName,double kilometersTravelled) {
		super(basicSalary, empId, empName);
		this.kilometersTravelled=kilometersTravelled;
		// TODO Auto-generated constructor stub
	}


	


	@Override
	public double calculateNetSalary() {
	
	return super.calculateNetSalary()+kilometersTravelled*8+telephoneAllowance;

	}
}
