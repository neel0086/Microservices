package com.user.service.controller;

import com.user.service.entity.User;
import com.user.service.services.UserService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        User user1 = userService.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }

    @GetMapping("/{id}")
    @CircuitBreaker(name="hotelRatingBreaker",fallbackMethod = "hotelRatingFallback")
    public ResponseEntity<User> createUser(@PathVariable Long id){
        User user1 = userService.getUser(id);
        return ResponseEntity.ok(user1);
    }

    public ResponseEntity<User> hotelRatingFallback(Long userId,Exception ex){
//        logger.info("Fallback is executed because service is down",ex.getMessage());
        User user  =  User.builder()
                .email("unknown@gmail.com")
                .name("unknown")
                .about("Service is down")
                .userId(Long.valueOf(123)).build();
        return new ResponseEntity<>(user,HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUser(){
        List<User> user1 = userService.getAllUser();
        return ResponseEntity.ok(user1);
    }
}
