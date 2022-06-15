package com.greatlarning.Tech;

import com.greatlarning.Super.*;

public class Tech_Department extends Super_Department {


	/**
	 * )  departmentName 
              ii)  getTodaysWork  
              iii) getWorkDeadline
              iv) getTechStackInformation


	 */
	String TechStackInformation;

	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}
	public void setTodaysWork(String todaysWork) {
		this.todaysWork = todaysWork;
	}
	public void setWorkdedline(String workdedline) {
		this.workdedline = workdedline;
	}

	public void setTechStackInformation(String techStackInformation) {
		TechStackInformation = techStackInformation;
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
	public String getTechStackInformation() {
		return TechStackInformation;
}
