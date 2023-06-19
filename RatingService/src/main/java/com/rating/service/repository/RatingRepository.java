package com.rating.service.repository;

import com.rating.service.entity.Rating;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RatingRepository extends MongoRepository<Rating,Long> {
}
