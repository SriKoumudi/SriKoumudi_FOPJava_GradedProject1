package com.glassignment_HRDep;

import com.glassignment.Super_Department;

public class HR_Department extends Super_Department {

	public String departmentName() {
		return "Welcome to HR Department";
	}

	public String getTodaysWork() {
		return "Fill today's timesheet and mark your attendance";
	}

	public String getworkDeadline() {
		return "Complete by EOD";
	}

	public String doActivity() {
		return "Team Lunch";
	}

}
