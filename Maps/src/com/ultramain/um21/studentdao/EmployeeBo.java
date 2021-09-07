package com.ultramain.um21.studentdao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Scanner;

public class EmployeeBo {

	public void empsystem(){
		int choice = 0;
		Scanner scan = Scan.getScannerInstance();
		EmployeeDao dao = new EmployeeDao();
		do {
			System.out.println("Welcome to the employee management system");
			System.out.println("1. View All Employee");
			System.out.println("2. View one Employee");
			System.out.println("Enter your Choice: ");
			choice = scan.nextInt();
		} while (choice == 0);
		
		switch (choice) {
		case 1:
			viewEmployees(dao);
			break;
		case 2:
            viewOneEmployees(dao);
			break;
		case 3:
			return;
		}
	}
	
public void viewEmployees(EmployeeDao dao) {
		try{
			HashMap<Integer,EmployeeDto> resultMap=new HashMap<Integer,EmployeeDto>();
			resultMap=dao.viewEmployees();
			dao.printDetails(resultMap);
			
		}catch (SQLException e){
			System.out.println(e.getMessage());
		}	
	}
public void viewOneEmployees(EmployeeDao dao) {
		try{
			HashMap<Integer,EmployeeDto> resultMap=new HashMap<Integer,EmployeeDto>();
			resultMap=dao.viewOneEmployees();
			dao.printDetails(resultMap);
		}catch (SQLException e){
			System.out.println(e.getMessage());
		}	
	}

}
