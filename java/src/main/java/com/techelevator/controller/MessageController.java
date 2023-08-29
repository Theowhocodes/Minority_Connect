package com.techelevator.controller;

import com.techelevator.dao.MessageDao;
import com.techelevator.dao.UserDao;
import com.techelevator.model.Message;
import com.techelevator.model.MessageDto;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@Component
public class MessageController {
    @Autowired
    private MessageDao messageDao;

    @GetMapping("/api/messages/{userId}")
    public List<MessageDto> userMessages(@PathVariable("userId")int userId){
        return messageDao.userMessages(userId);
    }
}
