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
    public ResponseEntity<Rating> createUser(@RequestBody Rating rating){
        Rating rating1 = ratingService.saveRating(rating);
        return ResponseEntity.status(HttpStatus.CREATED).body(rating1);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Rating> createUser(@PathVariable Long id){
        Rating rating1 = ratingService.getRating(id);
        return ResponseEntity.ok(rating1);
    }

    @GetMapping
    public ResponseEntity<List<Rating>> getAllUser(){
        List<Rating> rating1 = ratingService.getAllRating();
        return ResponseEntity.ok(rating1);
    }
}
