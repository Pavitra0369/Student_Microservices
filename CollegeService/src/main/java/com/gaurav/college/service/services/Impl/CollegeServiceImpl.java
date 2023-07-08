package com.gaurav.college.service.services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gaurav.college.service.entities.College;
import com.gaurav.college.service.exception.ResourceNotFoundException;
import com.gaurav.college.service.repositories.CollegeRepository;
import com.gaurav.college.service.services.CollegeService;
@Service
public class CollegeServiceImpl implements CollegeService {

	@Autowired
	private CollegeRepository collegeRepository;
	
	@Override
	public College createCollege(College college) {
		// TODO Auto-generated method stub
		return collegeRepository.save(college);
	}

	@Override
	public List<College> getAllCollege() {
		// TODO Auto-generated method stub
		return collegeRepository.findAll();
	}

	@Override
	public College getSingleCollege(Integer collegeId) {
		// TODO Auto-generated method stub
		return collegeRepository.findById(collegeId).orElseThrow(() -> new ResourceNotFoundException("College with given id not found !!"));
	}

	@Override
	public College updateCollege(College college, Integer collegeId) {
		// TODO Auto-generated method stub
		college.setCollegeId(collegeId);
		return collegeRepository.save(college);
	}

	@Override
	public void deleteCollege(Integer collegeId) {
		// TODO Auto-generated method stub
		collegeRepository.deleteById(collegeId);
	}

}
