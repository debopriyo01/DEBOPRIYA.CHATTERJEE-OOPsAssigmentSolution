package com.greatlarning.Admin;

import com.greatlarning.Super.Super_Department;

public class Admin_Department extends Super_Department {

	/**
	 *                i)  departmentName 
              ii)  getTodaysWork  
              iii) getWorkDeadline
              

	 */
	
	public void setDepartmentname(String d) {
		departmentname = d;
	}
	public void setTodaysWork(String t) {
		todaysWork=t;
	}
	public void setWorkdedline(String w) {
		workdedline=w;
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
}