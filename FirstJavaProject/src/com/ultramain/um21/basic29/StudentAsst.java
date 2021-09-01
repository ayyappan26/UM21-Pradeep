package com.ultramain.um21.basic29;
import com.ultramain.um21.basic29.StudentDTO;
public class StudentAsst{
	public void getStudentDetails(StudentDTO student){
		StudentDTO mystudent=null;
		if(student==null){
		mystudent=new StudentDTO();
		
	}
	else{
		mystudent=student;
	}
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the id");
	mystudent.setStudentId(scan.nextInt());
	System.out.println("enter the name");
	mystudent.setStudentId(scan.next());
	System.out.println("enter the dept");
	return mystudent;
	}
	public void printStudentDetails(StudentDTO student){
		if(student!=null){
			System.out.println("studentId"+student.getStudentId());
			System.out.println("studentName"+student.getStudentName());
			System.out.println("studentDept"+student.getStudentDept());
		}
	}
}

	
	
		