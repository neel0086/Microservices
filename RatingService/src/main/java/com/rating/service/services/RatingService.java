package com.rating.service.services;

import com.rating.service.entity.Rating;

import java.util.List;

public interface RatingService {
    Rating saveRating(Rating rating);

    List<Rating> getAllRating();

    List<Rating> getRatingByUserId(Long userId);

    List<Rating> getRatingByHotelId(Long hotelId);
}
