package com.hotel.service.controller;

import com.hotel.service.entity.Hotel;
import com.hotel.service.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/hotels")
public class HotelController {
    @Autowired
    private HotelService hotelService;
    @PostMapping
    public ResponseEntity<Hotel> createUser(@RequestBody Hotel hotel){
        Hotel hotel1 = hotelService.saveHotel(hotel);
        return ResponseEntity.status(HttpStatus.CREATED).body(hotel1);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Hotel> createUser(@PathVariable Long id){
        Hotel hotel1 = hotelService.getHotel(id);
        return ResponseEntity.ok(hotel1);
    }

    @GetMapping
    public ResponseEntity<List<Hotel>> getAllUser(){
        List<Hotel> hotel1 = hotelService.getAllHotel();
        return ResponseEntity.ok(hotel1);
    }
}
