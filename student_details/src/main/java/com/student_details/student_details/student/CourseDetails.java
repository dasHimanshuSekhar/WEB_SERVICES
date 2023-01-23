package com.student_details.student_details.student;

public class CourseDetails {
	private String courseName, courseMentorName, courseDuration;
	private long mentorMobileNumber;
	private int mentorAge, courseId;
	
	
	public CourseDetails(String courseName, String courseMentorName, String courseDuration, long mentorMobileNumber,
			int mentorAge, int courseId) {
		super();
		this.courseName = courseName;
		this.courseMentorName = courseMentorName;
		this.courseDuration = courseDuration;
		this.mentorMobileNumber = mentorMobileNumber;
		this.mentorAge = mentorAge;
		this.courseId = courseId;
	}
	
	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseMentorName() {
		return courseMentorName;
	}
	public void setCourseMentorName(String courseMentorName) {
		this.courseMentorName = courseMentorName;
	}
	public String getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}
	public long getMentorMobileNumber() {
		return mentorMobileNumber;
	}
	public void setMentorMobileNumber(long mentorMobileNumber) {
		this.mentorMobileNumber = mentorMobileNumber;
	}
	public int getMentorAge() {
		return mentorAge;
	}
	public void setMentorAge(int mentorAge) {
		this.mentorAge = mentorAge;
	}
	
	@Override
	public String toString() {
		return "CourseDetails [courseName=" + courseName + ", courseMentorName=" + courseMentorName
				+ ", courseDuration=" + courseDuration + ", mentorMobileNumber=" + mentorMobileNumber + ", mentorAge="
				+ mentorAge + ", courseId=" + courseId + "]";
	}
	
	
	
	
}
