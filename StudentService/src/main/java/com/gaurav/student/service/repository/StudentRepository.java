package com.gaurav.student.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gaurav.student.service.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
