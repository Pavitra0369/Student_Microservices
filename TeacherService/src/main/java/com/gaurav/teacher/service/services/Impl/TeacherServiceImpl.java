package com.gaurav.teacher.service.services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gaurav.teacher.service.entitites.Teacher;
import com.gaurav.teacher.service.exception.ResourceNotFoundException;
import com.gaurav.teacher.service.repositories.TeacherRepository;
import com.gaurav.teacher.service.services.TeacherService;
@Service
public class TeacherServiceImpl implements TeacherService {

	@Autowired
	private TeacherRepository teacherRepository;
	
	@Override
	public Teacher createTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		return teacherRepository.save(teacher);
	}

	@Override
	public List<Teacher> getAllTeacher() {
		// TODO Auto-generated method stub
		return teacherRepository.findAll();
	}

	@Override
	public Teacher getSingleTeacher(Integer teacherId) {
		// TODO Auto-generated method stub
		return teacherRepository.findById(teacherId).orElseThrow(() -> new ResourceNotFoundException("Teacher with given id not found !!"));
	}

	@Override
	public Teacher updateTeacher(Teacher teacher, Integer teacherId) {
		// TODO Auto-generated method stub
		teacher.setTeacherId(teacherId);
		return teacherRepository.save(teacher);
	}

	@Override
	public void deleteTeacher(Integer teacherId) {
		// TODO Auto-generated method stub
		teacherRepository.deleteById(teacherId);
	}

}
