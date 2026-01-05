package com.example.rating.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
 
import org.springframework.http.ResponseEntity;
 
import org.springframework.web.bind.annotation.*;
import com.example.rating.entity.RatingApp;
 
import com.example.rating.service.RatingService;
@RestController
 
@RequestMapping("/ratings")
 
public class RatingController {
    @Autowired
 
    private RatingService ratingService;

    // create rating
 
    @PostMapping("/create")
 
    public ResponseEntity<RatingApp> create(@RequestBody RatingApp ratingApp) {
 
        return ResponseEntity.ok(ratingService.create(ratingApp));
 
    }

    // get all ratings
 
    @GetMapping("/allRatings")
 
    public ResponseEntity<List<RatingApp>> getAll() {
 
        return ResponseEntity.ok(ratingService.getAllRating());
 
    }

    // get by user id (used by user-service)
 
    @GetMapping("/users/{userId}")
 
    public ResponseEntity<List<RatingApp>> getByUserId(@PathVariable String userId) {
 
        return ResponseEntity.ok(ratingService.getRatingByUserId(userId));
 
    }

    // get by hotel id (used by hotel service)
 
    @GetMapping("/hotels/{hotelId}")
 
    public ResponseEntity<List<RatingApp>> getByHotelId(@PathVariable String hotelId) {
 
        return ResponseEntity.ok(ratingService.getRatingByHotelId(hotelId));
 
    }
 
}
 