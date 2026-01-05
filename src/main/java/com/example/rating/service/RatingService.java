package com.example.rating.service;
 
import java.util.List;
 
import com.example.rating.entity.RatingApp;
 
public interface RatingService {
 
	// create
	RatingApp create(RatingApp ratingApp);
	// get all rating
	List<RatingApp>getAllRating();
	
	// get all by user id
	List<RatingApp>getRatingByUserId(String  userId);
	
	//get all by hotel id
	List<RatingApp>getRatingByHotelId(String id);
}