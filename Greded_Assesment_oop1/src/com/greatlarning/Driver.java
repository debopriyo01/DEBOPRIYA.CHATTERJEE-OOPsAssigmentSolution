package com.greatlarning;

public class Driver extends  Super_Department{

	public static void main(String[] args) {
		
	
		
		Hr_Department detailsHR=new Hr_Department();
		Admin_Department detailsAD=new Admin_Department();
		Tech_Department  detailsTECH=new Tech_Department();
		
		detailsAD.setDepartmentname("Admin Department");
		detailsAD.setTodaysWork("Complete your documents submission");
		detailsAD.setWorkdedline("Complete by EOD ");
		
		
		System.out.println("Welcome to " +detailsAD.departmentName());
		System.out.println(detailsAD.gettodaysWork());
		System.out.println(detailsAD.getWorkDeadline());
		System.out.println(detailsAD.getTodayHoliday());
		
		System.out.println();
		detailsHR.setdepartmentname("HR Department ");
		detailsHR.setTodaysWork("Fill today’s worksheet and mark your attendance");
		detailsHR.setWorkdedline("Complete by EOD");
		detailsHR.setDoActivity("team Lunch");
		
		System.out.println("Welcome to " +detailsHR.departmentName());
		System.out.println(detailsHR.getDoActivity());
		System.out.println(detailsHR.gettodaysWork());
		System.out.println(detailsHR.getWorkDeadline());
		System.out.println(detailsHR.getTodayHoliday());
		
        System.out.println();
		
		detailsTECH.setDepartmentname("Tech Department ");
		detailsTECH.setTodaysWork("Complete coding of module 1");
		detailsTECH.setWorkdedline("Complete by EOD ");
		detailsTECH.setTechStackInformation("core Java");
		
		System.out.println("Welcome to " +detailsTECH.departmentName());
		System.out.println(detailsTECH.gettodaysWork());
		System.out.println(detailsTECH.getWorkDeadline());
		System.out.println(detailsTECH.getTechStackInformation());
		System.out.println(detailsTECH.getTodayHoliday());
		
		
	}

}
