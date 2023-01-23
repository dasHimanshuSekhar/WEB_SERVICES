package com.student_details.student_details.student;

import java.util.ArrayList;
//import java.util.List;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class StudentDatabase {
	private static List<StudentDetails> studentsDetails = new ArrayList<StudentDetails>();
	private static List<CourseDetails> courseDetails = new ArrayList<CourseDetails>();
	
	static {
		studentsDetails.add(new StudentDetails("Himanshu Sekhar Das", "Male", 1902081065L,
				8018394576L, 23));
		
		courseDetails.add(new CourseDetails("JAVA_WEB_SERVICES", "Sumanta Sahoo", "2_weeks", 9234846387L, 26, 123));
	}

	public List<StudentDetails> findAllStudentDetails() {
		return studentsDetails;
	}

	public List<CourseDetails> findAllCourseDetails() {
		return courseDetails;
	}

	public StudentDetails deleteStudentDetails(long rollNumber) {
		for(int i = 0; i < studentsDetails.size(); i ++) {
			if(rollNumber == studentsDetails.get(i).getRollNumber()) {
				studentsDetails.remove(i);
				return studentsDetails.get(i);
			}
		}
		
		
		return null;
	}

	public CourseDetails deleteCourseDetails(long courseId) {
		for(int i = 0; i < courseDetails.size(); i ++) {
			if(courseId == courseDetails.get(i).getCourseId()) {
				courseDetails.remove(i);
				return courseDetails.get(i);
			}
		}
		return null;
	}
	
}
