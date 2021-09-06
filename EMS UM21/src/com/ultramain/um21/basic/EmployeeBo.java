package com.ultramain.um21.basic;

import java.sql.SQLException;
import java.util.Scanner;


public class EmployeeBo {
	public void empSystem() {
		int choice = 0;
		Scanner scan = Scan.getScannerInstance();
		EmployeeDao dao = new EmployeeDao();
		do {
			System.out.println("Welcome to the employee management system");
			System.out.println("1. Register Employee");
			System.out.println("2. View Employee");
			System.out.println("3. Exit");
			System.out.println("Enter your Choice: ");
			choice = scan.nextInt();
		} while (choice == 0);

		switch (choice) {
		case 1:
			registerEmployee(dao);
			break;
		case 2:
			viewEmployees(dao);
			break;
		case 3:
			return;
		}
	}

	public void registerEmployee(EmployeeDao dao) {
		EmployeeDTO empDto = getEmpDetails();
		try {
			dao.registerEmployee(empDto);

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public void viewEmployees(EmployeeDao dao) {
		try {
			dao.viewEmployees();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}
	
	


	private EmployeeDTO getEmpDetails(){
		Scanner scan = Scan.getScannerInstance();
		EmployeeDTO empDto = new EmployeeDTO();
		System.out.println("Enter Employee Id: ");
		empDto.setEmpId(scan.nextInt());
		System.out.println("Enter First Name : ");
		empDto.setFirstName(scan.next());
		System.out.println("Enter Last Name : ");
		empDto.setLastName(scan.next());
		System.out.println("Enter Salary : ");
		empDto.setSalary(scan.nextFloat());
		System.out.println("Enter Mobile : ");
		empDto.setMobile(scan.nextInt());
		System.out.println("Enter Department : ");
		empDto.setDept(scan.next());		
		return empDto;
		
	}
	
}
	