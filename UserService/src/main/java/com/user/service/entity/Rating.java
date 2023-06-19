package com.user.service.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Rating {
    private Long ratingId;
    private Long id;
    private Long hotelId;
    private int rating;
    private String feedback;
}
