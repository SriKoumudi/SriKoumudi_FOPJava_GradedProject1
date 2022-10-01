package com.glassignment_main;

import com.glassignment.Super_Department;
import com.glassignment_Admin_Department.Admin_Department;
import com.glassignment_HRDep.HR_Department;
import com.glassignment_Tech_Department.Tech_Department;

public class Main {
	public static void main(String[] args) {
		//Super_Department super = new Super_Department();
		Admin_Department admin = new Admin_Department();
		System.out.println(admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getworkDeadline());
		System.out.println(admin.isTodayHoliday());
		HR_Department h = new HR_Department();
		System.out.println(h.departmentName());
		System.out.println(h.doActivity());
		System.out.println(h.getTodaysWork());
		System.out.println(h.getworkDeadline());
		System.out.println(h.isTodayHoliday());
		Tech_Department t = new Tech_Department();
		System.out.println(t.departmentname());
		System.out.println(t.getTodaysWork());
		System.out.println(t.getworkDeadline());
		System.out.println(t.getTechStackInformation());
		System.out.println(t.isTodayHoliday());
	}

}
