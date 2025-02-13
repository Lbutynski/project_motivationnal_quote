package com.example.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.model.Quote;
import com.example.backend.service.QuoteService;

@RestController
public class QuoteController {
  @GetMapping("getQuote")
  public String getQuote() {
    return "Hello World";
  }

}
