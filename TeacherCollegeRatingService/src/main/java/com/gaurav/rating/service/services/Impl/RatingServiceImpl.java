package com.gaurav.rating.service.services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gaurav.rating.service.entities.Rating;
import com.gaurav.rating.service.repositories.RatingRepository;
import com.gaurav.rating.service.services.RatingService;
@Service
public class RatingServiceImpl implements RatingService {

	@Autowired
	private RatingRepository ratingRepository;
	
	@Override
	public Rating createRating(Rating rating) {
		// TODO Auto-generated method stub
		return ratingRepository.save(rating);
	}

	@Override
	public List<Rating> getAllRating() {
		// TODO Auto-generated method stub
		return ratingRepository.findAll();
	}

	@Override
	public Rating getRatingById(Integer ratingId) {
		// TODO Auto-generated method stub
		return ratingRepository.findById(ratingId).get();
	}

	@Override
	public Rating updateRating(Rating rating, Integer ratingId) {
		// TODO Auto-generated method stub
		rating.setRatingId(ratingId);
		return ratingRepository.save(rating);
	}

	@Override
	public void deleteRating(Integer ratingId) {
		// TODO Auto-generated method stub
		ratingRepository.deleteById(ratingId);

	}

	@Override
	public List<Rating> getRatingByTeacherId(Integer teacherId) {
		// TODO Auto-generated method stub
		return ratingRepository.findByTeacherId(teacherId);
	}

	@Override
	public List<Rating> getRatingByCollegeId(Integer collegeId) {
		// TODO Auto-generated method stub
		return ratingRepository.findByCollegeId(collegeId);
	}

}
