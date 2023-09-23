package org.Protected;

public class Type3 {
	
	// it can be access within the class by using extends or object creation
	// it can be access outside the class by using extends keyword only
	
	protected void studentName() {
		System.out.println("Student name is kavi");
	}
	
	protected void studentId() {
		System.out.println("Student id is 45678");
	}
	
	protected void studentDepartment() {
		System.out.println("Student Department is Mechanical");
	}
	
	public static void main(String[] args) {
		
		Type3 t = new Type3();
		t.studentName();
		t.studentId();
		t.studentDepartment();
	}

}
