package com.greatlarning.Super;

public class Super_Department {

	String departmentname;
	String todaysWork;
	String workdedline;
	static  String TodayHoliday;
	
	
	
	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}
	public void setTodaysWork(String todaysWork) {
		this.todaysWork = todaysWork;
	}
	public void setWorkdedline(String workdedline) {
		this.workdedline = workdedline;
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
	
	public static String  getTodayHoliday(){
		
		 TodayHoliday="Today is not a Holiday";
		 
		 return  TodayHoliday;
}
}