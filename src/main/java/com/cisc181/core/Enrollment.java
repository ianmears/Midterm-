package com.cisc181.core;

import java.util.UUID;

public class Enrollment {

	private String SectionID;
	private String StudentID;
	private String EnrollmentID;
	private double Grade;
	
	private Enrollment() {
		
	}
	
	public Enrollment(String StudentID, String SectionID, String EnrollmentID, double Grade) {
	
		this.StudentID = StudentID;
		this.SectionID =SectionID;
		this.EnrollmentID = EnrollmentID;
		this.Grade = Grade;
		
		
	}

	public void setGrade(double grade) {
		Grade = grade;
	}
}
