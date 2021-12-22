package com.poc6.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc6.enity.Courses;
import com.poc6.enity.Rating;
import com.poc6.service.InterviewHelperService;
@CrossOrigin
@RestController
public class InterviewHelperController {
	@Autowired
	InterviewHelperService interviewHelperService;
	@GetMapping("/getRatings")
	public List<Rating> getRating()
	{
		return interviewHelperService.getRating();
		
	}
	
	@GetMapping("/getCourses")
	public List<Courses> getCourse()
	{
		return interviewHelperService.getCourse();
		
	}

}
