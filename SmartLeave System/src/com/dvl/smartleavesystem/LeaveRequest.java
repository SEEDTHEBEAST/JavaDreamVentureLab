package com.dvl.smartleavesystem;

import java.time.LocalDate;

public class LeaveRequest {

	private int employeeId;
	private LocalDate startDate;
	private LocalDate endDate;
	private String type; // sick  or vacation
	private int daysRequested;
	private boolean approved;
	
		
	public LeaveRequest(int employeeId, LocalDate startDate, LocalDate endDate, String type, int daysRequested, boolean approved) {
		super();
		this.employeeId = employeeId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.type = type;
		this.daysRequested = daysRequested;
		this.approved = approved;
		
	
	}


	public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public LocalDate getStartDate() {
		return startDate;
	}


	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}


	public LocalDate getEndDate() {
		return endDate;
	}


	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}
	
	public int getDaysRequested() {
		return daysRequested;
	}
//set

	public void setDaysRequested(int daysRequested) {
		this.daysRequested = daysRequested;
	}
	
	public boolean isApproved() {
		return approved;
	}
	
	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	
	public void approveLeave(Employee employee) {
		if (employee.getLeaveBalance() >= daysRequested) {
			approved = true;
			employee.deductLeave(daysRequested); // Deduct leave function can have it own algorithm for what or how many days are requested compared to the balance
			System.out.println("Leave requestn is approved have a good vacation"); 
				} else {
					System.out.println("You do not have enough balance to take a day off work harder next time.");
		}
		
	}
		
	
	
	@Override
	public String toString() {
		return "LeaveRequest [employeeId=" + employeeId + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", type=" + type + ", daysRequested=" + daysRequested + ", approved=" + approved + "]";
	}



	
	
}
