package com.example.rating.repository;
 
import java.util.List;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
import com.example.rating.entity.RatingApp;
@Repository
public interface RatingRepository extends JpaRepository<RatingApp,String> {
	// costom finder methods
	List<RatingApp> findByUserId(String userId);
	List<RatingApp> findByHotelId(String id);

 
}