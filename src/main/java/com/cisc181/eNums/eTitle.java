package com.cisc181.eNums;

public enum eTitle {
	MR() {
	public String toString() {
		return "Mr. ";
	}
}, 
	MRS() {
		public String toString() {
			return "Mrs. ";
	}
},  MS() {
	public String toString() {
		return "Ms. ";
	}
},  DOCTOR() {
	public String toString() {
		return "Dr. ";
	}
},  PROFESSOR() {
	public String toString() {
		return "Professor ";
	}
},  SIR() {
	public String toString() {
		return "Sir ";
	}
}
}
