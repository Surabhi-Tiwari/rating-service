package com.example.rating.serviceimpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.rating.entity.RatingApp;
import com.example.rating.repository.RatingRepository;
import com.example.rating.service.RatingService;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRepository ratingRepository;

    // ✅ KEEP RestTemplate (UserService will call RatingService)
    @Autowired
    private RestTemplate restTemplate;

    // ================= CREATE RATING =================
    @Override
    public RatingApp create(RatingApp ratingApp) {

        ratingApp.setRatingId(UUID.randomUUID().toString());
        return ratingRepository.save(ratingApp);
    }

    // ================= GET ALL RATINGS =================
    @Override
    public List<RatingApp> getAllRating() {
        return ratingRepository.findAll();
    }

    // ================= GET RATINGS BY USER ID (ORIGINAL LOGIC) =================
    @Override
    public List<RatingApp> getRatingByUserId(String userId) {

        // ✅ ONLY DB CALL
        // ❌ NO HOTEL SERVICE CALL HERE
        return ratingRepository.findByUserId(userId);
    }

    // ================= GET RATINGS BY HOTEL ID =================
    @Override
    public List<RatingApp> getRatingByHotelId(String hotelId) {
        return ratingRepository.findByHotelId(hotelId);
    }
}
