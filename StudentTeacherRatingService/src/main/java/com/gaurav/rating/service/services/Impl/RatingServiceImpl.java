package com.gaurav.rating.service.services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gaurav.rating.service.entities.Rating;
import com.gaurav.rating.service.repositories.RatingRepositories;
import com.gaurav.rating.service.services.RatingService;
@Service
public class RatingServiceImpl implements RatingService {

	@Autowired
	private RatingRepositories ratingRepositories;
	
	@Override
	public Rating createRating(Rating rating) {
		// TODO Auto-generated method stub
		return ratingRepositories.save(rating);
	}

	@Override
	public List<Rating> getAllRating() {
		// TODO Auto-generated method stub
		return ratingRepositories.findAll();
	}

	@Override
	public Rating getRatingById(Integer ratingId) {
		// TODO Auto-generated method stub
		return ratingRepositories.findById(ratingId).get();
	}

	@Override
	public Rating updateRating(Rating rating, Integer ratingId) {
		// TODO Auto-generated method stub
		rating.setRatingId(ratingId);
		return ratingRepositories.save(rating);
	}

	@Override
	public void deleteRating(Integer ratingId) {
		// TODO Auto-generated method stub
		ratingRepositories.deleteById(ratingId);
	}

	@Override
	public List<Rating> getRatingByStudentId(Integer studentId) {
		// TODO Auto-generated method stub
		return ratingRepositories.findByStudentId(studentId);
	}

	@Override
	public List<Rating> getRatingByTeacherId(Integer teacherId) {
		// TODO Auto-generated method stub
		return ratingRepositories.findByTeacherId(teacherId);
	}

}
