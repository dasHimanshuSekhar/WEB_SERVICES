package com.student_details.student_details.student;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class StudentDetailsResources {
	private StudentDatabase stdbms;

	public StudentDetailsResources(StudentDatabase stdbms) {
		super();
		this.stdbms = stdbms;
	}
	
	//GET /students-details
	@GetMapping(path = "/student-details")
	public List<StudentDetails> retriveAllStudentDetails(){
		return stdbms.findAllStudentDetails();
	}
	
	//GET /course-details
	@GetMapping(path = "/course-details")
	public List<CourseDetails> retriveAllCourseDetails(){
		return stdbms.findAllCourseDetails();
	}

//---------------------------------------------
	@DeleteMapping(path = "student-details/{rollNumber}")
	public StudentDetails deleteUserDetails(@PathVariable long rollNumber) {
		StudentDetails studentDetails = stdbms.deleteStudentDetails(rollNumber);
		if(studentDetails == null) {
			System.out.println("ERROR invalid roll number !!");
		}
		return studentDetails;
	}
	
	@DeleteMapping(path = "course-details/{courseId}")
	public CourseDetails deleteCourseDetails(@PathVariable long courseId) {
		CourseDetails courseDetails = stdbms.deleteCourseDetails(courseId);
		if(courseDetails == null) {
			System.out.println("ERROR invalid course id !!");
		}
		return courseDetails;
	}

//---------------------------------------------
	@PostMapping("/student-details")
	public void createStudentDetails(@RequestBody StudentDetails studentDetails) {
		System.out.println(studentDetails);
	}	
}