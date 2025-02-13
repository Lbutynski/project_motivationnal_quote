package com.example.backend.repository;

import org.springframework.stereotype.Repository;

import com.example.backend.model.Quote;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface QuoteRepository extends JpaRepository<Quote, Integer> {

  @Query(value = "SELECT * FROM quote ORDER BY RAND() LIMIT 1", nativeQuery = true)
  Quote getRandomQuote();
}
