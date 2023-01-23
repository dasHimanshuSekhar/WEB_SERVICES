package com.student_details.student_details.student;

public class StudentDetails {
	private String studentName, gender;
	private long rollNumber, mobileNumber;
	private int age;
	
	
	
	public StudentDetails(String studentName, String gender, long rollNumber, long mobileNumber, int age) {
		super();
		this.studentName = studentName;
		this.gender = gender;
		this.rollNumber = rollNumber;
		this.mobileNumber = mobileNumber;
		this.age = age;
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(long rollNumber) {
		this.rollNumber = rollNumber;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "StudentDetails [studentName=" + studentName + ", gender=" + gender + ", rollNumber=" + rollNumber
				+ ", mobileNumber=" + mobileNumber + ", age=" + age + "]";
	}
	
		
}
