package com.assignment.Q4;

public class Department {

	private int departmentId; 
	private String departmentName;
	
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	} 
	
	public Department()
	{
		
	}
	
	public Department(int departmentId,String departmentName)
	{
		this.departmentId=departmentId;
		this.departmentName=departmentName;
	}
	
	
}
