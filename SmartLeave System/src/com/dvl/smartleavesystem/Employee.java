package com.dvl.smartleavesystem;
import java.util.List;

public class Employee {
	
	private int id;
	private String name;
	private List<String>roles;
	private int leaveBalance;
	
	public Employee(int id, String name, List<String> roles, int leaveBalance) {
		this.name = name;
		this.roles = roles;
		this.id = id;
		this.leaveBalance = leaveBalance;
	}
	
	// Getter and Setters
	public int getId() {return id;}
	public String getName() {return name;}
	public String getRole() {return roles;}
	public int getLeaveBalance() {return leaveBalance;}
	
	
	public void setName(String name) {this.name = name;}
	public void setRole(String role) {this.roles = role;}
	public void setLeaveBalance(int leaveBalance) {this.leaveBalance = leaveBalance;}
	
	public void deductLeave(int days) {
		this.leaveBalance -= days;
	}

	
	public String toString() {
		return "Employee [ID=\" + id + \", Name=\" + name +  \", Role=\" + role + \"]";
			
	}
	
}