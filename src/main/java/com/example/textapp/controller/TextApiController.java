package com.example.textapp.controller;

import com.example.textapp.entity.TextData;
import com.example.textapp.model.TextDataRequest;
import com.example.textapp.model.TextDataResponse;
import com.example.textapp.repository.TextDataRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/simple/text")
public class TextApiController {

    private final TextDataRepository repository;

    public TextApiController(TextDataRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public ResponseEntity<TextDataResponse> saveText(@RequestBody TextDataRequest request) {
        TextData saved = repository.save(new TextData(request.getContent()));
        return ResponseEntity.ok(mapToResponse(saved));
    }

    @GetMapping
    public ResponseEntity<List<TextDataResponse>> getAllText() {
        List<TextDataResponse> response = repository.findAll()
                .stream()
                .map(this::mapToResponse)
                .toList();

        return ResponseEntity.ok(response);
    }

    private TextDataResponse mapToResponse(TextData textData) {
        return new TextDataResponse(textData.getId(), textData.getContent());
    }
}