package com.gaurav.student.service.services;

import java.util.List;

import com.gaurav.student.service.entities.Student;

public interface StudentService {
	// create student
	Student createStudent(Student student);
	
	// get all student
	List<Student> getAllStudent();
	
	// get single student
	Student getSingleStudent(Integer studentId);
	
	// update student
	Student updateStudent(Student student, Integer studentId);
	
	// delete student
	void deleteStudent(Integer studentId);
	
	
}
