package com.techelevator.dao;

import com.techelevator.model.Message;
import com.techelevator.model.MessageDto;

import java.util.List;

public interface MessageDao {

    List<MessageDto> userMessages (int userId);

}
