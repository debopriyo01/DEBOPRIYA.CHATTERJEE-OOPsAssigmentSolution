package com.greatlarning;

import com.greatlarning.Admin.*;
import com.greatlarning.HumanResorce.*;
import com.greatlarning.Tech_team.*;
import com.greatlarning.Super.*;
public class Driver {

	public static void main(String[] args) {
		
		Admin_Department Admin=new Admin_Department();
		Hr_Department HR=new Hr_Department();
		Tech_Department Tech=new Tech_Department();
		
	
		
		Admin.setDepartmentName("Admin Department ");
		Admin.setGetTodaysWork("Complete your documents Submission");
		Admin.setGetWorkDeadline("Complete by EOD");
		
		
		HR.setDepartmentName("HR Department ");
		HR.setGetTodaysWork("Fill today’s worksheet and mark your attendance");
		HR.setGetWorkDeadline("Complete by EOD ");
		HR.setDoActivity("team Lunch");
		
		
		Tech.setDepartmentName("Tech Department ");
		Tech.setGetTodaysWork("Complete coding of module 1");
		Tech.setGetWorkDeadline("Complete by EOD");
		Tech.setTechStackInformation("core Java");
		
		System.out.println("Welcome to " +Admin.getDepartmentName());
		System.out.println(Admin.getTodaysWork());
		System.out.println(Admin.getWorkDeadline());
		System.out.println(Super_Department .getIsTodayAHoliday());
		
		System.out.println();
		
		System.out.println("Welcome to " +HR.DepartmentName());
		System.out.println(HR.getTodaysWork());
		System.out.println(HR.getWorkDeadline());
		System.out.println(HR.getDoActivity());
		System.out.println(Super_Department .getIsTodayAHoliday());
		
		System.out.println();
		
		System.out.println("Welcome to " +Tech.getDepartmentName());
		System.out.println(Tech.getTodaysWork());
		System.out.println(Tech.getWorkDeadline());
		System.out.println(Tech.getTechStackInformation());
		System.out.println(Super_Department .getIsTodayAHoliday());
		
		
		
		
		
	}

}
