package com.example.textapp.model;

public class TextDataRequest {
    private String content;

    public TextDataRequest() {
    }

    public TextDataRequest(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}