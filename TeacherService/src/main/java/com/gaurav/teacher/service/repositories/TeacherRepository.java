package com.gaurav.teacher.service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gaurav.teacher.service.entitites.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer>{

}
