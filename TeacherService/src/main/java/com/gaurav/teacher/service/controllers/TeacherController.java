package com.gaurav.teacher.service.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gaurav.teacher.service.entitites.Teacher;
import com.gaurav.teacher.service.services.TeacherService;

@RestController
public class TeacherController {
	
	@Autowired
	private TeacherService teacherService;
	
	// create teacher
	@PostMapping("/teachers")
	public ResponseEntity<Teacher> createTeacher(Teacher teacher){
		Teacher createTeacher = teacherService.createTeacher(teacher);
		return ResponseEntity.status(HttpStatus.CREATED).body(createTeacher);
	}
	
	// get all teacher
	@GetMapping("/teachers")
	public ResponseEntity<List<Teacher>> getAllTeacher(){
		List<Teacher> allTeacher = teacherService.getAllTeacher();
		return ResponseEntity.ok(allTeacher);
	}
	
	// get single teacher
	@GetMapping("/teachers/{teacherId}")
	public ResponseEntity<Teacher> getSingleTeacher(@PathVariable Integer teacherId){
		Teacher singleTeacher = teacherService.getSingleTeacher(teacherId);
		return ResponseEntity.ok(singleTeacher);
	}
	
	// update teacher
	@PutMapping("/teachers/{teacherId}")
	public ResponseEntity<Teacher> updateTeacher(@RequestBody Teacher teacher, @PathVariable Integer teacherId){
		Teacher updateTeacher = teacherService.updateTeacher(teacher, teacherId);
		return ResponseEntity.status(HttpStatus.CREATED).body(updateTeacher);
	}
	
	
	// delete teacher
	@DeleteMapping("/teachers/{teacherId}")
	public void deleteTeacher(@PathVariable Integer teacherId) {
		teacherService.deleteTeacher(teacherId);
	}
}
