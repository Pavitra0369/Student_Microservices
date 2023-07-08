package com.gaurav.college.service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gaurav.college.service.entities.College;

public interface CollegeRepository extends JpaRepository<College, Integer> {

}
