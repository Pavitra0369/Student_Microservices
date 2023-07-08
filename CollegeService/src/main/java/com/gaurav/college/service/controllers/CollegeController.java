package com.gaurav.college.service.controllers;

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

import com.gaurav.college.service.entities.College;
import com.gaurav.college.service.services.CollegeService;

@RestController
public class CollegeController {
	
	@Autowired
	private CollegeService collegeService;
	
	// create college 
	@PostMapping("/colleges")
	public ResponseEntity<College> createCollege(@RequestBody College college){
		College createCollege = collegeService.createCollege(college);
		return ResponseEntity.status(HttpStatus.CREATED).body(createCollege);
	}
	
	// get all college
	@GetMapping("/colleges")
	public ResponseEntity<List<College>> getAllCollege(){
		List<College> allCollege = collegeService.getAllCollege();
		return ResponseEntity.ok(allCollege);
	}
	
	// get single college
	@GetMapping("/colleges/{collegeId}")
	public ResponseEntity<College> getSingleCollege(@PathVariable Integer collegeId){
		College singleCollege = collegeService.getSingleCollege(collegeId);
		return ResponseEntity.ok(singleCollege);
	}
	
	// update collgege
	@PutMapping("/colleges/{collegeId}")
	public ResponseEntity<College> updateCollege(@RequestBody College college, @PathVariable Integer collegeId){
		College updateCollege = collegeService.updateCollege(college, collegeId);
		return ResponseEntity.status(HttpStatus.CREATED).body(updateCollege);
	}
	
	// delete college
	@DeleteMapping("/colleges/{collegeId}")
	public void deleteCollege(@PathVariable Integer collegeId) {
		collegeService.deleteCollege(collegeId);
	}
	
	
}
