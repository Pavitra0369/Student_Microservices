package com.gaurav.college.service.services;

import java.util.List;

import com.gaurav.college.service.entities.College;

public interface CollegeService {
	// create college
	College createCollege(College college);
	
	// get all college
	List<College> getAllCollege();
	
	// get single college
	College getSingleCollege(Integer collegeId);
	
	// update college
	College updateCollege(College college, Integer collegeId);
	
	// delete college
	void deleteCollege(Integer collegeId);
}
