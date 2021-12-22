package com.poc6.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc6.enity.Courses;
import com.poc6.enity.Rating;
import com.poc6.repository.CourseRepository;
import com.poc6.repository.RatingRepository;

@Service
public class InterviewHelperService {

	@Autowired
	CourseRepository courseRepository;
	@Autowired
	RatingRepository ratingRepository;
	
	public List<Courses> getCourse()
	{
		List<Courses> courses=courseRepository.findAll();
		return courses;
	}
	
	public List<Rating> getRating()
	{
		List<Rating> ratings=ratingRepository.findAll();
		return ratings;
	}
}
