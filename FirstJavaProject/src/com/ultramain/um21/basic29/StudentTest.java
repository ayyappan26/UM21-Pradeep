package com.ultramain.um21.basic29;

public class StudentTest {

	public static void main(String[] args) {
		Student mystudent=new Student();
		StudentAsst sassist=new StudentAsst();
		mystudent=sassist.getStudentDetails(mystudent);
		sassist.printStudentDetails(mystudent);
		
	}

}
