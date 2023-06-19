package com.hotel.service.services;

import com.hotel.service.entity.Hotel;
import com.hotel.service.entity.Hotel;

import java.util.List;

public interface HotelService {
    Hotel saveHotel(Hotel hotel);

    List<Hotel> getAllHotel();

    Hotel getHotel(Long id);
}
