package com.example.textapp.controller;

import com.example.textapp.entity.TextData;
import com.example.textapp.repository.TextDataRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TextController {

    private final TextDataRepository repository;

    public TextController(TextDataRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/save")
    public String saveText(@RequestParam String content) {
        repository.save(new TextData(content));
        return "redirect:/view";
    }

    @GetMapping("/view")
    public String viewData(Model model) {
        model.addAttribute("items", repository.findAll());
        return "view";
    }
}