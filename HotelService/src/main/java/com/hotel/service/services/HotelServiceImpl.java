package com.hotel.service.services;

import com.hotel.service.entity.Hotel;
import com.hotel.service.repository.HotelRepository;
import com.hotel.service.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;
    @Override
    public Hotel saveHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAllHotel() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel getHotel(Long id) {
        return hotelRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Given user not found"));
    }
}
