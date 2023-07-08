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
	
	// get rating by teacher Id
	List<Rating> getRatingByTeacherId(Integer teacherId);
	
	// get rating by college Id
	List<Rating> getRatingByCollegeId(Integer collegeId);
	
	
}
