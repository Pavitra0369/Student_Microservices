package com.gaurav.student.service.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gaurav.student.service.entities.Student;
import com.gaurav.student.service.services.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	// create students
	@PostMapping("/students")
	public ResponseEntity<Student> createStudent(Student student){
		Student createStudent = studentService.createStudent(student);
		return ResponseEntity.status(HttpStatus.CREATED).body(createStudent);
	}
	
	// get all students
	@GetMapping("/students")
	public ResponseEntity<List<Student>> getAllStudent(){
		List<Student> allStudent = studentService.getAllStudent();
		return ResponseEntity.ok(allStudent);
	}
	
	// get single student
	@GetMapping("/students/{studentId}")
	public ResponseEntity<Student> getSingleStudent(Integer studentId){
		Student singleStudent = studentService.getSingleStudent(studentId);
		return ResponseEntity.ok(singleStudent);
	}
	
	// update student
	@PutMapping("/students/{studentId}")
	public ResponseEntity<Student> updateStudent(Student student, Integer studentId){
		Student updateStudent = studentService.updateStudent(student, studentId);
		return ResponseEntity.status(HttpStatus.CREATED).body(updateStudent);
	}
	
	// delete student
	@DeleteMapping("/students/{studentId}")
	public void deleteStudent(Integer studentId) {
		studentService.deleteStudent(studentId);
	}
	
	
	
}
