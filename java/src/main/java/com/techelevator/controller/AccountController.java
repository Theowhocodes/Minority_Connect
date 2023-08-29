package com.techelevator.controller;

import com.techelevator.dao.BusinessDao;
import com.techelevator.dao.UserDao;
import com.techelevator.model.BusinessDto;
import com.techelevator.model.User;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class AccountController {
    @Autowired
    private BusinessDao businessDao;
    @Autowired
    private UserDao userDao;

    @GetMapping("/api/businesses")
    public List<BusinessDto>viewAll(){

        return businessDao.displayAll();
    }

    @GetMapping("/api/businesses/{userId}")
    public List<BusinessDto>userOwned(@PathVariable("userId")int userId){
        return businessDao.findUserOwnedBusinesses(userId);
    }

    @GetMapping("/api/businesses/category/{businessCategory}")
    public List<BusinessDto>businessesByCategory(@PathVariable("businessCategory")String businessCategory){

        return businessDao.findByCategory(businessCategory);
    }

    @GetMapping("/api/users")
    public List<User> allUsers(){

        return userDao.publicUserDisplay();
    }








}
