package com.gaurav.rating.service.services;

import java.util.List;

import com.gaurav.rating.service.entities.Rating;

public interface RatingService {
	
	// create rating
	Rating createRating(Rating rating);
	
	// get all rating
	List<Rating> getAllRating();
	
	// get single rating by id
	Rating getRatingById(Integer ratingId);
	
	// update rating
	Rating updateRating(Rating rating, Integer ratingId);
	
	// delete rating
	void deleteRating(Integer ratingId);
	
	// get rating by student id
	List<Rating> getRatingByStudentId(Integer studentId);
	
	// get rating by college id
	List<Rating> getRatingByCollegeId(Integer collegeId);
	
}
