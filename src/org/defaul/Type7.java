package org.defaul;

public class Type7 {
	
	// It can be access within the class and package 
	// it can't access outside the package
	
	
	 void studentName() {
		System.out.println("Student name is kavi");
	}
	
	 void studentId() {
		System.out.println("Student id is 45678");
	}
	
	 void studentDepartment() {
		System.out.println("Student Department is Mechanical");
	}
	
	 public static void main(String[] args) {
		
		 Type6 t = new Type6();
			
			t.companyName();
			t.companyId();
			t.companyProfit();
			
			Type7 t1 = new Type7();
			t1.studentId();
			t1.studentName();
			t1.studentDepartment();
	}

}
