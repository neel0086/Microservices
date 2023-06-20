package com.rating.service.controller;

import com.rating.service.entity.Rating;
import com.rating.service.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/ratings")
public class RatingController {
    @Autowired
    private RatingService ratingService;
    @PostMapping
    public ResponseEntity<Rating> createRating(@RequestBody Rating rating){
        Rating rating1 = ratingService.saveRating(rating);
        return ResponseEntity.status(HttpStatus.CREATED).body(rating1);
    }

    @GetMapping
    public ResponseEntity<List<Rating>> getAllRating(){
        List<Rating> rating1 = ratingService.getAllRating();
        return ResponseEntity.ok(rating1);
    }
    @GetMapping("/users/{userId}")

    public ResponseEntity<List<Rating>> getAllByUserId(@PathVariable Long userId){
        List<Rating> rating1 = ratingService.getRatingByUserId(userId);
        return ResponseEntity.ok(rating1);
    }
    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<Rating>> getAllRating(@PathVariable Long hotelId){
        List<Rating> rating1 = ratingService.getRatingByHotelId(hotelId);
        return ResponseEntity.ok(rating1);
    }
}
