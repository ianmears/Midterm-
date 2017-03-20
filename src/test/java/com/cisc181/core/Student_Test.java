package com.cisc181.core;

import static org.junit.Assert.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;
import com.cisc181.eNums.eTitle;

public class Student_Test {
	

	@BeforeClass
	public static void setup() throws PersonException {
		ArrayList<Course> courses = new ArrayList<Course>();
		courses.add(new Course("Apec101",3,eMajor.BUSINESS));
		courses.add(new Course("Cisc181",3,eMajor.COMPSI));
		courses.add(new Course("phys207",4,eMajor.PHYSICS));
		
		Date fBegin = (Date) new GregorianCalendar(2016, Calendar.AUGUST, 28).getTime();
		Date fEnd = (Date) new GregorianCalendar(2016, Calendar.DECEMBER, 18).getTime();
		Date sBegin = (Date) new GregorianCalendar(2017, Calendar.FEBRUARY, 3).getTime();
		Date sEnd = (Date) new GregorianCalendar(2017, Calendar.MAY, 18).getTime();
		ArrayList<Semester> semester = new ArrayList<Semester>();
		semester.add(new Semester("Fall",fBegin,fEnd));
		semester.add(new Semester("Spring",sBegin,sEnd));
		
		
		ArrayList<Section> section = new ArrayList<Section>();
		section.add(new Section("Cisc181","Fall 2016","011",110));
		section.add(new Section("Cisc181","Spring 2016","011",110));
		section.add(new Section("Apec101","Fall 2016","006",100));
		section.add(new Section("Apec101","Spring 2016","006",110));
		section.add(new Section("Phys207","Fall 2016","014",97));
		section.add(new Section("Phys207","Spring 2016","014",97));
		
		ArrayList<Student> student = new ArrayList<Student>();
		
		Date dob1 = (Date) new GregorianCalendar(1997, Calendar.FEBRUARY, 11).getTime();
		Student person1 = new Student("Ian","John","Rae",dob1, eMajor.CHEM, "22 Blue Drive",
				"(610)-377-9926","iRae@udel.edu");
		Date dob2 = (Date) new GregorianCalendar(1997, Calendar.JULY, 8).getTime();
		Student person2 = new Student("Matt","John","Stuart",dob2, eMajor.PHYSICS, "1 Carriage Lane",
				"(610)-888-9436","mJohn@udel.edu");
		Date dob3 = (Date) new GregorianCalendar(1997, Calendar.AUGUST, 17).getTime();
		Student person3 = new Student("Aaron","Eric","Reynolds",dob3, eMajor.COMPSI, "2 Meadow Lane",
				"(610)-999-0364","AER@udel.edu");
		Date dob4 = (Date) new GregorianCalendar(1997, Calendar.SEPTEMBER, 28).getTime();
		Student person4 = new Student("Sarah","Mariah","Smith",dob4, eMajor.BUSINESS, "4 Black lane",
				"(888)-999-5353","SMS@udel.edu");
		Date dob5 = (Date) new GregorianCalendar(1997, Calendar.OCTOBER, 14).getTime();
		Student person5 = new Student("Karen","Luise","Jaques",dob5, eMajor.PHYSICS, "6 Blue lane",
				"(333)-999-6384","KLJ@udel.edu");
		Date dob6 = (Date) new GregorianCalendar(1997, Calendar.DECEMBER, 16).getTime();
		Student person6 = new Student("Megan","Olivia","Cons",dob6, eMajor.NURSING, "9 Green lane",
				"(999)-999-7474","MOC@udel.edu");
		Date dob7 = (Date) new GregorianCalendar(1997, Calendar.SEPTEMBER, 28).getTime();
		Student person7 = new Student("Erin","Jessica","Granger",dob7, eMajor.CHEM, "99 White lane",
				"(983)-456-7558","EJG@udel.edu");
		Date dob8 = (Date) new GregorianCalendar(1997, Calendar.SEPTEMBER, 28).getTime();
		Student person8 = new Student("Kelly","Lillian","Macdonald",dob8, eMajor.BUSINESS, "855 Purple lane",
				"(757)-947-0374","KLM@udel.edu");
		Date dob9 = (Date) new GregorianCalendar(1997, Calendar.SEPTEMBER, 28).getTime();
		Student person9 = new Student("Neil","Eli","Goldaman",dob9, eMajor.BUSINESS, "7 Black lane",
				"(999)-999-9999","NEG@udel.edu");
		Date dob10 = (Date) new GregorianCalendar(1997, Calendar.SEPTEMBER, 28).getTime();
		Student person10 = new Student("Lainey","Elizabeth","Buck",dob10, eMajor.COMPSI, "19 Orange lane",
				"(756)-899-435t","LEB@udel.edu");
		student.add(person1);
		student.add(person2);
		student.add(person3);
		student.add(person4);
		student.add(person5);
		student.add(person6);
		student.add(person7);
		student.add(person8);
		student.add(person9);
		student.add(person10);
		
		
		
		
		
		

		
	}

	@Test
	public void test() {
		
		ArrayList<Enrollment> enrollment = new ArrayList<Enrollment>();
		Enrollment person1 = new Enrollment("Chem","208665789","106",89.5);
		Enrollment person2 = new Enrollment("Physics","846735647","207",82.3);
		Enrollment person3 = new Enrollment("Compsi","746536748","181",94.2);
		Enrollment person4 = new Enrollment("Business","098645763","103",91.0);
		Enrollment person5 = new Enrollment("Physics","756747656","207",76.9);
		Enrollment person6 = new Enrollment("Nursing","098456324","203",88.8);
		Enrollment person7 = new Enrollment("Chem","208665789","106",79.6);
		Enrollment person8 = new Enrollment("Business","039467570","103",99.4);
		Enrollment person9 = new Enrollment("Business","756746736","103",77.6);
		Enrollment person10 = new Enrollment("Cisc","946735465","181",71.5);
		
		double sumGPA = 89.5+82.3+94.2+91.0+76.9+88.8+79.6+99.4+77.6+71.5;
		double avgGPA = sumGPA/10;
		assertEquals(avgGPA, 85.08);
	}
	
}