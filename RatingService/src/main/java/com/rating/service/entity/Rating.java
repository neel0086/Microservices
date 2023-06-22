package com.rating.service.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document("Rating")
public class Rating {
    @Id
    private int ratingId;

    private int userId;
    private int hotelId;
    private int rating;
    private String feedback;




}
