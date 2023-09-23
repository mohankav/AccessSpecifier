package org.Public;

public class Types extends Type2 {
	
	
	public  void employeeName() {
		System.out.println("Employee name is Kaaviyan");
		
	}
	
	public  void employeeId() {
		System.out.println("Employee Id is 1245");
		
	}
	
	public  void employeeSalary() {
		System.out.println("Employee Salary  is 10000");
	}

	public static void main(String[] args) {
		
		Types t = new Types();
		t.employeeName();
		t.employeeId();
		t.employeeSalary();
		t.companyName();
		t.companyId();
		t.companyProfit();
		
	}
}
