package com.ultramain.um21.studentdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Scanner;

public class EmployeeDao {
	public HashMap<Integer,EmployeeDto> viewEmployees() throws SQLException{
		Connection con= DataConnect.getDbConnection();
		HashMap<Integer,EmployeeDto> empmap=new HashMap<Integer,EmployeeDto>();
		String sqlQuery="SELECT * FROM emp";
		PreparedStatement pst=con.prepareStatement(sqlQuery);
		ResultSet rs=pst.executeQuery();
		EmployeeDto empdto=null;
		int employeeId;
		while(rs.next()){
			empdto=new EmployeeDto();
			employeeId=rs.getInt(1);
			empdto.setEmpid(rs.getInt(1));
			empdto.setFirstName(rs.getString(2));
			empdto.setLastName(rs.getString(3));
			empdto.setSalary(rs.getFloat(4));
			empdto.setMobile(rs.getInt(5));
			empdto.setDepartment(rs.getString(6));
			empmap.put(employeeId, empdto);
			}
		return empmap;
	}
	public HashMap<Integer,EmployeeDto> viewOneEmployees() throws SQLException{
		Scanner scan=Scan.getScannerInstance();
		HashMap<Integer,EmployeeDto> empmap=new HashMap<Integer,EmployeeDto>();
		EmployeeDto empdto= new EmployeeDto();
		System.out.println("Enter Employee ID :");
		int b=scan.nextInt();
		Connection con= DataConnect .getDbConnection();
		String sql="SELECT Employeeid,First_name,Last_name,Salary,Mobile,Department FROM emp WHERE Employeeid=?";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setInt(1, b);
		ResultSet rs=pst.executeQuery();
		rs.next();
		empdto.setEmpid(rs.getInt(1));
		empdto.setFirstName(rs.getString(2));
		empdto.setLastName(rs.getString(3));
		empdto.setSalary(rs.getFloat(4));
		empdto.setMobile(rs.getInt(5));
		empdto.setDepartment(rs.getString(6));
		empmap.put(b, empdto);
		return empmap;
	}
	public void printDetails(HashMap<Integer,EmployeeDto> resultMap){
		for(Integer key : resultMap.keySet() ) {
			System.out.println("Employee ID            : "+ key);
			System.out.println("Employee First Name    : "+((EmployeeDto) resultMap.get(key)).getFirstName());
			System.out.println("Employee Last Name     : "+((EmployeeDto) resultMap.get(key)).getLastName());
			System.out.println("Employee Salary        : "+((EmployeeDto) resultMap.get(key)).getSalary());
			System.out.println("Employee Mobile No.    : "+((EmployeeDto) resultMap.get(key)).getMobile());
			System.out.println("Employee Department    :"+((EmployeeDto) resultMap.get(key)).getDepartment());
			System.out.println("-----------------------------------------");
	}

}
}


