package com.example.rating.entity;
 


//import com.example.rating.dto.HotelDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
 
@Entity
@Table(name = "ratings")
public class RatingApp {
	@Id
	private String ratingId;
	
	
	private String userId;
	
	
	private String hotelId;
	 
	 
	private int rating;
	private String feedback;
	
//	@Transient 
//	private HotelDto hotel;
	
	
	public String getRatingId() {
		return ratingId;
	}
	public void setRatingId(String ratingId) {
		this.ratingId = ratingId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getHotelId() {
		return hotelId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public RatingApp(String ratingId, String userId, String id, int rating, String feedback) {
		super();
		this.ratingId = ratingId;
		this.userId = userId;
		this.hotelId = id;
		this.rating = rating;
		this.feedback = feedback;
	}
	public RatingApp() {
	}
//	public HotelDto getHotel() { 
//		return hotel; 
//		} 
//	public void setHotel(HotelDto hotel) { 
//		this.hotel = hotel; 
//		}
	

 
}