package org.Private;

public class Type1 {
	
	// 1. It can be Access within the class only
	// 2. not outside the class 
	
	private void employeeName() {
		System.out.println("Employee name is Kaaviyan");
		
	}
	
	private void employeeId() {
		System.out.println("Employee Id is 1245");
		
	}
	
	private void employeeSalary() {
		System.out.println("Employee Salary  is 10000");
		
	}
	
	
	
	 public static void main(String[] args) {
		
		 Type1 s = new Type1();
		 
		 s.employeeName();
		 s.employeeId();
		 s.employeeSalary();
		
	}

}
