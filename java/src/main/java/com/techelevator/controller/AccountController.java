package com.techelevator.controller;

import com.techelevator.dao.BusinessDao;
import com.techelevator.dao.UserDao;
import com.techelevator.model.Business;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@CrossOrigin
public class AccountController {
    @Autowired
    private BusinessDao businessDao;
    @Autowired
    private UserDao userDao;

    @GetMapping("/businesses")
    public List<Business> viewAll(){
        return businessDao.displayAll();
    }








}
