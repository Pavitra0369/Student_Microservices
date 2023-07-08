package com.gaurav.rating.service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gaurav.rating.service.entities.Rating;
import java.util.List;


public interface RatingRepository extends JpaRepository<Rating, Integer> {
	List<Rating> findByStudentId(int studentId);
	List<Rating> findByCollegeId(int collegeId);
}
