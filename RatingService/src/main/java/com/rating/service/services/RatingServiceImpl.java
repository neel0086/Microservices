package com.rating.service.services;

import com.rating.service.entity.Rating;
import com.user.service.exception.ResourceNotFoundException;
import com.rating.service.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRepository ratingRepository;
    @Override
    public Rating saveRating(Rating rating) {
        return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> getAllRating() {
        return ratingRepository.findAll();
    }

    @Override
    public Rating getRating(Long id) {
        return ratingRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Given user not found"));
    }
}
