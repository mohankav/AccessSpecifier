package org.Protected;

public class Type4 {
	
	protected void studentContact() {
		System.out.println("Student phone no is 8072267");
	}
	
	protected void studentPercentage() {
		System.out.println("Student Percentage is 68.5%");
	}

	public static void main(String[] args) {
		
		Type3 t1 = new Type3();
		
		t1.studentName();
		t1.studentId();
		t1.studentDepartment();
		
		Type4 t = new Type4();
		t.studentContact();
		t.studentPercentage();
	}
}

