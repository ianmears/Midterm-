package com.cisc181.core;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import org.junit.BeforeClass;
import org.junit.Test;
import com.cisc181.eNums.eTitle;


public class Staff_Test {
	
	//Date dob1 = (Date) new GregorianCalendar(1990, Calendar.FEBRUARY, 11).getTime();
	//Date hire1 = (Date) new GregorianCalendar(2010, Calendar.MARCH, 19).getTime();
	//Staff person1 = new Staff("Mary","Anne","Lawrence",dob1, "55 State Street",
			//"(610)-377-9926","mlawrence@udel.edu","MWF 7-9",5,107889.0,hire1,eTitle.MRS);
	
	//Date dob2 = (Date) new GregorianCalendar(1986, Calendar.APRIL, 22).getTime();
	//Date hire2 = (Date) new GregorianCalendar(2006, Calendar.MARCH, 29).getTime();
	//Staff person2 = new Staff("John","Paul","Jones",dob2, "93 Spooner Street",
			//"(998)-223-5546","jpj@udel.edu","TR 4-6",4,150987.0,hire2,eTitle.MR);
	
	//Date dob3 = (Date) new GregorianCalendar(1976, Calendar.JUNE, 22).getTime();
	//Date hire3 = (Date) new GregorianCalendar(2000, Calendar.JULY, 29).getTime();
	//Staff person3 = new Staff("Max","John","Mcarthy",dob3, "999 Stirling Way",
			//"(222)-333-4444","mjm@udel.edu","TR 12-2",3,98657.0,hire3,eTitle.MR);
	
	//Date dob4 = (Date) new GregorianCalendar(1968, Calendar.DECEMBER, 2).getTime();
	//Date hire4 = (Date) new GregorianCalendar(1997, Calendar.FEBRUARY, 12).getTime();
	//Staff person4 = new Staff("Mathew","Ray","Silver",dob4, "88 Constitution Drive",
			//"(998)-456-8374","mrs@udel.edu","mwf 8-10",2,160926.0,hire4,eTitle.MR);
	
	//Date dob5 = (Date) new GregorianCalendar(1993, Calendar.SEPTEMBER, 2).getTime();
	//Date hire5 = (Date) new GregorianCalendar(2009, Calendar.NOVEMBER, 10).getTime();
	//Staff person5 = new Staff("Ben","Eric","Johns",dob5, "66 Blue Stone Drive",
			//"(667)-475-9836","bej@udel.edu","MWF 12-2",1,77908.0,hire5,eTitle.MR);
	
	
	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void testSalary() throws Exception{
		ArrayList<Staff> staffMembers = new ArrayList<Staff>();
		
		staffMembers.add(new Staff("Mary","Anne","Lawrence",
				(Date) new GregorianCalendar(1990, Calendar.FEBRUARY, 11).getTime(), 
				"55 State Street", "(610)-377-9926","mlawrence@udel.edu","MWF 7-9",
				5,107889.0,(Date) new GregorianCalendar(2010, Calendar.MARCH, 19).getTime(),
				eTitle.MRS));
		staffMembers.add(new Staff("John","Paul","Jones",
				(Date) new GregorianCalendar(1986, Calendar.APRIL, 22).getTime(), 
				"93 Spooner Street","(998)-223-5546","jpj@udel.edu","TR 4-6",
				4,150987.0,(Date) new GregorianCalendar(2006, Calendar.MARCH, 29).getTime(),
				eTitle.MR));
		staffMembers.add(new Staff("Mathew","Ray","Silver",
				(Date) new GregorianCalendar(1997, Calendar.FEBRUARY, 12).getTime(), 
				"88 Constitution Drive","(998)-456-8374","mrs@udel.edu","mwf 8-10",
				2,160926.0,(Date) new GregorianCalendar(1997, Calendar.FEBRUARY, 12).getTime(),
				eTitle.MR));
		staffMembers.add(new Staff("Ben","Eric","Johns",
				(Date) new GregorianCalendar(1993, Calendar.SEPTEMBER, 2).getTime(), 
				"66 Blue Stone Drive","(667)-475-9836","bej@udel.edu","MWF 12-2",1,
				77908.0,(Date) new GregorianCalendar(2009, Calendar.NOVEMBER, 10).getTime(),
				eTitle.MR));
		
		double sum=0;
		for(Staff s : staffMembers){
			sum+=s.getSalary();
		}
		double avgSalary = sum/5;
		
		assertEquals(avgSalary,119273.4);
	}
	
	@Test
	public void testDOB() throws Exception{
		try {
			Date dob1 = (Date) new GregorianCalendar(1889, Calendar.FEBRUARY, 11).getTime();
			Date hire1 = (Date) new GregorianCalendar(2010, Calendar.MARCH, 19).getTime();
			Staff person1 = new Staff("Mary","Anne","Lawrence",dob1, "55 State Street",
					"(610)-377-9926","mlawrence@udel.edu","MWF 7-9",5,107889.0,hire1,eTitle.MRS);
			}
			catch (PersonException e) {
			   
				throw new PersonException("Invalid Date of Birth");
			}
	}
	
	public void testPhoneNumber() throws Exception{
		try {
			Date dob1 = (Date) new GregorianCalendar(1889, Calendar.FEBRUARY, 11).getTime();
			Date hire1 = (Date) new GregorianCalendar(2010, Calendar.MARCH, 19).getTime();
			Staff person1 = new Staff("Mary","Anne","Lawrence",dob1, "55 State Street",
					"(610)-377-9926","mlawrence@udel.edu","MWF 7-9",5,107889.0,hire1,eTitle.MRS);
			}
			catch (PersonException e) {
			   
				throw new PersonException("Invalid Phone Number Syntax");
			}
	}
}

