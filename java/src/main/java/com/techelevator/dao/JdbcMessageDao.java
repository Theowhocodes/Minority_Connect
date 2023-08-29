package com.techelevator.dao;

import com.techelevator.model.Message;
import com.techelevator.model.MessageDto;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcMessageDao implements MessageDao{

    private final JdbcTemplate jdbcTemplate;

    public JdbcMessageDao(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    @Override
    public List<MessageDto> userMessages (int userId) {
        List<MessageDto> messagesToUserX = new ArrayList<>();
        String sql = "Select * from messages where recipient = ?;";

        SqlRowSet rowSet = jdbcTemplate.queryForRowSet(sql, userId);
        while (rowSet.next()){
            MessageDto messageDto = mapRowToMessage(rowSet);
            messagesToUserX.add(messageDto);
        }
        return messagesToUserX;
    }


    private MessageDto mapRowToMessage(SqlRowSet rowSet){
        MessageDto message = new MessageDto();
        message.setId(rowSet.getInt("message_id"));
        message.setRecipient(rowSet.getInt("recipient"));
        message.setSender(rowSet.getInt("sender"));
        message.setContent(rowSet.getString("content"));

        return message;
    }
}
