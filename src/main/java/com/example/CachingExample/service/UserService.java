package com.example.CachingExample.service;

import java.util.List;

import org.ehcache.CacheManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.CachingExample.UserRepo.UserRepository;
import com.example.CachingExample.controller.entity.UserEntity;


@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Cacheable("allUserCache")
    public List<UserEntity> getAllUsers() {
        System.out.println("Getting All the users from DB!");
        return userRepository.findAll();
    }
}