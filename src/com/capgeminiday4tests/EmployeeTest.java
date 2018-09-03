package com.capgeminiday4tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day4.President;

import com.capgemini.day4.SalesMangers;

class EmployeeTest {

	@Test
	void testsalesManager() {
	assertEquals(899.2600000000001,new SalesMangers(123,5000,"malyka").calculateNetSalary());
	assertEquals(16516.0,new President(10000,1234,"varuni", 2).calculateNetSalary());
	}

}
