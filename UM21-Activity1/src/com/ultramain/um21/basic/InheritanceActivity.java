package com.ultramain.um21.basic;

public class InheritanceActivity {

	public static void main(String arg[]) {
		Manager mymanager = new Manager(126534, "Peter", "Chennai India", 237844, 65000);
		Trainee mytrainee = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);
		System.out.println("Salary of the Manager:");
		mymanager.calculateSalary();
		System.out.println("Salary of the Trainee:");
		mytrainee.calculateSalary();
		mytrainee.transportAllowance(mytrainee.basicSalary);
		mymanager.transportAllowance(mymanager.basicSalary);

	}

} 
class Employee {
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowance = 250.80;
	double hra = 1000.50;

	public Employee() {

	}

	public Employee(long id, String name, String address, long phone) {
		employeeId = id;
		employeeName = name;
		employeeAddress = address;
		employeePhone = phone;
	}

	public void calculateSalary() {
		double salary;
		salary =basicSalary+ (basicSalary * specialAllowance / 100) + (basicSalary * hra / 100);
		System.out.println(salary);
	}

	public void transportAllowance(double salary) {
		double defaulttransport;
		defaulttransport = (10 * salary) / 100;
		System.out.println("Transport Allowance of Trainee  :" + defaulttransport);
	}
}

class Manager extends Employee {
	public Manager() {

	}

	public Manager(int id, String name, String address, long phone, long salary) {
		employeeId = id;
		employeeName = name;
		employeeAddress = address;
		employeePhone = phone;
		basicSalary = salary;
	}

	public void transportAllowance(double salary) {
		double defaulttransport;
		defaulttransport = (15 * salary) / 100;
		System.out.println("Transport Allowance of Manager  :" + defaulttransport);
	}
}

class Trainee extends Employee {
	public Trainee() {

	}

	public Trainee(int id, String name, String address, long phone, long salary) {
		employeeId = id;
		employeeName = name;
		employeeAddress = address;
		employeePhone = phone;
		basicSalary = salary;
	}

	
}

