package com.techelevator.dao;

import com.techelevator.model.Message;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import java.util.ArrayList;
import java.util.List;

public class JdbcMessageDao implements MessageDao{

    private final JdbcTemplate jdbcTemplate;

    public JdbcMessageDao(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    @Override
    public List<Message> userMessages (int userId) {

        List<Message> messagesToUserX = new ArrayList<>();

        String sql = "SELECT * FROM messages " ;

        SqlRowSet rowSet = jdbcTemplate.queryForRowSet(sql);
        while (rowSet.next()){
            Message message = mapRowToMessage(rowSet);
            messagesToUserX.add(message);
        }
        return messagesToUserX;
    }


    private Message mapRowToMessage(SqlRowSet rowSet){
        Message message = new Message();
        message.setId(rowSet.getInt("message_id"));
        message.setRecipient(rowSet.getInt("recipient"));
        message.setSender(rowSet.getInt("sender"));
        message.setContent(rowSet.getString("content"));

        return message;
    }
}
