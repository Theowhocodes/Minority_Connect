package com.techelevator.model;

public class Message {
    private int id;
    private int sender;
    private int recipient;
    private String content;

    public Message() {}

    public Message(int id, int sender, int recipient, String content) {
        this.id = id;
        this.sender = sender;
        this.recipient = recipient;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSender() {
        return sender;
    }

    public void setSender(int sender) {
        this.sender = sender;
    }

    public int getRecipient() {
        return recipient;
    }

    public void setRecipient(int recipient) {
        this.recipient = recipient;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", sender='" + sender + '\'' +
                ", recipient=" + recipient +
                ", content=" + content +
                '}';
    }
}
