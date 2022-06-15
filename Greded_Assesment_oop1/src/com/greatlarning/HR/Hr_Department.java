package com.greatlarning.HR;


import com.greatlarning.Super.Super_Department;
public class Hr_Department extends Super_Department {

	/**
	 *                i)  departmentName 
              ii)  getTodaysWork  
              iii) getWorkDeadline

	 */
	String doActivity;
	     
	public void setdepartmentname(String departmentName) {
		
		this.departmentname=departmentName;
	}
	
	public void setTodaysWork(String todaysWork) {
		this.todaysWork = todaysWork;
	}
	public void setWorkdedline(String workdedline) {
		this.workdedline = workdedline;
	}
		
	public void setDoActivity(String doActivity) {
		this.doActivity = doActivity;
	}

public String departmentName() {
		
		return departmentname;
	}

	public String gettodaysWork() {
		
		return todaysWork;
	}
	
	public String getWorkDeadline() {
		return workdedline;
		
	}
	
	public String getDoActivity() {
		return doActivity;
}
}