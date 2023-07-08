package com.gaurav.teacher.service.services;

import java.util.List;

import com.gaurav.teacher.service.entitites.Teacher;

public interface TeacherService {
	
	// create teacher
	Teacher createTeacher(Teacher teacher);
	
	// get all teacher
	List<Teacher> getAllTeacher();
	
	// get single teacher 
	Teacher getSingleTeacher(Integer teacherId);
	
	// update teacher
	Teacher updateTeacher(Teacher teacher, Integer teacherId);
	
	// delete teacher
	void deleteTeacher(Integer teacherId);
}
