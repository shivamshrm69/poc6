package com.poc6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poc6.enity.Rating;

public interface RatingRepository extends JpaRepository<Rating, Integer> {

}
