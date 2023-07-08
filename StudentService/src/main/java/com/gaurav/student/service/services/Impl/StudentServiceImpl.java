package com.gaurav.student.service.services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gaurav.student.service.entities.Student;
import com.gaurav.student.service.exception.ResourceNotFoundException;
import com.gaurav.student.service.repository.StudentRepository;
import com.gaurav.student.service.services.StudentService;
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	
	@Override
	public Student createStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Student getSingleStudent(Integer studentId) {
		// TODO Auto-generated method stub
		return studentRepository.findById(studentId).orElseThrow(() -> new ResourceNotFoundException("User with given id is not found on server !! : "+studentId));
	}

	@Override
	public Student updateStudent(Student student, Integer studentId) {
		// TODO Auto-generated method stub
		student.setStudentid(studentId);
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudent(Integer studentId) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(studentId);
	}

}
