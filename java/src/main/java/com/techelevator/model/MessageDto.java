package com.techelevator.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MessageDto {

    @JsonProperty("message_id")
    private int id;

    @JsonProperty("content")
    private String content;

    @JsonProperty("recipient")
    private int recipient;

    @JsonProperty("sender")
    private int sender;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getRecipient() {
        return recipient;
    }

    public void setRecipient(int recipient) {
        this.recipient = recipient;
    }

    public int getSender() {
        return sender;
    }

    public void setSender(int sender) {
        this.sender = sender;
    }
}
