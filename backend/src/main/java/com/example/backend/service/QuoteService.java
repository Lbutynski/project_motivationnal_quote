package com.example.backend.service;

import org.springframework.stereotype.Service;

import com.example.backend.repository.QuoteRepository;

@Service
public class QuoteService {

  private final QuoteRepository quoteRepository;

  public QuoteService(QuoteRepository quoteRepository) {
    this.quoteRepository = quoteRepository;
  }

  public String getRandomQuote() {
    return quoteRepository.getRandomQuote().getQuote();
  }
}
