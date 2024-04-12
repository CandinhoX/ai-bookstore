package com.bookstore.ai.controllers;

import org.springframework.ai.openai.OpenAiChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookstore")
public class BookStoreAssistantController {

    @Autowired
    private OpenAiChatClient chatClient;

    @GetMapping("/informations")
    public String bookstoreChat(@RequestParam(value = "message", defaultValue = "Quais os livros best sellers de 2024?")String message){
        return chatClient.call(message); 
    }

}
