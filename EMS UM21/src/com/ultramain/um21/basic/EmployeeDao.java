package com.ultramain.um21.basic;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeDao {
	
	public void registerEmployee(EmployeeDTO empDto) throws SQLException{
		Connection con = DataConnect.getDbConnection();
		
		String sql = "INSERT INTO emp  VALUES(?,?,?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1, empDto.getEmpId());
		pst.setString(2, empDto.getFirstName());
		pst.setString(3, empDto.getLastName());
		pst.setFloat(4, empDto.getSalary());
		pst.setInt(5, empDto.getMobile());
		pst.setString(6, empDto.getDept());
		int rowsUpdated = pst.executeUpdate();
		
		System.out.println("Rows Updated :" + rowsUpdated);
	   
   }
	public void viewEmployees() throws SQLException{
		Connection con = DataConnect.getDbConnection();
		String sqlQuery = "SELECT * FROM emp";
		PreparedStatement pst = con.prepareStatement(sqlQuery);
		ResultSet rs = pst.executeQuery(sqlQuery);
		
		int empId;
		String firstName;
		String lastName;
		float salary;
		int mobile;
		String dept;
		
		while(rs.next()){
			empId = rs.getInt(1);
			firstName = rs.getString(2);
			lastName = rs.getString(3);
			salary = rs.getFloat(4);
			mobile = rs.getInt(5);
			dept = rs.getString(6);
			
			System.out.println("Employee id : " + empId);
			System.out.println("First Name : " + firstName);
			System.out.println("Last Name : " + lastName);
			System.out.println("Salary : " + salary);
			System.out.println("Mobile : " + mobile);
			System.out.println("Department : " +  dept);
			System.out.println("----------------------------------");
		}
	}
		
		public void viewOneEmp() throws SQLException {
		     Scanner scan=Scan.getScannerInstance();
		    System.out.println("Enter Employee ID :");
		    int a=scan.nextInt();
			Connection con = DataConnect.getDbConnection();
			String sqlQry = "select employeeid,first_name,last_name,salary,mobile,department from emp where employeeid=?";
			PreparedStatement pst = con.prepareStatement(sqlQry);
			pst.setInt(1, a);
			ResultSet rs = pst.executeQuery();

	        int empId;
			String firstName;
			String lastName;
			float salary;
			int mobile;
			String dept;

			while (rs.next()) {
				empId = rs.getInt(1);
				firstName = rs.getString(2);
				lastName = rs.getString(3);
				salary = rs.getFloat(4);
				mobile = rs.getInt(5);
				dept = rs.getString(6);

				System.out.println("Employee id : " + empId);
				System.out.println("First Name : " + firstName);
				System.out.println("Last Name : " + lastName);
				System.out.println("Salary : " + salary);
				System.out.println("Mobile : " + mobile);
				System.out.println("Department : " + dept);
				System.out.println("----------------------------------");
			}
		}
		public void updateEmployee(EmployeeDTO empDto) throws SQLException{
			System.out.println("Enter the Employee id to be modified");
			Scanner scan = Scan.getScannerInstance();
			int empId = scan.nextInt();
			Connection con = DataConnect.getDbConnection();
			String updateQuery = "update emp set first_name=?,last_name=?, salary=?,mobile=?,department=? where employeeid=?";
			PreparedStatement pst = con.prepareStatement(updateQuery);
			pst.setString(1, empDto.getFirstName());
			pst.setString(2, empDto.getLastName());
			pst.setFloat(3, empDto.getSalary());
			pst.setInt(4, empDto.getMobile());
			pst.setString(5, empDto.getDept());
			pst.setInt(6, empDto.getEmpId());
			int rowsUpdated = pst.executeUpdate();

			System.out.println("Rows Updated :" + rowsUpdated);
		}
		public void deleteEmployee() throws SQLException {
		     Scanner scan=Scan.getScannerInstance();
		    System.out.println("Enter Employee ID :");
		    int b=scan.nextInt();
			Connection con = DataConnect.getDbConnection();
			String sqlQry = "delete from emp where employeeid=?";
			PreparedStatement pst = con.prepareStatement(sqlQry);
			pst.setInt(1, b);
			int rowsUpdated = pst.executeUpdate();
			
			System.out.println("Records Deleted successfully : " + rowsUpdated);
		}
		


}

