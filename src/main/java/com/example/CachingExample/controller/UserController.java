package com.example.CachingExample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CachingExample.controller.entity.UserEntity;
import com.example.CachingExample.service.UserService;

@RestController
public class UserController {
	

	   @Autowired
	    private UserService userService;

	    @GetMapping("/users")
	    public List<UserEntity> getAllUsers() {
	        System.out.println("Request received to the controller");
	        return userService.getAllUsers() ;
	    }
	
}
