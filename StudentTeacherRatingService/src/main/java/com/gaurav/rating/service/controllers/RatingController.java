package com.gaurav.rating.service.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gaurav.rating.service.entities.Rating;
import com.gaurav.rating.service.services.RatingService;

@RestController
public class RatingController {
	
	@Autowired
	private RatingService ratingService;
	
	// create rating
	@PostMapping("/ratings")
	public ResponseEntity<Rating> createRating(@RequestBody Rating rating){
		Rating createRating = ratingService.createRating(rating);
		return ResponseEntity.status(HttpStatus.CREATED).body(createRating);
	}
	
	// get all rating
	@GetMapping("/ratings")
	public ResponseEntity<List<Rating>> getAllRating(){
		List<Rating> allRating = ratingService.getAllRating();
		return ResponseEntity.ok(allRating);
	}
	
	// get single rating by id
	@GetMapping("/ratings/{ratingId}")
	public ResponseEntity<Rating> getRatingById(@PathVariable Integer ratingId){
		Rating ratingById = ratingService.getRatingById(ratingId);
		return ResponseEntity.ok(ratingById);
	}
	
	// update rating
	@PutMapping("/ratings/{ratingId}")
	public ResponseEntity<Rating> updateRating(@RequestBody Rating rating, @PathVariable Integer ratingId){
		Rating updateRating = ratingService.updateRating(rating, ratingId);
		return ResponseEntity.status(HttpStatus.CREATED).body(updateRating);
	}
	
	// delete rating
	@DeleteMapping("/ratings/{ratingId}")
	public void deleteRating(@PathVariable Integer ratingId) {
		ratingService.deleteRating(ratingId);
	}
	
	// get rating by student id
	@GetMapping("/ratings/{studentId}")
	public ResponseEntity<List<Rating>> getRatingByStudentId(@PathVariable Integer studentId){
		List<Rating> ratingByStudentId = ratingService.getRatingByStudentId(studentId);
		return ResponseEntity.ok(ratingByStudentId);
	}
	
	// get rating by teacher id
	@GetMapping("/ratings/{teacherId}")
	public ResponseEntity<List<Rating>> getRatingByTeacherId(@PathVariable Integer teacherId){
		List<Rating> ratingByTeacherId = ratingService.getRatingByTeacherId(teacherId);
		return ResponseEntity.ok(ratingByTeacherId);
	}
}
