package com.example.textapp.model;

public class TextDataResponse {
    private Long id;
    private String content;

    public TextDataResponse() {
    }

    public TextDataResponse(Long id, String content) {
        this.id = id;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}